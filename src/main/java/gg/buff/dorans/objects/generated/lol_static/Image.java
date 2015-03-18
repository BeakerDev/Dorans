package gg.buff.dorans.objects.generated.lol_static;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Image
 * <p>
 * This object contains spell vars data
 */
@Generated("org.jsonschema2pojo")
public class Image {

	@Expose
	private String full;
	@Expose
	private String group;
	@Expose
	private int h;
	@Expose
	private String sprite;
	@Expose
	private int w;
	@Expose
	private int x;
	@Expose
	private int y;

	/**
	 * @return The full
	 */
	public String getFull() {
		return full;
	}

	/**
	 * @param full
	 *            The full
	 */
	public void setFull(String full) {
		this.full = full;
	}

	/**
	 * @return The group
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * @param group
	 *            The group
	 */
	public void setGroup(String group) {
		this.group = group;
	}

	/**
	 * @return The h
	 */
	public int getH() {
		return h;
	}

	/**
	 * @param h
	 *            The h
	 */
	public void setH(int h) {
		this.h = h;
	}

	/**
	 * @return The sprite
	 */
	public String getSprite() {
		return sprite;
	}

	/**
	 * @param sprite
	 *            The sprite
	 */
	public void setSprite(String sprite) {
		this.sprite = sprite;
	}

	/**
	 * @return The w
	 */
	public int getW() {
		return w;
	}

	/**
	 * @param w
	 *            The w
	 */
	public void setW(int w) {
		this.w = w;
	}

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
		return new HashCodeBuilder().append(full).append(group).append(h).append(sprite).append(w).append(x).append(y).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Image) == false) {
			return false;
		}
		Image rhs = ((Image) other);
		return new EqualsBuilder().append(full, rhs.full).append(group, rhs.group).append(h, rhs.h).append(sprite, rhs.sprite).append(w, rhs.w).append(x, rhs.x).append(y, rhs.y).isEquals();
	}

}
