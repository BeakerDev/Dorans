package gg.buff.dorans.objects.generated.team;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * MatchHistorySummary
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class MatchHistorySummary {

	@Expose
	private int assists;
	/**
	 * Date that match was completed specified as epoch milliseconds
	 * <p>
	 */
	@Expose
	private long date;
	@Expose
	private int deaths;
	@Expose
	private long gameId;
	@Expose
	private String gameMode;
	@Expose
	private boolean invalid;
	@Expose
	private int kills;
	@Expose
	private int mapId;
	@Expose
	private int opposingTeamKills;
	@Expose
	private String opposingTeamName;
	@Expose
	private boolean win;

	/**
	 * @return The assists
	 */
	public int getAssists() {
		return assists;
	}

	/**
	 * @param assists
	 *            The assists
	 */
	public void setAssists(int assists) {
		this.assists = assists;
	}

	/**
	 * Date that match was completed specified as epoch milliseconds
	 * <p>
	 * 
	 * @return The date
	 */
	public long getDate() {
		return date;
	}

	/**
	 * Date that match was completed specified as epoch milliseconds
	 * <p>
	 * 
	 * @param date
	 *            The date
	 */
	public void setDate(long date) {
		this.date = date;
	}

	/**
	 * @return The deaths
	 */
	public int getDeaths() {
		return deaths;
	}

	/**
	 * @param deaths
	 *            The deaths
	 */
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	/**
	 * @return The gameId
	 */
	public long getGameId() {
		return gameId;
	}

	/**
	 * @param gameId
	 *            The gameId
	 */
	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	/**
	 * @return The gameMode
	 */
	public String getGameMode() {
		return gameMode;
	}

	/**
	 * @param gameMode
	 *            The gameMode
	 */
	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}

	/**
	 * @return The invalid
	 */
	public boolean isInvalid() {
		return invalid;
	}

	/**
	 * @param invalid
	 *            The invalid
	 */
	public void setInvalid(boolean invalid) {
		this.invalid = invalid;
	}

	/**
	 * @return The kills
	 */
	public int getKills() {
		return kills;
	}

	/**
	 * @param kills
	 *            The kills
	 */
	public void setKills(int kills) {
		this.kills = kills;
	}

	/**
	 * @return The mapId
	 */
	public int getMapId() {
		return mapId;
	}

	/**
	 * @param mapId
	 *            The mapId
	 */
	public void setMapId(int mapId) {
		this.mapId = mapId;
	}

	/**
	 * @return The opposingTeamKills
	 */
	public int getOpposingTeamKills() {
		return opposingTeamKills;
	}

	/**
	 * @param opposingTeamKills
	 *            The opposingTeamKills
	 */
	public void setOpposingTeamKills(int opposingTeamKills) {
		this.opposingTeamKills = opposingTeamKills;
	}

	/**
	 * @return The opposingTeamName
	 */
	public String getOpposingTeamName() {
		return opposingTeamName;
	}

	/**
	 * @param opposingTeamName
	 *            The opposingTeamName
	 */
	public void setOpposingTeamName(String opposingTeamName) {
		this.opposingTeamName = opposingTeamName;
	}

	/**
	 * @return The win
	 */
	public boolean isWin() {
		return win;
	}

	/**
	 * @param win
	 *            The win
	 */
	public void setWin(boolean win) {
		this.win = win;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(assists).append(date).append(deaths).append(gameId).append(gameMode).append(invalid).append(kills).append(mapId).append(opposingTeamKills).append(opposingTeamName).append(win).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof MatchHistorySummary) == false) {
			return false;
		}
		MatchHistorySummary rhs = ((MatchHistorySummary) other);
		return new EqualsBuilder().append(assists, rhs.assists).append(date, rhs.date).append(deaths, rhs.deaths).append(gameId, rhs.gameId).append(gameMode, rhs.gameMode).append(invalid, rhs.invalid).append(kills, rhs.kills).append(mapId, rhs.mapId).append(opposingTeamKills, rhs.opposingTeamKills).append(opposingTeamName, rhs.opposingTeamName).append(win, rhs.win).isEquals();
	}

}
