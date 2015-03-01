package gg.buff.dorans.objects.summoner;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * MasteryPage
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class MasteryPage {

	/**
	 * Indicates if the mastery page is the current mastery page
	 * <p>
	 */
	@Expose
	private boolean current;
	/**
	 * Mastery Page ID
	 * <p>
	 */
	@Expose
	private long id;
	/**
	 * Collection of masteries associated with the mastery page.
	 * <p>
	 */
	@Expose
	private Object masteries;
	/**
	 * Mastery page name
	 * <p>
	 */
	@Expose
	private String name;

	/**
	 * Indicates if the mastery page is the current mastery page
	 * <p>
	 * 
	 * @return The current
	 */
	public boolean isCurrent() {
		return current;
	}

	/**
	 * Indicates if the mastery page is the current mastery page
	 * <p>
	 * 
	 * @param current
	 *            The current
	 */
	public void setCurrent(boolean current) {
		this.current = current;
	}

	/**
	 * Mastery Page ID
	 * <p>
	 * 
	 * @return The id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Mastery Page ID
	 * <p>
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Collection of masteries associated with the mastery page.
	 * <p>
	 * 
	 * @return The masteries
	 */
	public Object getMasteries() {
		return masteries;
	}

	/**
	 * Collection of masteries associated with the mastery page.
	 * <p>
	 * 
	 * @param masteries
	 *            The masteries
	 */
	public void setMasteries(Object masteries) {
		this.masteries = masteries;
	}

	/**
	 * Mastery page name
	 * <p>
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Mastery page name
	 * <p>
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(current).append(id).append(masteries).append(name).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof MasteryPage) == false) {
			return false;
		}
		MasteryPage rhs = ((MasteryPage) other);
		return new EqualsBuilder().append(current, rhs.current).append(id, rhs.id).append(masteries, rhs.masteries).append(name, rhs.name).isEquals();
	}

}
