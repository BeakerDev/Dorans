package gg.buff.dorans.objects.league;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * LeagueEntry
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class LeagueEntry {

	/**
	 * The league division of the participant.
	 * <p>
	 */
	@Expose
	private String division;
	/**
	 * Specifies if the participant is fresh blood.
	 * <p>
	 */
	@Expose
	private boolean isFreshBlood;
	/**
	 * Specifies if the participant is on a hot streak.
	 * <p>
	 */
	@Expose
	private boolean isHotStreak;
	/**
	 * Specifies if the participant is inactive.
	 * <p>
	 */
	@Expose
	private boolean isInactive;
	/**
	 * Specifies if the participant is inactive.
	 * <p>
	 */
	@Expose
	private boolean isVeteran;
	/**
	 * The league points of the participant.
	 * <p>
	 */
	@Expose
	private int leaguePoints;
	/**
	 * The number of losses for the participant.
	 * <p>
	 */
	@Expose
	private int losses;
	/**
	 * Mini series data for the participant. Only present if the participant is
	 * currently in a mini series.
	 * <p>
	 */
	@Expose
	private List<MiniSeries> miniSeries = new ArrayList<MiniSeries>();
	/**
	 * The ID of the participant (i.e., summoner or team) represented by this
	 * entry.
	 * <p>
	 */
	@Expose
	private String playerOrTeamId;
	/**
	 * The name of the the participant (i.e., summoner or team) represented by
	 * this entry.
	 * <p>
	 */
	@Expose
	private String playerOrTeamName;
	/**
	 * The number of wins for the participant.
	 * <p>
	 */
	@Expose
	private int wins;

	/**
	 * The league division of the participant.
	 * <p>
	 * 
	 * @return The division
	 */
	public String getDivision() {
		return division;
	}

	/**
	 * The league division of the participant.
	 * <p>
	 * 
	 * @param division
	 *            The division
	 */
	public void setDivision(String division) {
		this.division = division;
	}

	/**
	 * Specifies if the participant is fresh blood.
	 * <p>
	 * 
	 * @return The isFreshBlood
	 */
	public boolean isIsFreshBlood() {
		return isFreshBlood;
	}

	/**
	 * Specifies if the participant is fresh blood.
	 * <p>
	 * 
	 * @param isFreshBlood
	 *            The isFreshBlood
	 */
	public void setIsFreshBlood(boolean isFreshBlood) {
		this.isFreshBlood = isFreshBlood;
	}

	/**
	 * Specifies if the participant is on a hot streak.
	 * <p>
	 * 
	 * @return The isHotStreak
	 */
	public boolean isIsHotStreak() {
		return isHotStreak;
	}

	/**
	 * Specifies if the participant is on a hot streak.
	 * <p>
	 * 
	 * @param isHotStreak
	 *            The isHotStreak
	 */
	public void setIsHotStreak(boolean isHotStreak) {
		this.isHotStreak = isHotStreak;
	}

	/**
	 * Specifies if the participant is inactive.
	 * <p>
	 * 
	 * @return The isInactive
	 */
	public boolean isIsInactive() {
		return isInactive;
	}

	/**
	 * Specifies if the participant is inactive.
	 * <p>
	 * 
	 * @param isInactive
	 *            The isInactive
	 */
	public void setIsInactive(boolean isInactive) {
		this.isInactive = isInactive;
	}

	/**
	 * Specifies if the participant is inactive.
	 * <p>
	 * 
	 * @return The isVeteran
	 */
	public boolean isIsVeteran() {
		return isVeteran;
	}

	/**
	 * Specifies if the participant is inactive.
	 * <p>
	 * 
	 * @param isVeteran
	 *            The isVeteran
	 */
	public void setIsVeteran(boolean isVeteran) {
		this.isVeteran = isVeteran;
	}

	/**
	 * The league points of the participant.
	 * <p>
	 * 
	 * @return The leaguePoints
	 */
	public int getLeaguePoints() {
		return leaguePoints;
	}

	/**
	 * The league points of the participant.
	 * <p>
	 * 
	 * @param leaguePoints
	 *            The leaguePoints
	 */
	public void setLeaguePoints(int leaguePoints) {
		this.leaguePoints = leaguePoints;
	}

	/**
	 * The number of losses for the participant.
	 * <p>
	 * 
	 * @return The losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * The number of losses for the participant.
	 * <p>
	 * 
	 * @param losses
	 *            The losses
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}

	/**
	 * Mini series data for the participant. Only present if the participant is
	 * currently in a mini series.
	 * <p>
	 * 
	 * @return The miniSeries
	 */
	public List<MiniSeries> getMiniSeries() {
		return miniSeries;
	}

	/**
	 * Mini series data for the participant. Only present if the participant is
	 * currently in a mini series.
	 * <p>
	 * 
	 * @param miniSeries
	 *            The miniSeries
	 */
	public void setMiniSeries(List<MiniSeries> miniSeries) {
		this.miniSeries = miniSeries;
	}

	/**
	 * The ID of the participant (i.e., summoner or team) represented by this
	 * entry.
	 * <p>
	 * 
	 * @return The playerOrTeamId
	 */
	public String getPlayerOrTeamId() {
		return playerOrTeamId;
	}

	/**
	 * The ID of the participant (i.e., summoner or team) represented by this
	 * entry.
	 * <p>
	 * 
	 * @param playerOrTeamId
	 *            The playerOrTeamId
	 */
	public void setPlayerOrTeamId(String playerOrTeamId) {
		this.playerOrTeamId = playerOrTeamId;
	}

	/**
	 * The name of the the participant (i.e., summoner or team) represented by
	 * this entry.
	 * <p>
	 * 
	 * @return The playerOrTeamName
	 */
	public String getPlayerOrTeamName() {
		return playerOrTeamName;
	}

	/**
	 * The name of the the participant (i.e., summoner or team) represented by
	 * this entry.
	 * <p>
	 * 
	 * @param playerOrTeamName
	 *            The playerOrTeamName
	 */
	public void setPlayerOrTeamName(String playerOrTeamName) {
		this.playerOrTeamName = playerOrTeamName;
	}

	/**
	 * The number of wins for the participant.
	 * <p>
	 * 
	 * @return The wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * The number of wins for the participant.
	 * <p>
	 * 
	 * @param wins
	 *            The wins
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(division).append(isFreshBlood).append(isHotStreak).append(isInactive).append(isVeteran).append(leaguePoints).append(losses).append(miniSeries).append(playerOrTeamId).append(playerOrTeamName).append(wins).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof LeagueEntry) == false) {
			return false;
		}
		LeagueEntry rhs = ((LeagueEntry) other);
		return new EqualsBuilder().append(division, rhs.division).append(isFreshBlood, rhs.isFreshBlood).append(isHotStreak, rhs.isHotStreak).append(isInactive, rhs.isInactive).append(isVeteran, rhs.isVeteran).append(leaguePoints, rhs.leaguePoints).append(losses, rhs.losses).append(miniSeries, rhs.miniSeries).append(playerOrTeamId, rhs.playerOrTeamId).append(playerOrTeamName, rhs.playerOrTeamName).append(wins, rhs.wins).isEquals();
	}

}
