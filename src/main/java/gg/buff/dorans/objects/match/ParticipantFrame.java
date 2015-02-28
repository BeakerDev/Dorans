package gg.buff.dorans.objects.match;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * ParticipantFrame
 * <p>
 * This object contains participant frame information
 */
@Generated("org.jsonschema2pojo")
public class ParticipantFrame {

	/**
	 * Experience earned by participant
	 * <p>
	 */
	@Expose
	private int currentGold;
	/**
	 * Dominion score of the participant
	 * <p>
	 */
	@Expose
	private int dominionScore;
	/**
	 * Number of jungle minions killed by participant
	 * <p>
	 */
	@Expose
	private int jungleMinionsKilled;
	/**
	 * The participant's current level
	 * <p>
	 */
	@Expose
	private int level;
	/**
	 * Number of minions killed by participant
	 * <p>
	 */
	@Expose
	private int minionsKilled;
	/**
	 * Participant ID
	 * <p>
	 */
	@Expose
	private int participantId;
	/**
	 * Position
	 * <p>
	 * This object contains the participant frame position information
	 */
	@Expose
	private Position position;
	/**
	 * Team score of the participant
	 * <p>
	 */
	@Expose
	private int teamScore;
	/**
	 * Participant's total gold
	 * <p>
	 */
	@Expose
	private int totalGold;

	/**
	 * Experience earned by participant
	 * <p>
	 * 
	 * @return The currentGold
	 */
	public int getCurrentGold() {
		return currentGold;
	}

	/**
	 * Experience earned by participant
	 * <p>
	 * 
	 * @param currentGold
	 *            The currentGold
	 */
	public void setCurrentGold(int currentGold) {
		this.currentGold = currentGold;
	}

	/**
	 * Dominion score of the participant
	 * <p>
	 * 
	 * @return The dominionScore
	 */
	public int getDominionScore() {
		return dominionScore;
	}

	/**
	 * Dominion score of the participant
	 * <p>
	 * 
	 * @param dominionScore
	 *            The dominionScore
	 */
	public void setDominionScore(int dominionScore) {
		this.dominionScore = dominionScore;
	}

	/**
	 * Number of jungle minions killed by participant
	 * <p>
	 * 
	 * @return The jungleMinionsKilled
	 */
	public int getJungleMinionsKilled() {
		return jungleMinionsKilled;
	}

	/**
	 * Number of jungle minions killed by participant
	 * <p>
	 * 
	 * @param jungleMinionsKilled
	 *            The jungleMinionsKilled
	 */
	public void setJungleMinionsKilled(int jungleMinionsKilled) {
		this.jungleMinionsKilled = jungleMinionsKilled;
	}

	/**
	 * The participant's current level
	 * <p>
	 * 
	 * @return The level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * The participant's current level
	 * <p>
	 * 
	 * @param level
	 *            The level
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * Number of minions killed by participant
	 * <p>
	 * 
	 * @return The minionsKilled
	 */
	public int getMinionsKilled() {
		return minionsKilled;
	}

	/**
	 * Number of minions killed by participant
	 * <p>
	 * 
	 * @param minionsKilled
	 *            The minionsKilled
	 */
	public void setMinionsKilled(int minionsKilled) {
		this.minionsKilled = minionsKilled;
	}

	/**
	 * Participant ID
	 * <p>
	 * 
	 * @return The participantId
	 */
	public int getParticipantId() {
		return participantId;
	}

	/**
	 * Participant ID
	 * <p>
	 * 
	 * @param participantId
	 *            The participantId
	 */
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}

	/**
	 * Position
	 * <p>
	 * This object contains the participant frame position information
	 * 
	 * @return The position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * Position
	 * <p>
	 * This object contains the participant frame position information
	 * 
	 * @param position
	 *            The position
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * Team score of the participant
	 * <p>
	 * 
	 * @return The teamScore
	 */
	public int getTeamScore() {
		return teamScore;
	}

	/**
	 * Team score of the participant
	 * <p>
	 * 
	 * @param teamScore
	 *            The teamScore
	 */
	public void setTeamScore(int teamScore) {
		this.teamScore = teamScore;
	}

	/**
	 * Participant's total gold
	 * <p>
	 * 
	 * @return The totalGold
	 */
	public int getTotalGold() {
		return totalGold;
	}

	/**
	 * Participant's total gold
	 * <p>
	 * 
	 * @param totalGold
	 *            The totalGold
	 */
	public void setTotalGold(int totalGold) {
		this.totalGold = totalGold;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(currentGold).append(dominionScore).append(jungleMinionsKilled).append(level).append(minionsKilled).append(participantId).append(position).append(teamScore).append(totalGold).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ParticipantFrame) == false) {
			return false;
		}
		ParticipantFrame rhs = ((ParticipantFrame) other);
		return new EqualsBuilder().append(currentGold, rhs.currentGold).append(dominionScore, rhs.dominionScore).append(jungleMinionsKilled, rhs.jungleMinionsKilled).append(level, rhs.level).append(minionsKilled, rhs.minionsKilled).append(participantId, rhs.participantId).append(position, rhs.position).append(teamScore, rhs.teamScore).append(totalGold, rhs.totalGold).isEquals();
	}

}
