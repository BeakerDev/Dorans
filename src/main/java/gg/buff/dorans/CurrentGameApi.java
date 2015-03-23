package gg.buff.dorans;

import gg.buff.dorans.annotations.RateLimitted;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.objects.generated.current_game.CurrentGame;
import gg.buff.dorans.query.QueryConstants;

public class CurrentGameApi extends CommonApi {
	private static final String VERSION = "v1.0";

	public CurrentGameApi(Dorans parent) {
		super(parent);
	}

	/**
	 * Method to get the current game information for a summoner
	 *
	 * @param sumnmonerId id of the summer as a {@link java.lang.Long}
	 * @return raw json current game info as {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getCurrentGameInfoRaw(Long sumnmonerId) throws DoransException {
		return getParent().getQuery().observerQuery(new StringBuilder("consumer/getSpectatorGameInfo/").append(getParent().getRegion().getPlatformId()).append(QueryConstants.SEPARATOR).append(sumnmonerId).toString());
	}

	/**
	 * Method to get the current game information for a summoner
	 *
	 * @param summonerId id of the summer as a {@link java.lang.Long}
	 * @return current game info as {@link gg.buff.dorans.objects.generated.current_game.CurrentGame}
	 * @throws DoransException
	 */
	@RateLimitted
	public CurrentGame getCurrentGameInfo(Long summonerId) throws DoransException {
		return getParent().getGson().fromJson(getCurrentGameInfoRaw(summonerId), CurrentGame.class);
	}
}
