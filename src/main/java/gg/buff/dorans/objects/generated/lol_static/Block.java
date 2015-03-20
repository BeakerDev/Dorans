package gg.buff.dorans.objects.generated.lol_static;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Block
 * <p>
 * This object recommended block data
 */
@Generated("org.jsonschema2pojo")
public class Block {

	@Expose
	private List<BlockItem> items = new ArrayList<BlockItem>();
	@Expose
	private boolean recMath;
	@Expose
	private String type;

	/**
	 * @return The items
	 */
	public List<BlockItem> getItems() {
		return items;
	}

	/**
	 * @param items
	 *            The items
	 */
	public void setItems(List<BlockItem> items) {
		this.items = items;
	}

	/**
	 * @return The recMath
	 */
	public boolean isRecMath() {
		return recMath;
	}

	/**
	 * @param recMath
	 *            The recMath
	 */
	public void setRecMath(boolean recMath) {
		this.recMath = recMath;
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
		return new HashCodeBuilder().append(items).append(recMath).append(type).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Block) == false) {
			return false;
		}
		Block rhs = ((Block) other);
		return new EqualsBuilder().append(items, rhs.items).append(recMath, rhs.recMath).append(type, rhs.type).isEquals();
	}

}
