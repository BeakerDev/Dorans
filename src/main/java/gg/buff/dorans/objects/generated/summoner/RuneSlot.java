package gg.buff.dorans.objects.generated.summoner;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * RuneSlot
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class RuneSlot {

	/**
	 * Rune ID associated with the rune slot. For static information correlating
	 * to rune IDs, please refer to the LoL Static Data API.
	 * <p>
	 */
	@Expose
	private int runeId;
	/**
	 * Rune slot ID.
	 * <p>
	 */
	@Expose
	private int runeSlotId;

	/**
	 * Rune ID associated with the rune slot. For static information correlating
	 * to rune IDs, please refer to the LoL Static Data API.
	 * <p>
	 * 
	 * @return The runeId
	 */
	public int getRuneId() {
		return runeId;
	}

	/**
	 * Rune ID associated with the rune slot. For static information correlating
	 * to rune IDs, please refer to the LoL Static Data API.
	 * <p>
	 * 
	 * @param runeId
	 *            The runeId
	 */
	public void setRuneId(int runeId) {
		this.runeId = runeId;
	}

	/**
	 * Rune slot ID.
	 * <p>
	 * 
	 * @return The runeSlotId
	 */
	public int getRuneSlotId() {
		return runeSlotId;
	}

	/**
	 * Rune slot ID.
	 * <p>
	 * 
	 * @param runeSlotId
	 *            The runeSlotId
	 */
	public void setRuneSlotId(int runeSlotId) {
		this.runeSlotId = runeSlotId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(runeId).append(runeSlotId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof RuneSlot) == false) {
			return false;
		}
		RuneSlot rhs = ((RuneSlot) other);
		return new EqualsBuilder().append(runeId, rhs.runeId).append(runeSlotId, rhs.runeSlotId).isEquals();
	}

}
