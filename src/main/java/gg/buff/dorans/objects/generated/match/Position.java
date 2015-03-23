package gg.buff.dorans.objects.generated.match;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Position
 * <p>
 * This object contains the participant frame position information
 */
@Generated("org.jsonschema2pojo")
public class Position {

	@Expose
	private int x;
	@Expose
	private int y;

	/**
	 * @return The x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 *            The x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return The y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 *            The y
	 */
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(x).append(y).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Position) == false) {
			return false;
		}
		Position rhs = ((Position) other);
		return new EqualsBuilder().append(x, rhs.x).append(y, rhs.y).isEquals();
	}

}
