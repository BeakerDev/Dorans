package gg.buff.dorans.objects.generated.lol_static;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * SpellVars
 * <p>
 * This object contains spell vars data
 */
@Generated("org.jsonschema2pojo")
public class SpellVars {

	@Expose
	private List<Double> coeff = new ArrayList<Double>();
	@Expose
	private String dyn;
	@Expose
	private String key;
	@Expose
	private String link;
	@Expose
	private String ranksWith;

	/**
	 * @return The coeff
	 */
	public List<Double> getCoeff() {
		return coeff;
	}

	/**
	 * @param coeff
	 *            The coeff
	 */
	public void setCoeff(List<Double> coeff) {
		this.coeff = coeff;
	}

	/**
	 * @return The dyn
	 */
	public String getDyn() {
		return dyn;
	}

	/**
	 * @param dyn
	 *            The dyn
	 */
	public void setDyn(String dyn) {
		this.dyn = dyn;
	}

	/**
	 * @return The key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key
	 *            The key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return The link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link
	 *            The link
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return The ranksWith
	 */
	public String getRanksWith() {
		return ranksWith;
	}

	/**
	 * @param ranksWith
	 *            The ranksWith
	 */
	public void setRanksWith(String ranksWith) {
		this.ranksWith = ranksWith;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(coeff).append(dyn).append(key).append(link).append(ranksWith).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof SpellVars) == false) {
			return false;
		}
		SpellVars rhs = ((SpellVars) other);
		return new EqualsBuilder().append(coeff, rhs.coeff).append(dyn, rhs.dyn).append(key, rhs.key).append(link, rhs.link).append(ranksWith, rhs.ranksWith).isEquals();
	}

}
