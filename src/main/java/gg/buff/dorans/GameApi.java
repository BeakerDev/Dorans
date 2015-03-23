package gg.buff.dorans;

import gg.buff.dorans.annotations.RateLimitted;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.objects.generated.game.RecentGames;

public class GameApi extends CommonApi {

	public GameApi(Dorans parent) {
		super(parent, "v1.3");
	}

	/**
	 * Method to get the last 10 games of the summoner. Includes all maps and all modes
	 *
	 * @param summonerId id of the summoner as a {@link java.lang.Long}
	 * @return raw json recent game list as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getRecentGamesRaw(Long summonerId) throws DoransException {
		return getParent().getQuery().query(new StringBuilder(getVersion()).append("/game/by-summoner/").append(summonerId).append("/recent").toString());
	}

	/**
	 * Method to get the last 10 games of the summoner. Includes all maps and all modes
	 *
	 * @param summonerId id of the summoner as a {@link java.lang.Long}
	 * @return game list as a {@link gg.buff.dorans.objects.generated.game.RecentGames}
	 * @throws DoransException
	 */
	@RateLimitted
	public RecentGames getRecentGames(Long summonerId) throws DoransException {
		return getParent().getGson().fromJson(getRecentGamesRaw(summonerId), RecentGames.class);
	}
}
