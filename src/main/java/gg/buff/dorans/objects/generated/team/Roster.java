package gg.buff.dorans.objects.generated.team;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Roster
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class Roster {

	@Expose
	private List<TeamMemberInfo> memberList = new ArrayList<TeamMemberInfo>();
	@Expose
	private long ownerId;

	/**
	 * @return The memberList
	 */
	public List<TeamMemberInfo> getMemberList() {
		return memberList;
	}

	/**
	 * @param memberList
	 *            The memberList
	 */
	public void setMemberList(List<TeamMemberInfo> memberList) {
		this.memberList = memberList;
	}

	/**
	 * @return The ownerId
	 */
	public long getOwnerId() {
		return ownerId;
	}

	/**
	 * @param ownerId
	 *            The ownerId
	 */
	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(memberList).append(ownerId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Roster) == false) {
			return false;
		}
		Roster rhs = ((Roster) other);
		return new EqualsBuilder().append(memberList, rhs.memberList).append(ownerId, rhs.ownerId).isEquals();
	}

}
