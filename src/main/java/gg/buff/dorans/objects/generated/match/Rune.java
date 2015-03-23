package gg.buff.dorans.objects.generated.match;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Rune
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class Rune {

	/**
	 * Rune rank
	 * <p>
	 */
	@Expose
	private long rank;
	/**
	 * Rune ID
	 * <p>
	 */
	@Expose
	private long runeId;

	/**
	 * Rune rank
	 * <p>
	 * 
	 * @return The rank
	 */
	public long getRank() {
		return rank;
	}

	/**
	 * Rune rank
	 * <p>
	 * 
	 * @param rank
	 *            The rank
	 */
	public void setRank(long rank) {
		this.rank = rank;
	}

	/**
	 * Rune ID
	 * <p>
	 * 
	 * @return The runeId
	 */
	public long getRuneId() {
		return runeId;
	}

	/**
	 * Rune ID
	 * <p>
	 * 
	 * @param runeId
	 *            The runeId
	 */
	public void setRuneId(long runeId) {
		this.runeId = runeId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(rank).append(runeId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Rune) == false) {
			return false;
		}
		Rune rhs = ((Rune) other);
		return new EqualsBuilder().append(rank, rhs.rank).append(runeId, rhs.runeId).isEquals();
	}

}
