package gg.buff.dorans.objects.generated.lol_static;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * MetaData
 * <p>
 * This object contains meta data
 */
@Generated("org.jsonschema2pojo")
public class MetaData {

	@Expose
	private boolean isRune;
	@Expose
	private String tier;
	@Expose
	private String type;

	/**
	 * @return The isRune
	 */
	public boolean isIsRune() {
		return isRune;
	}

	/**
	 * @param isRune
	 *            The isRune
	 */
	public void setIsRune(boolean isRune) {
		this.isRune = isRune;
	}

	/**
	 * @return The tier
	 */
	public String getTier() {
		return tier;
	}

	/**
	 * @param tier
	 *            The tier
	 */
	public void setTier(String tier) {
		this.tier = tier;
	}

	/**
	 * @return The type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            The type
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(isRune).append(tier).append(type).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof MetaData) == false) {
			return false;
		}
		MetaData rhs = ((MetaData) other);
		return new EqualsBuilder().append(isRune, rhs.isRune).append(tier, rhs.tier).append(type, rhs.type).isEquals();
	}

}
