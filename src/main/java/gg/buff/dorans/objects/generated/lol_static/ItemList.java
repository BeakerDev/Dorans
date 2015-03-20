package gg.buff.dorans.objects.generated.lol_static;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import gg.buff.dorans.objects.generated.lol_static.Item;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * ItemList
 * <p>
 * This object contains item list data
 */
@Generated("org.jsonschema2pojo")
public class ItemList {

	/**
	 * BasicData
	 * <p>
	 * This object contains basic data
	 */
	@Expose
	private BasicData basic;
	@Expose
	private Map<String, Item> data;
	@Expose
	private List<Group> groups = new ArrayList<Group>();
	/**
	 * ItemTree
	 * <p>
	 * This object contains item tree data
	 */
	@Expose
	private ItemTree tree;
	@Expose
	private java.lang.String type;
	@Expose
	private java.lang.String version;

	/**
	 * BasicData
	 * <p>
	 * This object contains basic data
	 * 
	 * @return The basic
	 */
	public BasicData getBasic() {
		return basic;
	}

	/**
	 * BasicData
	 * <p>
	 * This object contains basic data
	 * 
	 * @param basic
	 *            The basic
	 */
	public void setBasic(BasicData basic) {
		this.basic = basic;
	}

	/**
	 * @return The data
	 */
	public Map<String, Item> getData() {
		return data;
	}

	/**
	 * @param data
	 *            The data
	 */
	public void setData(Map<String, Item> data) {
		this.data = data;
	}

	/**
	 * @return The groups
	 */
	public List<Group> getGroups() {
		return groups;
	}

	/**
	 * @param groups
	 *            The groups
	 */
	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	/**
	 * ItemTree
	 * <p>
	 * This object contains item tree data
	 * 
	 * @return The tree
	 */
	public ItemTree getTree() {
		return tree;
	}

	/**
	 * ItemTree
	 * <p>
	 * This object contains item tree data
	 * 
	 * @param tree
	 *            The tree
	 */
	public void setTree(ItemTree tree) {
		this.tree = tree;
	}

	/**
	 * @return The type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * @param type
	 *            The type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * @return The version
	 */
	public java.lang.String getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            The version
	 */
	public void setVersion(java.lang.String version) {
		this.version = version;
	}

	@Override
	public java.lang.String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(basic).append(data).append(groups).append(tree).append(type).append(version).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ItemList) == false) {
			return false;
		}
		ItemList rhs = ((ItemList) other);
		return new EqualsBuilder().append(basic, rhs.basic).append(data, rhs.data).append(groups, rhs.groups).append(tree, rhs.tree).append(type, rhs.type).append(version, rhs.version).isEquals();
	}

}
