package gg.buff.dorans;

import com.google.gson.reflect.TypeToken;
import gg.buff.dorans.annotations.RateLimitted;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.exceptions.InvalidParameterException;
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

	protected SummonerApi(Dorans parent) {
		this.parent = parent;
	}

	/**
	 * The response object contains the summoner objects mapped by the standardized summoner name,
	 * which is the summoner name in all lower case and with spaces removed. Use this version of the
	 * name when checking if the returned object contains the data for a given summoner. This API will
	 * also accept standardized summoner names as valid parameters, although they are not required.
	 *
	 * @param summoners list of summoner names
	 * @return raw json map of standardized summoner names to their summoner objects
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
	 * @param summoners list of summoner names
	 * @return map of standardized summoner names to their summoner objects
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
	 * @param summoner summoner name
	 * @return raw json map of standardized summoner names to their summoner objects
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
	 * @param summoner summoner name
	 * @return summoner objects
	 * @throws DoransException
	 */
	@RateLimitted
	public Summoner getSummonerByName(String summoner) throws DoransException {
		Map<String, Summoner> result = getSummonersByName(Collections.singletonList(summoner));
		return result.entrySet().iterator().next().getValue();
	}

	/**
	 * The response object contains the summoner objects mapped by the standardized summoner name,
	 * which is the summoner name in all lower case and with spaces removed. Use this version of the
	 * name when checking if the returned object contains the data for a given summoner. This API will
	 * also accept standardized summoner names as valid parameters, although they are not required.
	 *
	 * @param summonerIds array of summoner ids
	 * @return raw json map of standardized summoner ids to their summoner objects
	 * @throws DoransException
	 */
	@RateLimitted
	public String getSummonersByIdRaw(long[] summonerIds) throws DoransException {
		String summonerList;
		if (summonerIds.length == 0) {
			throw new InvalidParameterException("Zero summoners is not allowed");
		} else if (summonerIds.length == 1) {
			summonerList = Long.toString(summonerIds[0]);
		} else if (summonerIds.length > 40) {
			throw new InvalidParameterException("Method limited to 40 summoner names per query");
		} else {
			summonerList = StringUtils.join(summonerIds, ",");
		}

		return parent.getQuery().query(new StringBuilder(VERSION).append("/summoner/").append(summonerList).toString());
	}

	/**
	 * The response object contains the summoner objects mapped by the standardized summoner name,
	 * which is the summoner name in all lower case and with spaces removed. Use this version of the
	 * name when checking if the returned object contains the data for a given summoner. This API will
	 * also accept standardized summoner names as valid parameters, although they are not required.
	 *
	 * @param summonerIds array of summoner ids
	 * @return map of standardized summoner ids to their summoner objects
	 * @throws DoransException
	 */
	@RateLimitted
	public Map<String, Summoner> getSummonersById(long[] summonerIds) throws DoransException {
		return parent.getGson().fromJson(getSummonersByIdRaw(summonerIds), typeMapStringSummoner);
	}

	/**
	 * The response object contains the summoner objects mapped by the standardized summoner name,
	 * which is the summoner name in all lower case and with spaces removed. Use this version of the
	 * name when checking if the returned object contains the data for a given summoner. This API will
	 * also accept standardized summoner names as valid parameters, although they are not required.
	 *
	 * @param summonerId summoner id
	 * @return raw json map of standardized summoner id to its summoner object
	 * @throws DoransException
	 */
	@RateLimitted
	public String getSummonerByIdRaw(long summonerId) throws DoransException {
		long[] ids = new long[1];
		ids[0] = summonerId;
		return getSummonersByIdRaw(ids);
	}

	/**
	 * The response object contains the summoner objects mapped by the standardized summoner name,
	 * which is the summoner name in all lower case and with spaces removed. Use this version of the
	 * name when checking if the returned object contains the data for a given summoner. This API will
	 * also accept standardized summoner names as valid parameters, although they are not required.
	 *
	 * @param summonerId summoner id
	 * @return summoner object
	 * @throws DoransException
	 */
	@RateLimitted
	public Summoner getSummonerById(long summonerId) throws DoransException {
		long[] ids = new long[1];
		ids[0] = summonerId;
		return getSummonersById(ids).entrySet().iterator().next().getValue();
	}
}
