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
 * Incident
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class Incident {

	@Expose
	private boolean active;
	@SerializedName("created_at")
	@Expose
	private String createdAt;
	@Expose
	private long id;
	@Expose
	private List<Message> updates = new ArrayList<Message>();

	/**
	 * @return The active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active
	 *            The active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return The createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt
	 *            The created_at
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return The id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            The id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return The updates
	 */
	public List<Message> getUpdates() {
		return updates;
	}

	/**
	 * @param updates
	 *            The updates
	 */
	public void setUpdates(List<Message> updates) {
		this.updates = updates;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(active).append(createdAt).append(id).append(updates).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Incident) == false) {
			return false;
		}
		Incident rhs = ((Incident) other);
		return new EqualsBuilder().append(active, rhs.active).append(createdAt, rhs.createdAt).append(id, rhs.id).append(updates, rhs.updates).isEquals();
	}

}
