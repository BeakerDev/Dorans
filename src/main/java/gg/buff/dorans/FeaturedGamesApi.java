package gg.buff.dorans;

import gg.buff.dorans.annotations.RateLimitted;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.objects.generated.feature_games.FeaturedGames;

public class FeaturedGamesApi {
	private static final String VERSION = "v1.0";
	private final Dorans parent;

	public FeaturedGamesApi(Dorans parent) {
		this.parent = parent;
	}

	/**
	 * Method to get the featured games
	 *
	 * @return raw json of the featured games list as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getFeaturedGamesRaw() throws DoransException {
		return parent.getQuery().observerQuery("featured");
	}

	/**
	 * Method to get the featured games
	 *
	 * @return featured games list as {@link gg.buff.dorans.objects.generated.feature_games.FeaturedGames}
	 * @throws DoransException
	 */
	@RateLimitted
	public FeaturedGames getFeaturedGames() throws DoransException {
		return parent.getGson().fromJson(getFeaturedGamesRaw(), FeaturedGames.class);
	}
}
