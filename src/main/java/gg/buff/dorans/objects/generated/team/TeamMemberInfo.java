package gg.buff.dorans.objects.generated.team;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * TeamMemberInfo
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class TeamMemberInfo {

	/**
	 * Date that team member was invited to team specified as epoch
	 * milliseconds.
	 * <p>
	 */
	@Expose
	private long inviteDate;
	/**
	 * Rune slot ID.
	 * <p>
	 */
	@Expose
	private long joinDate;
	@Expose
	private long playerId;
	@Expose
	private String status;

	/**
	 * Date that team member was invited to team specified as epoch
	 * milliseconds.
	 * <p>
	 * 
	 * @return The inviteDate
	 */
	public long getInviteDate() {
		return inviteDate;
	}

	/**
	 * Date that team member was invited to team specified as epoch
	 * milliseconds.
	 * <p>
	 * 
	 * @param inviteDate
	 *            The inviteDate
	 */
	public void setInviteDate(long inviteDate) {
		this.inviteDate = inviteDate;
	}

	/**
	 * Rune slot ID.
	 * <p>
	 * 
	 * @return The joinDate
	 */
	public long getJoinDate() {
		return joinDate;
	}

	/**
	 * Rune slot ID.
	 * <p>
	 * 
	 * @param joinDate
	 *            The joinDate
	 */
	public void setJoinDate(long joinDate) {
		this.joinDate = joinDate;
	}

	/**
	 * @return The playerId
	 */
	public long getPlayerId() {
		return playerId;
	}

	/**
	 * @param playerId
	 *            The playerId
	 */
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}

	/**
	 * @return The status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            The status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(inviteDate).append(joinDate).append(playerId).append(status).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof TeamMemberInfo) == false) {
			return false;
		}
		TeamMemberInfo rhs = ((TeamMemberInfo) other);
		return new EqualsBuilder().append(inviteDate, rhs.inviteDate).append(joinDate, rhs.joinDate).append(playerId, rhs.playerId).append(status, rhs.status).isEquals();
	}

}
