package gg.buff.dorans.objects.generated.stats;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * PlayerStatsSummaryList
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class PlayerStatsSummaryList {

	/**
	 * Collection of player stats summaries associated with the summoner
	 * <p>
	 */
	@Expose
	private List<PlayerStatsSummaryList> rank = new ArrayList<PlayerStatsSummaryList>();
	/**
	 * Summoner ID
	 * <p>
	 */
	@Expose
	private long summonerId;

	/**
	 * Collection of player stats summaries associated with the summoner
	 * <p>
	 * 
	 * @return The rank
	 */
	public List<PlayerStatsSummaryList> getRank() {
		return rank;
	}

	/**
	 * Collection of player stats summaries associated with the summoner
	 * <p>
	 * 
	 * @param rank
	 *            The rank
	 */
	public void setRank(List<PlayerStatsSummaryList> rank) {
		this.rank = rank;
	}

	/**
	 * Summoner ID
	 * <p>
	 * 
	 * @return The summonerId
	 */
	public long getSummonerId() {
		return summonerId;
	}

	/**
	 * Summoner ID
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
		return new HashCodeBuilder().append(rank).append(summonerId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof PlayerStatsSummaryList) == false) {
			return false;
		}
		PlayerStatsSummaryList rhs = ((PlayerStatsSummaryList) other);
		return new EqualsBuilder().append(rank, rhs.rank).append(summonerId, rhs.summonerId).isEquals();
	}

}
