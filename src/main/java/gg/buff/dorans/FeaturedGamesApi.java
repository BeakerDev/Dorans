package gg.buff.dorans;

import gg.buff.dorans.annotations.RateLimitted;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.objects.generated.feature_games.FeaturedGames;

public class FeaturedGamesApi extends CommonApi {

	public FeaturedGamesApi(Dorans parent) {
		super(parent, "v1.0");
	}

	/**
	 * Method to get the featured games
	 *
	 * @return raw json of the featured games list as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getFeaturedGamesRaw() throws DoransException {
		return getParent().getQuery().observerQuery("featured");
	}

	/**
	 * Method to get the featured games
	 *
	 * @return featured games list as {@link gg.buff.dorans.objects.generated.feature_games.FeaturedGames}
	 * @throws DoransException
	 */
	@RateLimitted
	public FeaturedGames getFeaturedGames() throws DoransException {
		return getParent().getGson().fromJson(getFeaturedGamesRaw(), FeaturedGames.class);
	}
}
