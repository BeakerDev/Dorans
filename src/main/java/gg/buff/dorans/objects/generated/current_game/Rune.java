package gg.buff.dorans.objects.generated.current_game;

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
	 * The count of this rune used by the participant
	 * <p>
	 */
	@Expose
	private int count;
	/**
	 * The ID of the rune
	 * <p>
	 */
	@Expose
	private long runeId;

	/**
	 * The count of this rune used by the participant
	 * <p>
	 * 
	 * @return The count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * The count of this rune used by the participant
	 * <p>
	 * 
	 * @param count
	 *            The count
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * The ID of the rune
	 * <p>
	 * 
	 * @return The runeId
	 */
	public long getRuneId() {
		return runeId;
	}

	/**
	 * The ID of the rune
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
		return new HashCodeBuilder().append(count).append(runeId).toHashCode();
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
		return new EqualsBuilder().append(count, rhs.count).append(runeId, rhs.runeId).isEquals();
	}

}
