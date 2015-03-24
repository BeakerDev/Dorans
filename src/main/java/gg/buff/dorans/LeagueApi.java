package gg.buff.dorans;

import com.google.gson.reflect.TypeToken;
import gg.buff.dorans.annotations.RateLimitted;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.exceptions.InvalidParameterException;
import gg.buff.dorans.objects.generated.league.League;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeagueApi extends CommonApi {
	private final static Map<String, String> RANKED_SOLO_QUEUE = new HashMap<>();
	private final static Map<String, String> RANKED_5X5 = new HashMap<>();
	private final static Map<String, String> RANKED_3X3 = new HashMap<>();
	//Type
	private final Type typeMapLongListLeague = new TypeToken<Map<Long, List<League>>>() {
	}.getType();

	static {
		RANKED_SOLO_QUEUE.put("type", "RANKED_SOLO_5x5");
		RANKED_3X3.put("type", "RANKED_TEAM_3x3");
		RANKED_5X5.put("type", "RANKED_TEAM_5x5");
	}

	protected LeagueApi(Dorans parent) {
		super(parent, "v2.5");
	}

	/**
	 * Returns all leagues for specified summoners and summoners' teams. Entries for each requested participant
	 * (i.e., each summoner and related teams) will be included in the returned leagues data, whether or not the
	 * participant is inactive. However, no entries for other inactive summoners or teams in the leagues will be included.
	 *
	 * @param summonerIds {@link java.util.List} of summoner ids as {@link java.lang.Long}
	 * @return raw json map of summoner ids to a list of all the leagues that they are in {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getSummonersLeaguesRaw(List<Long> summonerIds) throws DoransException {
		String summonerList;
		if (summonerIds.size() == 0) {
			throw new InvalidParameterException("Zero summoners is not allowed");
		} else if (summonerIds.size() == 1) {
			summonerList = Long.toString(summonerIds.get(0));
		} else if (summonerIds.size() > 10) {
			throw new InvalidParameterException("Method limited to 10 summoner ids per query");
		} else {
			summonerList = StringUtils.join(summonerIds, ",");
		}

		return getParent().getQuery().query(new StringBuilder(getVersion()).append("/league/by-summoner/").append(summonerList).toString());

	}

	/**
	 * Returns all leagues for specified summoners and summoners' teams. Entries for each requested participant
	 * (i.e., each summoner and related teams) will be included in the returned leagues data, whether or not the
	 * participant is inactive. However, no entries for other inactive summoners or teams in the leagues will be included.
	 *
	 * @param summonerIds {@link java.util.List} of summoner ids as {@link java.lang.Long}
	 * @return {@link java.util.Map} of summoner ids as a {@link java.lang.Long} to a list of all the leagues as {@link gg.buff.dorans.objects.generated.league.League}
	 * @throws DoransException
	 */
	@RateLimitted
	public Map<Long, List<League>> getSummonersLeagues(List<Long> summonerIds) throws DoransException {
		return getParent().getGson().fromJson(getSummonersLeaguesRaw(summonerIds), typeMapLongListLeague);
	}

	/**
	 * Returns all league entries for specified summoners and summoners' teams.
	 *
	 * @param summonerIds {@link java.util.List} of summoner ids as {@link java.lang.Long}
	 * @return raw json map of summoner ids to a list of all the leagues that they are in {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getSummonersLeagueEntriesRaw(List<Long> summonerIds) throws DoransException {
		String summonerList;
		if (summonerIds.size() == 0) {
			throw new InvalidParameterException("Zero summoners is not allowed");
		} else if (summonerIds.size() == 1) {
			summonerList = Long.toString(summonerIds.get(0));
		} else if (summonerIds.size() > 10) {
			throw new InvalidParameterException("Method limited to 10 summoner ids per query");
		} else {
			summonerList = StringUtils.join(summonerIds, ",");
		}

		return getParent().getQuery().query(new StringBuilder(getVersion()).append("/league/by-summoner/").append(summonerList).append("/entry").toString());
	}

	/**
	 * Returns all league entries for specified summoners and summoners' teams.
	 *
	 * @param summonerIds {@link java.util.List} of summoner ids as {@link java.lang.Long}
	 * @return {@link java.util.Map} of summoner ids as a {@link java.lang.Long} to a list of all the leagues as {@link gg.buff.dorans.objects.generated.league.League}
	 * @throws DoransException
	 */
	@RateLimitted
	public Map<Long, List<League>> getSummonersLeagueEntries(List<Long> summonerIds) throws DoransException {
		return getParent().getGson().fromJson(getSummonersLeagueEntriesRaw(summonerIds), typeMapLongListLeague);
	}

	/**
	 * Returns all leagues for specified teams. Entries for each requested team will be included in the
	 * returned leagues data, whether or not the team is inactive. However, no entries for other inactive
	 * teams in the leagues will be included.
	 *
	 * @param teamIds {@link java.util.List} of team ids as {@link java.lang.Long}
	 * @return raw json map of team ids to a list of all the leagues that they are in {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getTeamLeaguesRaw(List<Long> teamIds) throws DoransException {
		String teamList;
		if (teamIds.size() == 0) {
			throw new InvalidParameterException("Zero summoners is not allowed");
		} else if (teamIds.size() == 1) {
			teamList = Long.toString(teamIds.get(0));
		} else if (teamIds.size() > 10) {
			throw new InvalidParameterException("Method limited to 10 team ids per query");
		} else {
			teamList = StringUtils.join(teamIds, ",");
		}

		return getParent().getQuery().query(new StringBuilder(getVersion()).append("/league/by-summoner/").append(teamList).toString());
	}

	/**
	 * Returns all leagues for specified teams. Entries for each requested team will be included in the
	 * returned leagues data, whether or not the team is inactive. However, no entries for other inactive
	 * teams in the leagues will be included.
	 *
	 * @param teamIds {@link java.util.List} of team ids as {@link java.lang.Long}
	 * @return {@link java.util.Map} of team ids as a {@link java.lang.Long} to a list of all the leagues as {@link gg.buff.dorans.objects.generated.league.League}
	 * @throws DoransException
	 */
	@RateLimitted
	public Map<Long, List<League>> getTeamLeagues(List<Long> teamIds) throws DoransException {
		return getParent().getGson().fromJson(getTeamLeaguesRaw(teamIds), typeMapLongListLeague);
	}

	/**
	 * Returns all leagues for specified teams. Entries for each requested team will be included in the
	 * returned leagues data, whether or not the team is inactive. However, no entries for other inactive
	 * teams in the leagues will be included.
	 *
	 * @param teamIds {@link java.util.List} of team ids as {@link java.lang.Long}
	 * @return raw json map of team ids to a list of all the leagues that they are in {@link java.lang.String}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getTeamLeaguesEntriesRaw(List<Long> teamIds) throws DoransException {
		String teamList;
		if (teamIds.size() == 0) {
			throw new InvalidParameterException("Zero summoners is not allowed");
		} else if (teamIds.size() == 1) {
			teamList = Long.toString(teamIds.get(0));
		} else if (teamIds.size() > 10) {
			throw new InvalidParameterException("Method limited to 10 team ids per query");
		} else {
			teamList = StringUtils.join(teamIds, ",");
		}

		return getParent().getQuery().query(new StringBuilder(getVersion()).append("/league/by-summoner/").append(teamList).append("/entry").toString());
	}

	/**
	 * Returns all leagues for specified teams. Entries for each requested team will be included in the
	 * returned leagues data, whether or not the team is inactive. However, no entries for other inactive
	 * teams in the leagues will be included.
	 *
	 * @param teamIds {@link java.util.List} of team ids as {@link java.lang.Long}
	 * @return {@link java.util.Map} of team ids as a {@link java.lang.Long} to a list of all the leagues as {@link gg.buff.dorans.objects.generated.league.League}
	 * @throws DoransException
	 */
	@RateLimitted
	public Map<Long, List<League>> getTeamLeaguesEntries(List<Long> teamIds) throws DoransException {
		return getParent().getGson().fromJson(getTeamLeaguesEntriesRaw(teamIds), typeMapLongListLeague);
	}

	/**
	 * Method to return the Challenger League for Solo Queue
	 *
	 * @return solo queue info as a {@link gg.buff.dorans.objects.generated.league.League}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getChallengerSoloQueueRaw() throws DoransException {
		return getParent().getQuery().query(new StringBuilder(getVersion()).append("/league/challenger").toString(), RANKED_SOLO_QUEUE);
	}

	/**
	 * Method to return the Challenger League for Solo Queue
	 *
	 * @return solo queue info as a {@link gg.buff.dorans.objects.generated.league.League}
	 * @throws DoransException
	 */
	@RateLimitted
	public League getChallengerSoloQueue() throws DoransException {
		return getParent().getGson().fromJson(getChallengerSoloQueueRaw(), League.class);
	}

	/**
	 * Method to return the Challenger League for Ranked 3x3 Queue
	 *
	 * @return ranked 3x3 queue info as a {@link gg.buff.dorans.objects.generated.league.League}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getChallengerRanked3x3Raw() throws DoransException {
		return getParent().getQuery().query(new StringBuilder(getVersion()).append("/league/challenger").toString(), RANKED_3X3);
	}

	/**
	 * Method to return the Challenger League for Ranked 3x3 Queue
	 *
	 * @return ranked 3x3 queue info as a {@link gg.buff.dorans.objects.generated.league.League}
	 * @throws DoransException
	 */
	@RateLimitted
	public League getChallengerRanked3x3() throws DoransException {
		return getParent().getGson().fromJson(getChallengerSoloQueueRaw(), League.class);
	}

	/**
	 * Method to return the Challenger League for Ranked 5x5 Queue
	 *
	 * @return ranked 5x5 queue info as a {@link gg.buff.dorans.objects.generated.league.League}
	 * @throws DoransException
	 */
	@RateLimitted
	public String getChallengerRanked5x5Raw() throws DoransException {
		return getParent().getQuery().query(new StringBuilder(getVersion()).append("/league/challenger").toString(), RANKED_5X5);
	}

	/**
	 * Method to return the Challenger League for Ranked 5x5 Queue
	 *
	 * @return ranked 5x5 queue info as a {@link gg.buff.dorans.objects.generated.league.League}
	 * @throws DoransException
	 */
	@RateLimitted
	public League getChallengerRanked5x5() throws DoransException {
		return getParent().getGson().fromJson(getChallengerSoloQueueRaw(), League.class);
	}
}
