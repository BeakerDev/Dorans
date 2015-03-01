package gg.buff.dorans.objects.summoner;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * RunePage
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class RunePage {

	/**
	 * Indicates if the page is the current page.
	 * <p>
	 */
	@Expose
	private boolean current;
	/**
	 * Rune page ID
	 * <p>
	 */
	@Expose
	private long id;
	/**
	 * Rune page name
	 * <p>
	 */
	@Expose
	private String name;
	/**
	 * Collection of rune slots associated with the rune page
	 * <p>
	 */
	@Expose
	private List<Object> slots = new ArrayList<Object>();

	/**
	 * Indicates if the page is the current page.
	 * <p>
	 * 
	 * @return The current
	 */
	public boolean isCurrent() {
		return current;
	}

	/**
	 * Indicates if the page is the current page.
	 * <p>
	 * 
	 * @param current
	 *            The current
	 */
	public void setCurrent(boolean current) {
		this.current = current;
	}

	/**
	 * Rune page ID
	 * <p>
	 * 
	 * @return The id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Rune page ID
	 * <p>
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Rune page name
	 * <p>
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Rune page name
	 * <p>
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Collection of rune slots associated with the rune page
	 * <p>
	 * 
	 * @return The slots
	 */
	public List<Object> getSlots() {
		return slots;
	}

	/**
	 * Collection of rune slots associated with the rune page
	 * <p>
	 * 
	 * @param slots
	 *            The slots
	 */
	public void setSlots(List<Object> slots) {
		this.slots = slots;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(current).append(id).append(name).append(slots).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof RunePage) == false) {
			return false;
		}
		RunePage rhs = ((RunePage) other);
		return new EqualsBuilder().append(current, rhs.current).append(id, rhs.id).append(name, rhs.name).append(slots, rhs.slots).isEquals();
	}

}
