package gg.buff.dorans;

import com.google.gson.reflect.TypeToken;
import gg.buff.dorans.annotations.RateLimitted;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.exceptions.InvalidParameterException;
import gg.buff.dorans.objects.generated.summoner.MasteryPage;
import gg.buff.dorans.objects.generated.summoner.MasteryPages;
import gg.buff.dorans.objects.generated.summoner.RunePages;
import gg.buff.dorans.objects.generated.summoner.Summoner;
import gg.buff.dorans.query.QueryUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SummonerApi {
	private static final String VERSION = "v1.4";
	private final Dorans parent;

	private final Type typeMapStringSummoner = new TypeToken<Map<String, Summoner>>() {
	}.getType();
	private final Type typeMapLongSummoner = new TypeToken<Map<Long, Summoner>>() {
	}.getType();
	private final Type typeMapLongMasteryPages = new TypeToken<Map<Long, MasteryPages>>() {
	}.getType();
	private final Type typeMapLongString = new TypeToken<Map<Long, String>>() {
	}.getType();
	private final Type typeMapLongRunePages = new TypeToken<Map<Long, RunePages>>() {
	}.getType();

	protected SummonerApi(Dorans parent) {
		this.parent = parent;
	}

	/**
	 * The response object contains the summoner objects mapped by the standardized summoner name,
	 * which is the summoner name in all lower case and with spaces removed. Use this version of the
	 * name when checking if the returned object contains the data for a given summoner. This API will
	 * also accept standardized summoner names as valid parameters, although they are not required.
	 *
	 * @param summoners {@link java.util.List} of summoner names as a {@link java.lang.String}
	 * @return raw json map of standardized summoner names to their summoner objects as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getSummonersByNameRaw(List<String> summoners) throws DoransException {
		List<String> standardizedSummonders = QueryUtils.standardizeSummonerName(summoners);

		String summonerList;
		if (standardizedSummonders.size() == 0) {
			throw new InvalidParameterException("Zero summoners is not allowed");
		} else if (standardizedSummonders.size() == 1) {
			summonerList = standardizedSummonders.get(0);
		} else if (standardizedSummonders.size() > 40) {
			throw new InvalidParameterException("Method limited to 40 summoner names per query");
		} else {
			summonerList = StringUtils.join(standardizedSummonders, ",");
		}

		return parent.getQuery().query(new StringBuilder(VERSION).append("/summoner/by-name/").append(summonerList).toString());
	}

	/**
	 * The response object contains the summoner objects mapped by the standardized summoner name,
	 * which is the summoner name in all lower case and with spaces removed. Use this version of the
	 * name when checking if the returned object contains the data for a given summoner. This API will
	 * also accept standardized summoner names as valid parameters, although they are not required.
	 *
	 * @param summoners {@link java.util.List} of summoner names as a {@link java.lang.String}
	 * @return {@link java.util.Map} of standardized summoner names as a {@link java.lang.String} linked
	 * to their {@link gg.buff.dorans.objects.generated.summoner.Summoner}
	 * @throws DoransException
	 */
	@RateLimitted
	public Map<String, Summoner> getSummonersByName(List<String> summoners) throws DoransException {
		return parent.getGson().fromJson(getSummonersByNameRaw(summoners), typeMapStringSummoner);
	}


	/**
	 * The response object contains the summoner objects mapped by the standardized summoner name,
	 * which is the summoner name in all lower case and with spaces removed. Use this version of the
	 * name when checking if the returned object contains the data for a given summoner. This API will
	 * also accept standardized summoner names as valid parameters, although they are not required.
	 *
	 * @param summoner summoner name as a {@link java.lang.String}
	 * @return raw json map of standardized summoner names to their summoner objects as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getSummonerByNameRaw(String summoner) throws DoransException {
		return getSummonersByNameRaw(Collections.singletonList(summoner));
	}

	/**
	 * The response object contains the summoner objects mapped by the standardized summoner name,
	 * which is the summoner name in all lower case and with spaces removed. Use this version of the
	 * name when checking if the returned object contains the data for a given summoner. This API will
	 * also accept standardized summoner names as valid parameters, although they are not required.
	 *
	 * @param summoner summoner name as a {@link java.lang.String}
	 * @return {@link gg.buff.dorans.objects.generated.summoner.Summoner}
	 * @throws DoransException
	 */
	@RateLimitted
	public Summoner getSummonerByName(String summoner) throws DoransException {
		Map<String, Summoner> result = getSummonersByName(Collections.singletonList(summoner));
		return result.entrySet().iterator().next().getValue();
	}

	/**
	 * Method to get Summoner objects from their IDs
	 *
	 * @param summonerIds {@link java.util.List} of summoner ids as {@link java.lang.Long}
	 * @return raw json map of summoner ids to their summoner objects as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getSummonersByIdRaw(List<Long> summonerIds) throws DoransException {
		String summonerList;
		if (summonerIds.size() == 0) {
			throw new InvalidParameterException("Zero summoners is not allowed");
		} else if (summonerIds.size() == 1) {
			summonerList = Long.toString(summonerIds.get(0));
		} else if (summonerIds.size() > 40) {
			throw new InvalidParameterException("Method limited to 40 summoner names per query");
		} else {
			summonerList = StringUtils.join(summonerIds, ",");
		}

		return parent.getQuery().query(new StringBuilder(VERSION).append("/summoner/").append(summonerList).toString());
	}

	/**
	 * Method to get Summoner objects from their IDs
	 *
	 * @param summonerIds {@link java.util.List} of summoner ids as {@link java.lang.Long}
	 * @return map of summoner ids to their summoner objects
	 * @throws DoransException
	 */
	@RateLimitted
	public Map<Long, Summoner> getSummonersById(List<Long> summonerIds) throws DoransException {
		return parent.getGson().fromJson(getSummonersByIdRaw(summonerIds), typeMapLongSummoner);
	}

	/**
	 * Method to get Summoner objects from their IDs
	 *
	 * @param summonerId summoner id as {@link java.lang.Long}
	 * @return raw json map of summoner ids to their summoner objects as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getSummonerByIdRaw(Long summonerId) throws DoransException {
		return getSummonersByIdRaw(Collections.singletonList(summonerId));
	}

	/**
	 * Method to get Summoner objects from their IDs
	 *
	 * @param summonerId summoner id as {@link java.lang.Long}
	 * @return {@link gg.buff.dorans.objects.generated.summoner.Summoner}
	 * @throws DoransException
	 */
	@RateLimitted
	public Summoner getSummonerById(Long summonerId) throws DoransException {
		return getSummonersById(Collections.singletonList(summonerId)).entrySet().iterator().next().getValue();
	}

	/**
	 * Method to get summoners mastery pages from their IDs
	 *
	 * @param summonerIds {@link java.util.List} of summoner ids as {@link java.lang.Long}
	 * @return raw json map of summoner id to mastery pages as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getMasteryPagesRaw(List<Long> summonerIds) throws DoransException {
		String summonerList;
		if (summonerIds.size() == 0) {
			throw new InvalidParameterException("Zero summoners is not allowed");
		} else if (summonerIds.size() == 1) {
			summonerList = Long.toString(summonerIds.get(0));
		} else if (summonerIds.size() > 40) {
			throw new InvalidParameterException("Method limited to 40 summoner names per query");
		} else {
			summonerList = StringUtils.join(summonerIds, ",");
		}

		return parent.getQuery().query(new StringBuilder(VERSION).append("/summoner/").append(summonerList).append("/masteries").toString());
	}

	/**
	 * Method to get summoners mastery pages from their IDs
	 *
	 * @param summonerIds {@link java.util.List} of summoner ids as {@link java.lang.Long}
	 * @return {@link java.util.Map} of summoner id as {@link java.lang.Long} to mastery pages 
	 * as {@link gg.buff.dorans.objects.generated.summoner.MasteryPages}
	 * @throws DoransException
	 */
	@RateLimitted
	public Map<Long, MasteryPage> getMasteryPages(List<Long> summonerIds) throws DoransException {
		return parent.getGson().fromJson(getMasteryPagesRaw(summonerIds), typeMapLongMasteryPages);
	}

	/**
	 * Method to get summoners mastery pages from their IDs
	 *
	 * @param summonerId summoner id as {@link java.lang.Long}
	 * @return raw json map of summoner id to mastery pages as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getMasteryPagesRaw(Long summonerId) throws DoransException {
		return getMasteryPagesRaw(Collections.singletonList(summonerId));
	}

	/**
	 * Method to get summoners mastery pages from their IDs
	 *
	 * @param summonerId summoner id as {@link java.lang.Long}
	 * @return {@link gg.buff.dorans.objects.generated.summoner.MasteryPages}
	 * @throws DoransException
	 */
	@RateLimitted
	public MasteryPage getMasteryPages(Long summonerId) throws DoransException {
		return getMasteryPages(Collections.singletonList(summonerId)).entrySet().iterator().next().getValue();
	}

	/**
	 * Method to get a summoners name from their summoner ID
	 *
	 * @param summonerIds {@link java.util.List} of summoner ids as {@link java.lang.Long}
	 * @return raw json map of summoner id to summoner name as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getSummonerNamesRaw(List<Long> summonerIds) throws DoransException {
		String summonerList;
		if (summonerIds.size() == 0) {
			throw new InvalidParameterException("Zero summoners is not allowed");
		} else if (summonerIds.size() == 1) {
			summonerList = Long.toString(summonerIds.get(0));
		} else if (summonerIds.size() > 40) {
			throw new InvalidParameterException("Method limited to 40 summoner names per query");
		} else {
			summonerList = StringUtils.join(summonerIds, ",");
		}

		return parent.getQuery().query(new StringBuilder(VERSION).append("/summoner/").append(summonerList).append("/names").toString());
	}

	/**
	 * Method to get a summoners name from their summoner ID
	 *
	 * @param summonerIds {@link java.util.List} of summoner ids as {@link java.lang.Long}
	 * @return raw json map of summoner id to summoner name as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public Map<Long, String> getSummonerNames(List<Long> summonerIds) throws DoransException {
		return parent.getGson().fromJson(getSummonerNamesRaw(summonerIds), typeMapLongString);
	}

	/**
	 * Method to get a summoners name from their summoner ID
	 *
	 * @param summonerId summoner ids as {@link java.lang.Long}
	 * @return raw json map of summoner id to summoner name as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getSummonerNameRaw(Long summonerId) throws DoransException {
		return getSummonerNamesRaw(Collections.singletonList(summonerId));
	}

	/**
	 * Method to get a summoners name from their summoner ID
	 *
	 * @param summonerId summoner ids as {@link java.lang.Long}
	 * @return summoner name as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getSummonerName(Long summonerId) throws DoransException {
		return getSummonerNames(Collections.singletonList(summonerId)).entrySet().iterator().next().getValue();
	}

	/**
	 * Method to get summoners rune pages from their IDs
	 *
	 * @param summonerIds {@link java.util.List} of summoner ids as {@link java.lang.Long}
	 * @return raw json map of summoner id to rune pages as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getRunePagesRaw(List<Long> summonerIds) throws DoransException {
		String summonerList;
		if (summonerIds.size() == 0) {
			throw new InvalidParameterException("Zero summoners is not allowed");
		} else if (summonerIds.size() == 1) {
			summonerList = Long.toString(summonerIds.get(0));
		} else if (summonerIds.size() > 40) {
			throw new InvalidParameterException("Method limited to 40 summoner names per query");
		} else {
			summonerList = StringUtils.join(summonerIds, ",");
		}

		return parent.getQuery().query(new StringBuilder(VERSION).append("/summoner/").append(summonerList).append("/masteries").toString());
	}

	/**
	 * Method to get summoners rune pages from their IDs
	 *
	 * @param summonerIds {@link java.util.List} of summoner ids as {@link java.lang.Long}
	 * @return {@link java.util.Map} of summoner id as {@link java.lang.Long} to rune pages
	 * as {@link gg.buff.dorans.objects.generated.summoner.RunePages}
	 * @throws DoransException
	 */
	@RateLimitted
	public Map<Long, RunePages> getRunePages(List<Long> summonerIds) throws DoransException {
		return parent.getGson().fromJson(getRunePagesRaw(summonerIds), typeMapLongRunePages);
	}

	/**
	 * Method to get summoners rune pages from their IDs
	 *
	 * @param summonerId summoner id as {@link java.lang.Long}
	 * @return raw json map of summoner id to rune pages as a {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getRunePagesRaw(Long summonerId) throws DoransException {
		return getRunePagesRaw(Collections.singletonList(summonerId));
	}

	/**
	 * Method to get summoners rune pages from their IDs
	 *
	 * @param summonerId summoner id as {@link java.lang.Long}
	 * @return {@link gg.buff.dorans.objects.generated.summoner.RunePages}
	 * @throws DoransException
	 */
	@RateLimitted
	public RunePages getRunePages(Long summonerId) throws DoransException {
		return getRunePages(Collections.singletonList(summonerId)).entrySet().iterator().next().getValue();
	}
}
