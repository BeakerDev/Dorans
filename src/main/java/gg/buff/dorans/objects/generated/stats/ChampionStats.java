package gg.buff.dorans.objects.generated.stats;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * ChampionStats
 * <p>
 * This object contains a collection of champion stats information
 */
@Generated("org.jsonschema2pojo")
public class ChampionStats {

	/**
	 * Champion ID. Note that champion ID 0 represents the combined stats for
	 * all champions. For static information correlating to champion IDs, please
	 * refer to the LoL Static Data API.
	 * <p>
	 */
	@Expose
	private int id;
	/**
	 * AggregatedStats
	 * <p>
	 */
	@Expose
	private AggregatedStats stats;

	/**
	 * Champion ID. Note that champion ID 0 represents the combined stats for
	 * all champions. For static information correlating to champion IDs, please
	 * refer to the LoL Static Data API.
	 * <p>
	 * 
	 * @return The id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Champion ID. Note that champion ID 0 represents the combined stats for
	 * all champions. For static information correlating to champion IDs, please
	 * refer to the LoL Static Data API.
	 * <p>
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * AggregatedStats
	 * <p>
	 * 
	 * @return The stats
	 */
	public AggregatedStats getStats() {
		return stats;
	}

	/**
	 * AggregatedStats
	 * <p>
	 * 
	 * @param stats
	 *            The stats
	 */
	public void setStats(AggregatedStats stats) {
		this.stats = stats;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(stats).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ChampionStats) == false) {
			return false;
		}
		ChampionStats rhs = ((ChampionStats) other);
		return new EqualsBuilder().append(id, rhs.id).append(stats, rhs.stats).isEquals();
	}

}
