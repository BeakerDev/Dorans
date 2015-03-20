package gg.buff.dorans.objects.generated.lol_static;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Gold
 * <p>
 * This object contains item gold data
 */
@Generated("org.jsonschema2pojo")
public class Gold {

	@Expose
	private int base;
	@Expose
	private boolean purchasable;
	@Expose
	private int sell;
	@Expose
	private int total;

	/**
	 * @return The base
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param base
	 *            The base
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return The purchasable
	 */
	public boolean isPurchasable() {
		return purchasable;
	}

	/**
	 * @param purchasable
	 *            The purchasable
	 */
	public void setPurchasable(boolean purchasable) {
		this.purchasable = purchasable;
	}

	/**
	 * @return The sell
	 */
	public int getSell() {
		return sell;
	}

	/**
	 * @param sell
	 *            The sell
	 */
	public void setSell(int sell) {
		this.sell = sell;
	}

	/**
	 * @return The total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            The total
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(base).append(purchasable).append(sell).append(total).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Gold) == false) {
			return false;
		}
		Gold rhs = ((Gold) other);
		return new EqualsBuilder().append(base, rhs.base).append(purchasable, rhs.purchasable).append(sell, rhs.sell).append(total, rhs.total).isEquals();
	}

}
