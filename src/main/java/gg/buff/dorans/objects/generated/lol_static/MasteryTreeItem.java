package gg.buff.dorans.objects.generated.lol_static;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * MasteryTreeItem
 * <p>
 * This object contains mastery tree item data
 */
@Generated("org.jsonschema2pojo")
public class MasteryTreeItem {

	@Expose
	private int masteryId;
	@Expose
	private String prereq;

	/**
	 * @return The masteryId
	 */
	public int getMasteryId() {
		return masteryId;
	}

	/**
	 * @param masteryId
	 *            The masteryId
	 */
	public void setMasteryId(int masteryId) {
		this.masteryId = masteryId;
	}

	/**
	 * @return The prereq
	 */
	public String getPrereq() {
		return prereq;
	}

	/**
	 * @param prereq
	 *            The prereq
	 */
	public void setPrereq(String prereq) {
		this.prereq = prereq;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(masteryId).append(prereq).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof MasteryTreeItem) == false) {
			return false;
		}
		MasteryTreeItem rhs = ((MasteryTreeItem) other);
		return new EqualsBuilder().append(masteryId, rhs.masteryId).append(prereq, rhs.prereq).isEquals();
	}

}
