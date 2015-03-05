package gg.buff.dorans.objects.generated.team;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * TeamStatDetail
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class TeamStatDetail {

	@Expose
	private int averageGamesPlayed;
	@Expose
	private int losses;
	@Expose
	private String teamStatType;
	@Expose
	private int wins;

	/**
	 * @return The averageGamesPlayed
	 */
	public int getAverageGamesPlayed() {
		return averageGamesPlayed;
	}

	/**
	 * @param averageGamesPlayed
	 *            The averageGamesPlayed
	 */
	public void setAverageGamesPlayed(int averageGamesPlayed) {
		this.averageGamesPlayed = averageGamesPlayed;
	}

	/**
	 * @return The losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * @param losses
	 *            The losses
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}

	/**
	 * @return The teamStatType
	 */
	public String getTeamStatType() {
		return teamStatType;
	}

	/**
	 * @param teamStatType
	 *            The teamStatType
	 */
	public void setTeamStatType(String teamStatType) {
		this.teamStatType = teamStatType;
	}

	/**
	 * @return The wins
	 */
	public int getWins() {
		return wins;
	}

	/**
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
		return new HashCodeBuilder().append(averageGamesPlayed).append(losses).append(teamStatType).append(wins).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof TeamStatDetail) == false) {
			return false;
		}
		TeamStatDetail rhs = ((TeamStatDetail) other);
		return new EqualsBuilder().append(averageGamesPlayed, rhs.averageGamesPlayed).append(losses, rhs.losses).append(teamStatType, rhs.teamStatType).append(wins, rhs.wins).isEquals();
	}

}
