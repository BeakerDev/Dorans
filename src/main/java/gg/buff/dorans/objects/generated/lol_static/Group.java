package gg.buff.dorans.objects.generated.lol_static;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Group
 * <p>
 * This object contains item group data
 */
@Generated("org.jsonschema2pojo")
public class Group {

	@Expose
	private String MaxGroupOwnable;
	@Expose
	private String key;

	/**
	 * @return The MaxGroupOwnable
	 */
	public String getMaxGroupOwnable() {
		return MaxGroupOwnable;
	}

	/**
	 * @param MaxGroupOwnable
	 *            The MaxGroupOwnable
	 */
	public void setMaxGroupOwnable(String MaxGroupOwnable) {
		this.MaxGroupOwnable = MaxGroupOwnable;
	}

	/**
	 * @return The key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key
	 *            The key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(MaxGroupOwnable).append(key).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Group) == false) {
			return false;
		}
		Group rhs = ((Group) other);
		return new EqualsBuilder().append(MaxGroupOwnable, rhs.MaxGroupOwnable).append(key, rhs.key).isEquals();
	}

}
