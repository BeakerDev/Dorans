package gg.buff.dorans.objects.generated.lol_static;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * MasteryTreeList
 * <p>
 * This object contains mastery tree list data
 */
@Generated("org.jsonschema2pojo")
public class MasteryTreeList {

	@Expose
	private List<MasteryTreeItem> masteryId = new ArrayList<MasteryTreeItem>();

	/**
	 * @return The masteryId
	 */
	public List<MasteryTreeItem> getMasteryId() {
		return masteryId;
	}

	/**
	 * @param masteryId
	 *            The masteryId
	 */
	public void setMasteryId(List<MasteryTreeItem> masteryId) {
		this.masteryId = masteryId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(masteryId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof MasteryTreeList) == false) {
			return false;
		}
		MasteryTreeList rhs = ((MasteryTreeList) other);
		return new EqualsBuilder().append(masteryId, rhs.masteryId).isEquals();
	}

}
