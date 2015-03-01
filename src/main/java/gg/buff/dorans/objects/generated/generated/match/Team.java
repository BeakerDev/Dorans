package gg.buff.dorans.objects.generated.generated.match;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Team
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class Team {

	/**
	 * If game was draft mode, contains banned champion data, otherwise null
	 * <p>
	 */
	@Expose
	private List<BannedChampion> bans = new ArrayList<BannedChampion>();
	/**
	 * Number of times the team killed baron
	 * <p>
	 */
	@Expose
	private int baronKills;
	/**
	 * If game was a dominion game, specifies the points the team had at game
	 * end, otherwise null
	 * <p>
	 */
	@Expose
	private long dominionVictoryScore;
	/**
	 * Number of times the team killed dragon
	 * <p>
	 */
	@Expose
	private int dragonKills;
	/**
	 * Flag indicating whether or not the team got the first baron kill
	 * <p>
	 */
	@Expose
	private boolean firstBaron;
	/**
	 * Flag indicating whether or not the team got first blood
	 * <p>
	 */
	@Expose
	private boolean firstBlood;
	/**
	 * Flag indicating whether or not the team got the first dragon kill
	 * <p>
	 */
	@Expose
	private boolean firstDragon;
	/**
	 * Flag indicating whether or not the team destroyed the first inhibitor
	 * <p>
	 */
	@Expose
	private boolean firstInhibitor;
	/**
	 * Flag indicating whether or not the team destroyed the first tower
	 * <p>
	 */
	@Expose
	private boolean firstTower;
	/**
	 * Number of inhibitors the team destroyed
	 * <p>
	 */
	@Expose
	private int inhibitorKills;
	/**
	 * Team ID
	 * <p>
	 */
	@Expose
	private int teamId;
	/**
	 * Number of towers the team destroyed
	 * <p>
	 */
	@Expose
	private int towerKills;
	/**
	 * Number of times the team killed vilemaw
	 * <p>
	 */
	@Expose
	private int vilemawKills;
	/**
	 * Flag indicating whether or not the team won
	 * <p>
	 */
	@Expose
	private boolean winner;

	/**
	 * If game was draft mode, contains banned champion data, otherwise null
	 * <p>
	 * 
	 * @return The bans
	 */
	public List<BannedChampion> getBans() {
		return bans;
	}

	/**
	 * If game was draft mode, contains banned champion data, otherwise null
	 * <p>
	 * 
	 * @param bans
	 *            The bans
	 */
	public void setBans(List<BannedChampion> bans) {
		this.bans = bans;
	}

	/**
	 * Number of times the team killed baron
	 * <p>
	 * 
	 * @return The baronKills
	 */
	public int getBaronKills() {
		return baronKills;
	}

	/**
	 * Number of times the team killed baron
	 * <p>
	 * 
	 * @param baronKills
	 *            The baronKills
	 */
	public void setBaronKills(int baronKills) {
		this.baronKills = baronKills;
	}

	/**
	 * If game was a dominion game, specifies the points the team had at game
	 * end, otherwise null
	 * <p>
	 * 
	 * @return The dominionVictoryScore
	 */
	public long getDominionVictoryScore() {
		return dominionVictoryScore;
	}

	/**
	 * If game was a dominion game, specifies the points the team had at game
	 * end, otherwise null
	 * <p>
	 * 
	 * @param dominionVictoryScore
	 *            The dominionVictoryScore
	 */
	public void setDominionVictoryScore(long dominionVictoryScore) {
		this.dominionVictoryScore = dominionVictoryScore;
	}

	/**
	 * Number of times the team killed dragon
	 * <p>
	 * 
	 * @return The dragonKills
	 */
	public int getDragonKills() {
		return dragonKills;
	}

	/**
	 * Number of times the team killed dragon
	 * <p>
	 * 
	 * @param dragonKills
	 *            The dragonKills
	 */
	public void setDragonKills(int dragonKills) {
		this.dragonKills = dragonKills;
	}

	/**
	 * Flag indicating whether or not the team got the first baron kill
	 * <p>
	 * 
	 * @return The firstBaron
	 */
	public boolean isFirstBaron() {
		return firstBaron;
	}

	/**
	 * Flag indicating whether or not the team got the first baron kill
	 * <p>
	 * 
	 * @param firstBaron
	 *            The firstBaron
	 */
	public void setFirstBaron(boolean firstBaron) {
		this.firstBaron = firstBaron;
	}

	/**
	 * Flag indicating whether or not the team got first blood
	 * <p>
	 * 
	 * @return The firstBlood
	 */
	public boolean isFirstBlood() {
		return firstBlood;
	}

	/**
	 * Flag indicating whether or not the team got first blood
	 * <p>
	 * 
	 * @param firstBlood
	 *            The firstBlood
	 */
	public void setFirstBlood(boolean firstBlood) {
		this.firstBlood = firstBlood;
	}

	/**
	 * Flag indicating whether or not the team got the first dragon kill
	 * <p>
	 * 
	 * @return The firstDragon
	 */
	public boolean isFirstDragon() {
		return firstDragon;
	}

	/**
	 * Flag indicating whether or not the team got the first dragon kill
	 * <p>
	 * 
	 * @param firstDragon
	 *            The firstDragon
	 */
	public void setFirstDragon(boolean firstDragon) {
		this.firstDragon = firstDragon;
	}

	/**
	 * Flag indicating whether or not the team destroyed the first inhibitor
	 * <p>
	 * 
	 * @return The firstInhibitor
	 */
	public boolean isFirstInhibitor() {
		return firstInhibitor;
	}

	/**
	 * Flag indicating whether or not the team destroyed the first inhibitor
	 * <p>
	 * 
	 * @param firstInhibitor
	 *            The firstInhibitor
	 */
	public void setFirstInhibitor(boolean firstInhibitor) {
		this.firstInhibitor = firstInhibitor;
	}

	/**
	 * Flag indicating whether or not the team destroyed the first tower
	 * <p>
	 * 
	 * @return The firstTower
	 */
	public boolean isFirstTower() {
		return firstTower;
	}

	/**
	 * Flag indicating whether or not the team destroyed the first tower
	 * <p>
	 * 
	 * @param firstTower
	 *            The firstTower
	 */
	public void setFirstTower(boolean firstTower) {
		this.firstTower = firstTower;
	}

	/**
	 * Number of inhibitors the team destroyed
	 * <p>
	 * 
	 * @return The inhibitorKills
	 */
	public int getInhibitorKills() {
		return inhibitorKills;
	}

	/**
	 * Number of inhibitors the team destroyed
	 * <p>
	 * 
	 * @param inhibitorKills
	 *            The inhibitorKills
	 */
	public void setInhibitorKills(int inhibitorKills) {
		this.inhibitorKills = inhibitorKills;
	}

	/**
	 * Team ID
	 * <p>
	 * 
	 * @return The teamId
	 */
	public int getTeamId() {
		return teamId;
	}

	/**
	 * Team ID
	 * <p>
	 * 
	 * @param teamId
	 *            The teamId
	 */
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	/**
	 * Number of towers the team destroyed
	 * <p>
	 * 
	 * @return The towerKills
	 */
	public int getTowerKills() {
		return towerKills;
	}

	/**
	 * Number of towers the team destroyed
	 * <p>
	 * 
	 * @param towerKills
	 *            The towerKills
	 */
	public void setTowerKills(int towerKills) {
		this.towerKills = towerKills;
	}

	/**
	 * Number of times the team killed vilemaw
	 * <p>
	 * 
	 * @return The vilemawKills
	 */
	public int getVilemawKills() {
		return vilemawKills;
	}

	/**
	 * Number of times the team killed vilemaw
	 * <p>
	 * 
	 * @param vilemawKills
	 *            The vilemawKills
	 */
	public void setVilemawKills(int vilemawKills) {
		this.vilemawKills = vilemawKills;
	}

	/**
	 * Flag indicating whether or not the team won
	 * <p>
	 * 
	 * @return The winner
	 */
	public boolean isWinner() {
		return winner;
	}

	/**
	 * Flag indicating whether or not the team won
	 * <p>
	 * 
	 * @param winner
	 *            The winner
	 */
	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(bans).append(baronKills).append(dominionVictoryScore).append(dragonKills).append(firstBaron).append(firstBlood).append(firstDragon).append(firstInhibitor).append(firstTower).append(inhibitorKills).append(teamId).append(towerKills).append(vilemawKills).append(winner).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Team) == false) {
			return false;
		}
		Team rhs = ((Team) other);
		return new EqualsBuilder().append(bans, rhs.bans).append(baronKills, rhs.baronKills).append(dominionVictoryScore, rhs.dominionVictoryScore).append(dragonKills, rhs.dragonKills).append(firstBaron, rhs.firstBaron).append(firstBlood, rhs.firstBlood).append(firstDragon, rhs.firstDragon).append(firstInhibitor, rhs.firstInhibitor).append(firstTower, rhs.firstTower).append(inhibitorKills, rhs.inhibitorKills).append(teamId, rhs.teamId).append(towerKills, rhs.towerKills).append(vilemawKills, rhs.vilemawKills).append(winner, rhs.winner).isEquals();
	}

}
