package gg.buff.dorans.objects.generated.lol_static;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * ItemTree
 * <p>
 * This object contains item tree data
 */
@Generated("org.jsonschema2pojo")
public class ItemTree {

	@Expose
	private String header;
	@Expose
	private List<String> tags = new ArrayList<String>();

	/**
	 * @return The header
	 */
	public String getHeader() {
		return header;
	}

	/**
	 * @param header
	 *            The header
	 */
	public void setHeader(String header) {
		this.header = header;
	}

	/**
	 * @return The tags
	 */
	public List<String> getTags() {
		return tags;
	}

	/**
	 * @param tags
	 *            The tags
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(header).append(tags).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ItemTree) == false) {
			return false;
		}
		ItemTree rhs = ((ItemTree) other);
		return new EqualsBuilder().append(header, rhs.header).append(tags, rhs.tags).isEquals();
	}

}
