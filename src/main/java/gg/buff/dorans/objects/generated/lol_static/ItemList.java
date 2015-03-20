
package gg.buff.dorans.objects.generated.lol_static;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import item-tree.json;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * ItemList
 * <p>
 * This object contains item list data
 * 
 */
@Generated("org.jsonschema2pojo")
public class ItemList {

    /**
     * BasicData
     * <p>
     * This object contains basic data
     * 
     */
    @Expose
    private BasicData basic;
    @Expose
    private Map data;
    @Expose
    private List<Group> groups = new ArrayList<Group>();
    @Expose
    private json tree;
    @Expose
    private String type;
    @Expose
    private String version;

    /**
     * BasicData
     * <p>
     * This object contains basic data
     * 
     * @return
     *     The basic
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
     *     The basic
     */
    public void setBasic(BasicData basic) {
        this.basic = basic;
    }

    /**
     * 
     * @return
     *     The data
     */
    public Map getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Map data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The groups
     */
    public List<Group> getGroups() {
        return groups;
    }

    /**
     * 
     * @param groups
     *     The groups
     */
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    /**
     * 
     * @return
     *     The tree
     */
    public json getTree() {
        return tree;
    }

    /**
     * 
     * @param tree
     *     The tree
     */
    public void setTree(json tree) {
        this.tree = tree;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The version
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
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
