package gg.buff.dorans;

import gg.buff.dorans.annotations.RateLimitted;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.objects.generated.champion.Champion;
import gg.buff.dorans.objects.generated.champion.ChampionList;

import java.util.HashMap;
import java.util.Map;

public class ChampionApi {
	private static final String VERSION = "v1.4";
	private final Dorans parent;
	private final Map<String, String> freeToPlayMap = new HashMap<>();

	public ChampionApi(Dorans parent) {
		this.parent = parent;
		freeToPlayMap.put("freeToPlay", Boolean.toString(true));
	}

	/**
	 * Returns a list of all the champions
	 *
	 * @return raw json champions list as {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getChampionsRaw() throws DoransException {
		return parent.getQuery().query(new StringBuilder(VERSION).append("/champion").toString());
	}

	/**
	 * Returns a list of all the champions
	 *
	 * @return champions list as {@link gg.buff.dorans.objects.generated.champion.ChampionList}
	 * @throws DoransException
	 */
	@RateLimitted
	public ChampionList getChampions() throws DoransException {
		return parent.getGson().fromJson(getChampionsRaw(), ChampionList.class);
	}

	/**
	 * Returns a list of the free to play champions
	 *
	 * @return raw json champions list as {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getFreeToPlayChampionsRaw() throws DoransException {
		return parent.getQuery().query(new StringBuilder(VERSION).append("/champion").toString(), freeToPlayMap);
	}

	/**
	 * Returns a list of the free to play champions
	 *
	 * @return champions list as {@link gg.buff.dorans.objects.generated.champion.ChampionList}
	 * @throws DoransException
	 */
	@RateLimitted
	public ChampionList getFreeToPlayChampions() throws DoransException {
		return parent.getGson().fromJson(getFreeToPlayChampionsRaw(), ChampionList.class);
	}

	/**
	 * Method to get a champion from a champion's ID
	 *
	 * @param championId as a {@link java.lang.Long}
	 * @return raw jason champion object as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getChampionRaw(Long championId) throws DoransException {
		return parent.getQuery().query(new StringBuilder(VERSION).append("/champion/").append(championId).toString());
	}

	/**
	 * Method to get a champion from a champion's ID
	 *
	 * @param championId as a {@link java.lang.Long}
	 * @return champion as a {@link gg.buff.dorans.objects.generated.champion.Champion}
	 * @throws DoransException
	 */
	@RateLimitted
	public Champion getChampion(Long championId) throws DoransException {
		return parent.getGson().fromJson(getChampionRaw(championId), Champion.class);
	}

}
