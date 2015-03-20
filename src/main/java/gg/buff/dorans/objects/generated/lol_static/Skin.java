package gg.buff.dorans.objects.generated.lol_static;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Skin
 * <p>
 * This object contains champion skin data
 */
@Generated("org.jsonschema2pojo")
public class Skin {

	@Expose
	private int id;
	@Expose
	private String name;
	@Expose
	private int num;

	/**
	 * @return The id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            The id
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return The num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num
	 *            The num
	 */
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(name).append(num).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Skin) == false) {
			return false;
		}
		Skin rhs = ((Skin) other);
		return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(num, rhs.num).isEquals();
	}

}
