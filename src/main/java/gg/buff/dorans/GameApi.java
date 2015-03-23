package gg.buff.dorans;

import gg.buff.dorans.annotations.RateLimitted;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.objects.generated.game.RecentGames;

public class GameApi {
	private static final String VERSION = "v1.3";
	private final Dorans parent;

	public GameApi(Dorans parent) {
		this.parent = parent;
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
		return parent.getQuery().query(new StringBuilder(VERSION).append("/game/by-summoner/").append(summonerId).append("/recent").toString());
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
		return parent.getGson().fromJson(getRecentGamesRaw(summonerId), RecentGames.class);
	}
}
