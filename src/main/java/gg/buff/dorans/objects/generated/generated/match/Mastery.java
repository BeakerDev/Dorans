package gg.buff.dorans.objects.generated.generated.match;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Mastery
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class Mastery {

	/**
	 * Mastery ID
	 * <p>
	 */
	@Expose
	private long masteryId;
	/**
	 * Mastery rank
	 * <p>
	 */
	@Expose
	private long rank;

	/**
	 * Mastery ID
	 * <p>
	 * 
	 * @return The masteryId
	 */
	public long getMasteryId() {
		return masteryId;
	}

	/**
	 * Mastery ID
	 * <p>
	 * 
	 * @param masteryId
	 *            The masteryId
	 */
	public void setMasteryId(long masteryId) {
		this.masteryId = masteryId;
	}

	/**
	 * Mastery rank
	 * <p>
	 * 
	 * @return The rank
	 */
	public long getRank() {
		return rank;
	}

	/**
	 * Mastery rank
	 * <p>
	 * 
	 * @param rank
	 *            The rank
	 */
	public void setRank(long rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(masteryId).append(rank).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Mastery) == false) {
			return false;
		}
		Mastery rhs = ((Mastery) other);
		return new EqualsBuilder().append(masteryId, rhs.masteryId).append(rank, rhs.rank).isEquals();
	}

}
