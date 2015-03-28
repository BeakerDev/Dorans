package gg.buff.dorans.objects.generated.lol_static;

import java.util.Map;
import javax.annotation.Generated;
import gg.buff.dorans.objects.generated.lol_static.SummonerSpell;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * SummonerSpellList
 * <p>
 * This object contains summoner spell list data
 */
@Generated("org.jsonschema2pojo")
public class SummonerSpellList {

	@Expose
	private Map<String, SummonerSpell> data;
	@Expose
	private java.lang.String type;
	@Expose
	private java.lang.String version;

	/**
	 * @return The data
	 */
	public Map<String, SummonerSpell> getData() {
		return data;
	}

	/**
	 * @param data
	 *            The data
	 */
	public void setData(Map<String, SummonerSpell> data) {
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
		if ((other instanceof SummonerSpellList) == false) {
			return false;
		}
		SummonerSpellList rhs = ((SummonerSpellList) other);
		return new EqualsBuilder().append(data, rhs.data).append(type, rhs.type).append(version, rhs.version).isEquals();
	}

}
