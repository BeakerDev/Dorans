package gg.buff.dorans.objects.generated.stats;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * RankedStats
 * <p>
 * This object contains ranked stats information
 */
@Generated("org.jsonschema2pojo")
public class RankedStats {

	/**
	 * Collection of aggregated stats summarized by champion.
	 * <p>
	 */
	@Expose
	private List<ChampionStats> champions = new ArrayList<ChampionStats>();
	/**
	 * Date stats were last modified specified as epoch milliseconds
	 * <p>
	 */
	@Expose
	private ModifyDate modifyDate;
	/**
	 * Summoner ID
	 * <p>
	 */
	@Expose
	private int summonerId;

	/**
	 * Collection of aggregated stats summarized by champion.
	 * <p>
	 * 
	 * @return The champions
	 */
	public List<ChampionStats> getChampions() {
		return champions;
	}

	/**
	 * Collection of aggregated stats summarized by champion.
	 * <p>
	 * 
	 * @param champions
	 *            The champions
	 */
	public void setChampions(List<ChampionStats> champions) {
		this.champions = champions;
	}

	/**
	 * Date stats were last modified specified as epoch milliseconds
	 * <p>
	 * 
	 * @return The modifyDate
	 */
	public ModifyDate getModifyDate() {
		return modifyDate;
	}

	/**
	 * Date stats were last modified specified as epoch milliseconds
	 * <p>
	 * 
	 * @param modifyDate
	 *            The modifyDate
	 */
	public void setModifyDate(ModifyDate modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * Summoner ID
	 * <p>
	 * 
	 * @return The summonerId
	 */
	public int getSummonerId() {
		return summonerId;
	}

	/**
	 * Summoner ID
	 * <p>
	 * 
	 * @param summonerId
	 *            The summonerId
	 */
	public void setSummonerId(int summonerId) {
		this.summonerId = summonerId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(champions).append(modifyDate).append(summonerId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof RankedStats) == false) {
			return false;
		}
		RankedStats rhs = ((RankedStats) other);
		return new EqualsBuilder().append(champions, rhs.champions).append(modifyDate, rhs.modifyDate).append(summonerId, rhs.summonerId).isEquals();
	}

}
