package gg.buff.dorans.objects.generated.lol_static;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * MapData
 * <p>
 * This object contains map data
 */
@Generated("org.jsonschema2pojo")
public class MapData {

	@Expose
	private Map data;
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
		return new HashCodeBuilder().append(data).append(type).append(version).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof MapData) == false) {
			return false;
		}
		MapData rhs = ((MapData) other);
		return new EqualsBuilder().append(data, rhs.data).append(type, rhs.type).append(version, rhs.version).isEquals();
	}

}
