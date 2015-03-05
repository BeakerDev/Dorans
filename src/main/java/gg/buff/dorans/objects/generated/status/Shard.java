package gg.buff.dorans.objects.generated.status;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Shard
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class Shard {

	@Expose
	private String hostname;
	@Expose
	private List<String> locales = new ArrayList<String>();
	@Expose
	private String name;
	@SerializedName("region_tag")
	@Expose
	private String regionTag;
	@Expose
	private String slug;

	/**
	 * @return The hostname
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * @param hostname
	 *            The hostname
	 */
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	/**
	 * @return The locales
	 */
	public List<String> getLocales() {
		return locales;
	}

	/**
	 * @param locales
	 *            The locales
	 */
	public void setLocales(List<String> locales) {
		this.locales = locales;
	}

	/**
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return The regionTag
	 */
	public String getRegionTag() {
		return regionTag;
	}

	/**
	 * @param regionTag
	 *            The region_tag
	 */
	public void setRegionTag(String regionTag) {
		this.regionTag = regionTag;
	}

	/**
	 * @return The slug
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * @param slug
	 *            The slug
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(hostname).append(locales).append(name).append(regionTag).append(slug).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Shard) == false) {
			return false;
		}
		Shard rhs = ((Shard) other);
		return new EqualsBuilder().append(hostname, rhs.hostname).append(locales, rhs.locales).append(name, rhs.name).append(regionTag, rhs.regionTag).append(slug, rhs.slug).isEquals();
	}

}
