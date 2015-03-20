package gg.buff.dorans.objects.generated.lol_static;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * MasteryTree
 * <p>
 * This object contains mastery tree data
 */
@Generated("org.jsonschema2pojo")
public class MasteryTree {

	@Expose
	private List<MasteryList> Defense = new ArrayList<MasteryList>();
	@Expose
	private List<MasteryList> Offense = new ArrayList<MasteryList>();
	@Expose
	private List<MasteryList> Utility = new ArrayList<MasteryList>();

	/**
	 * @return The Defense
	 */
	public List<MasteryList> getDefense() {
		return Defense;
	}

	/**
	 * @param Defense
	 *            The Defense
	 */
	public void setDefense(List<MasteryList> Defense) {
		this.Defense = Defense;
	}

	/**
	 * @return The Offense
	 */
	public List<MasteryList> getOffense() {
		return Offense;
	}

	/**
	 * @param Offense
	 *            The Offense
	 */
	public void setOffense(List<MasteryList> Offense) {
		this.Offense = Offense;
	}

	/**
	 * @return The Utility
	 */
	public List<MasteryList> getUtility() {
		return Utility;
	}

	/**
	 * @param Utility
	 *            The Utility
	 */
	public void setUtility(List<MasteryList> Utility) {
		this.Utility = Utility;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(Defense).append(Offense).append(Utility).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof MasteryTree) == false) {
			return false;
		}
		MasteryTree rhs = ((MasteryTree) other);
		return new EqualsBuilder().append(Defense, rhs.Defense).append(Offense, rhs.Offense).append(Utility, rhs.Utility).isEquals();
	}

}
