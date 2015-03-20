package gg.buff.dorans.objects.generated.lol_static;

import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * LanguageStrings
 * <p>
 * This object contains language strings data
 */
@Generated("org.jsonschema2pojo")
public class LanguageStrings {

	@Expose
	private Map<String, String> data;
	@Expose
	private java.lang.String type;
	@Expose
	private java.lang.String version;

	/**
	 * @return The data
	 */
	public Map<String, String> getData() {
		return data;
	}

	/**
	 * @param data
	 *            The data
	 */
	public void setData(Map<String, String> data) {
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
		return new HashCodeBuilder().append(data).append(type).append(version).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof LanguageStrings) == false) {
			return false;
		}
		LanguageStrings rhs = ((LanguageStrings) other);
		return new EqualsBuilder().append(data, rhs.data).append(type, rhs.type).append(version, rhs.version).isEquals();
	}

}
