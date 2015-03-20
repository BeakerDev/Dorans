package gg.buff.dorans.objects.generated.lol_static;

import java.util.Map;
import javax.annotation.Generated;
import gg.buff.dorans.objects.generated.lol_static.Rune;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * RuneList
 * <p>
 * This object contains rune list data
 */
@Generated("org.jsonschema2pojo")
public class RuneList {

	/**
	 * BasicData
	 * <p>
	 * This object contains basic data
	 */
	@Expose
	private BasicData basic;
	@Expose
	private Map<String, Rune> data;
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
	public Map<String, Rune> getData() {
		return data;
	}

	/**
	 * @param data
	 *            The data
	 */
	public void setData(Map<String, Rune> data) {
		this.data = data;
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
		return new HashCodeBuilder().append(basic).append(data).append(type).append(version).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof RuneList) == false) {
			return false;
		}
		RuneList rhs = ((RuneList) other);
		return new EqualsBuilder().append(basic, rhs.basic).append(data, rhs.data).append(type, rhs.type).append(version, rhs.version).isEquals();
	}

}
