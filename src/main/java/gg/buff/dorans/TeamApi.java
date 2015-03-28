package gg.buff.dorans;

import com.google.gson.reflect.TypeToken;
import gg.buff.dorans.annotations.RateLimitted;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.exceptions.InvalidParameterException;
import gg.buff.dorans.objects.generated.match.Team;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;


public class TeamApi extends CommonApi {
	private final Type typeMapLongListTeam = new TypeToken<Map<Long, List<Team>>>() {
	}.getType();

	protected TeamApi(Dorans parent) {
		super(parent, "v2.4");
	}

	/**
	 * Method to Teams by summoner Ids
	 *
	 * @param summonerIds ids of summoners
	 * @return raw json map of summoner ids to teams to lists of teams
	 * @throws DoransException
	 */
	@RateLimitted
	public String getSummonersTeamsRaw(List<Long> summonerIds) throws DoransException {
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

		return getParent().getQuery().query(new StringBuilder(getVersion()).append("/team/by-summoner/").append(summonerList).toString());
	}

	/**
	 * Method to Teams by summoner Ids
	 *
	 * @param summonerIds ids of summoners
	 * @return {@link Map} of team ids as {@link Long} to {@link List} of {@link Team}
	 * @throws DoransException
	 */
	@RateLimitted
	public Map<Long, List<Team>> getSummonersTeams(List<Long> summonerIds) throws DoransException {
		return getParent().getGson().fromJson(getSummonersTeamsRaw(summonerIds), typeMapLongListTeam);
	}

	/**
	 * Method to Teams by team Ids
	 *
	 * @param teamIds ids of teams
	 * @return raw json map of team ids to teams to lists of teams
	 * @throws DoransException
	 */
	@RateLimitted
	public String getTeamsRaw(List<Long> teamIds) throws DoransException {
		String teamList;
		if (teamIds.size() == 0) {
			throw new InvalidParameterException("Zero team ids is not allowed");
		} else if (teamIds.size() == 1) {
			teamList = Long.toString(teamIds.get(0));
		} else if (teamIds.size() > 10) {
			throw new InvalidParameterException("Method limited to 10 team ids per query");
		} else {
			teamList = StringUtils.join(teamIds, ",");
		}

		return getParent().getQuery().query(new StringBuilder(getVersion()).append("/team/").append(teamIds).toString());
	}

	/**
	 * Method to Teams by team Ids
	 *
	 * @param teamIds ids of teams
	 * @return {@link Map} of team ids as {@link Long} to {@link List} of {@link Team}
	 * @throws DoransException
	 */
	@RateLimitted
	public Map<Long, List<Team>> getTeams(List<Long> teamIds) throws DoransException {
		return getParent().getGson().fromJson(getTeamsRaw(teamIds), typeMapLongListTeam);
	}
}
