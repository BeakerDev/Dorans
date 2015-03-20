package gg.buff.dorans.objects.generated.lol_static;

import java.util.Map;
import javax.annotation.Generated;
import gg.buff.dorans.objects.generated.lol_static.Champion;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * ChampionList
 * <p>
 * This object contains champion list data
 */
@Generated("org.jsonschema2pojo")
public class ChampionList {

	@Expose
	private Map<String, Champion> data;
	@Expose
	private java.lang.String format;
	@Expose
	private Map<String, String> keys;
	@Expose
	private java.lang.String type;
	@Expose
	private java.lang.String version;

	/**
	 * @return The data
	 */
	public Map<String, Champion> getData() {
		return data;
	}

	/**
	 * @param data
	 *            The data
	 */
	public void setData(Map<String, Champion> data) {
		this.data = data;
	}

	/**
	 * @return The format
	 */
	public java.lang.String getFormat() {
		return format;
	}

	/**
	 * @param format
	 *            The format
	 */
	public void setFormat(java.lang.String format) {
		this.format = format;
	}

	/**
	 * @return The keys
	 */
	public Map<String, String> getKeys() {
		return keys;
	}

	/**
	 * @param keys
	 *            The keys
	 */
	public void setKeys(Map<String, String> keys) {
		this.keys = keys;
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
		return new HashCodeBuilder().append(data).append(format).append(keys).append(type).append(version).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ChampionList) == false) {
			return false;
		}
		ChampionList rhs = ((ChampionList) other);
		return new EqualsBuilder().append(data, rhs.data).append(format, rhs.format).append(keys, rhs.keys).append(type, rhs.type).append(version, rhs.version).isEquals();
	}

}
