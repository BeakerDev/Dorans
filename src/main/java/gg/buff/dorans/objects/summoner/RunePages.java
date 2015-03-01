package gg.buff.dorans.objects.summoner;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * RunePages
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class RunePages {

	/**
	 * Collection of rune pages associated with the summoner.
	 * <p>
	 */
	@Expose
	private List<RunePage> pages = new ArrayList<RunePage>();
	/**
	 * Summoner ID.
	 * <p>
	 */
	@Expose
	private long summonerId;

	/**
	 * Collection of rune pages associated with the summoner.
	 * <p>
	 * 
	 * @return The pages
	 */
	public List<RunePage> getPages() {
		return pages;
	}

	/**
	 * Collection of rune pages associated with the summoner.
	 * <p>
	 * 
	 * @param pages
	 *            The pages
	 */
	public void setPages(List<RunePage> pages) {
		this.pages = pages;
	}

	/**
	 * Summoner ID.
	 * <p>
	 * 
	 * @return The summonerId
	 */
	public long getSummonerId() {
		return summonerId;
	}

	/**
	 * Summoner ID.
	 * <p>
	 * 
	 * @param summonerId
	 *            The summonerId
	 */
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(pages).append(summonerId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof RunePages) == false) {
			return false;
		}
		RunePages rhs = ((RunePages) other);
		return new EqualsBuilder().append(pages, rhs.pages).append(summonerId, rhs.summonerId).isEquals();
	}

}
