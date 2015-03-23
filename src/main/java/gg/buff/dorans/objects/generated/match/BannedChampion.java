package gg.buff.dorans.objects.generated.match;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * BannedChampion
 * <p>
 * This object contains information about banned champions
 */
@Generated("org.jsonschema2pojo")
public class BannedChampion {

	/**
	 * Banned champion ID
	 * <p>
	 */
	@Expose
	private int championId;
	/**
	 * Turn during which the champion was banned
	 * <p>
	 */
	@Expose
	private int pickTurn;

	/**
	 * Banned champion ID
	 * <p>
	 * 
	 * @return The championId
	 */
	public int getChampionId() {
		return championId;
	}

	/**
	 * Banned champion ID
	 * <p>
	 * 
	 * @param championId
	 *            The championId
	 */
	public void setChampionId(int championId) {
		this.championId = championId;
	}

	/**
	 * Turn during which the champion was banned
	 * <p>
	 * 
	 * @return The pickTurn
	 */
	public int getPickTurn() {
		return pickTurn;
	}

	/**
	 * Turn during which the champion was banned
	 * <p>
	 * 
	 * @param pickTurn
	 *            The pickTurn
	 */
	public void setPickTurn(int pickTurn) {
		this.pickTurn = pickTurn;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(championId).append(pickTurn).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof BannedChampion) == false) {
			return false;
		}
		BannedChampion rhs = ((BannedChampion) other);
		return new EqualsBuilder().append(championId, rhs.championId).append(pickTurn, rhs.pickTurn).isEquals();
	}

}
