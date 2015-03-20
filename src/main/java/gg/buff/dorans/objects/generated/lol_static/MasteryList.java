package gg.buff.dorans.objects.generated.lol_static;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * MasteryList
 * <p>
 * This object contains meta data
 */
@Generated("org.jsonschema2pojo")
public class MasteryList {

	@Expose
	private Map data;
	/**
	 * MasteryTree
	 * <p>
	 * This object contains mastery tree data
	 */
	@Expose
	private MasteryTree tree;
	@Expose
	private String type;
	@Expose
	private String version;

	/**
	 * @return The data
	 */
	public Map getData() {
		return data;
	}

	/**
	 * @param data
	 *            The data
	 */
	public void setData(Map data) {
		this.data = data;
	}

	/**
	 * MasteryTree
	 * <p>
	 * This object contains mastery tree data
	 * 
	 * @return The tree
	 */
	public MasteryTree getTree() {
		return tree;
	}

	/**
	 * MasteryTree
	 * <p>
	 * This object contains mastery tree data
	 * 
	 * @param tree
	 *            The tree
	 */
	public void setTree(MasteryTree tree) {
		this.tree = tree;
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

	/**
	 * @return The version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            The version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(data).append(tree).append(type).append(version).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof MasteryList) == false) {
			return false;
		}
		MasteryList rhs = ((MasteryList) other);
		return new EqualsBuilder().append(data, rhs.data).append(tree, rhs.tree).append(type, rhs.type).append(version, rhs.version).isEquals();
	}

}
