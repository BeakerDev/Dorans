package gg.buff.dorans.objects.summoner;

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
	 * Mastery ID. For static information correlating to masteries, please refer
	 * to the LoL Static Data API.
	 * <p>
	 */
	@Expose
	private long id;
	/**
	 * Mastery rank (i.e., the number of points put into this mastery).
	 * <p>
	 */
	@Expose
	private long rank;

	/**
	 * Mastery ID. For static information correlating to masteries, please refer
	 * to the LoL Static Data API.
	 * <p>
	 * 
	 * @return The id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Mastery ID. For static information correlating to masteries, please refer
	 * to the LoL Static Data API.
	 * <p>
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Mastery rank (i.e., the number of points put into this mastery).
	 * <p>
	 * 
	 * @return The rank
	 */
	public long getRank() {
		return rank;
	}

	/**
	 * Mastery rank (i.e., the number of points put into this mastery).
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
		return new HashCodeBuilder().append(id).append(rank).toHashCode();
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
		return new EqualsBuilder().append(id, rhs.id).append(rank, rhs.rank).isEquals();
	}

}
