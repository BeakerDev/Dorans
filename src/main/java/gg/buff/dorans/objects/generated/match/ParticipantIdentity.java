package gg.buff.dorans.objects.generated.match;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * ParticipantIdentity
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class ParticipantIdentity {

	/**
	 * Participant ID
	 * <p>
	 */
	@Expose
	private int participantId;
	/**
	 * Player
	 * <p>
	 * This object contains match player information
	 */
	@Expose
	private Player player;

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
	 * Player
	 * <p>
	 * This object contains match player information
	 * 
	 * @return The player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Player
	 * <p>
	 * This object contains match player information
	 * 
	 * @param player
	 *            The player
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(participantId).append(player).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ParticipantIdentity) == false) {
			return false;
		}
		ParticipantIdentity rhs = ((ParticipantIdentity) other);
		return new EqualsBuilder().append(participantId, rhs.participantId).append(player, rhs.player).isEquals();
	}

}
