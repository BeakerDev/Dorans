package gg.buff.dorans.objects.generated.status;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Service
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class Service {

	@Expose
	private List<Incident> incidents = new ArrayList<Incident>();
	@Expose
	private String name;
	@Expose
	private String slug;
	@Expose
	private Service.Status status;

	/**
	 * @return The incidents
	 */
	public List<Incident> getIncidents() {
		return incidents;
	}

	/**
	 * @param incidents
	 *            The incidents
	 */
	public void setIncidents(List<Incident> incidents) {
		this.incidents = incidents;
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

	/**
	 * @return The status
	 */
	public Service.Status getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            The status
	 */
	public void setStatus(Service.Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(incidents).append(name).append(slug).append(status).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Service) == false) {
			return false;
		}
		Service rhs = ((Service) other);
		return new EqualsBuilder().append(incidents, rhs.incidents).append(name, rhs.name).append(slug, rhs.slug).append(status, rhs.status).isEquals();
	}

	@Generated("org.jsonschema2pojo")
	public static enum Status {

		@SerializedName("Online")
		ONLINE("Online"), @SerializedName("Alert")
		ALERT("Alert"), @SerializedName("Offline")
		OFFLINE("Offline"), @SerializedName("Deploying")
		DEPLOYING("Deploying");
		private final String value;
		private static Map<String, Service.Status> constants = new HashMap<String, Service.Status>();

		static {
			for (Service.Status c : values()) {
				constants.put(c.value, c);
			}
		}

		private Status(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static Service.Status fromValue(String value) {
			Service.Status constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

}
