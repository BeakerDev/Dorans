package gg.buff.dorans.objects.generated.lol_static;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * BlockItem
 * <p>
 * This object champion recommended block item data
 */
@Generated("org.jsonschema2pojo")
public class BlockItem {

	@Expose
	private int count;
	@Expose
	private int id;

	/**
	 * @return The count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            The count
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return The id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            The id
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(count).append(id).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof BlockItem) == false) {
			return false;
		}
		BlockItem rhs = ((BlockItem) other);
		return new EqualsBuilder().append(count, rhs.count).append(id, rhs.id).isEquals();
	}

}
