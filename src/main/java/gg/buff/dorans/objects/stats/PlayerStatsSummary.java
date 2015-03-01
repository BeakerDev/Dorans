package gg.buff.dorans.objects.stats;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * PlayerStatsSummary
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class PlayerStatsSummary {

	/**
	 * AggregatedStats
	 * <p>
	 */
	@Expose
	private AggregatedStats rank;
	/**
	 * Number of losses for this queue type. Returned for ranked queue types
	 * only
	 * <p>
	 */
	@Expose
	private int losses;
	/**
	 * Date stats were last modified specified as epoch milliseconds.
	 * <p>
	 */
	@Expose
	private long modifyDate;
	/**
	 * Player stats summary type
	 * <p>
	 */
	@Expose
	private PlayerStatsSummary.PlayerStatSummaryType playerStatSummaryType;
	/**
	 * Number of wins for this queue type.
	 * <p>
	 */
	@Expose
	private int wins;

	/**
	 * AggregatedStats
	 * <p>
	 * 
	 * @return The rank
	 */
	public AggregatedStats getRank() {
		return rank;
	}

	/**
	 * AggregatedStats
	 * <p>
	 * 
	 * @param rank
	 *            The rank
	 */
	public void setRank(AggregatedStats rank) {
		this.rank = rank;
	}

	/**
	 * Number of losses for this queue type. Returned for ranked queue types
	 * only
	 * <p>
	 * 
	 * @return The losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * Number of losses for this queue type. Returned for ranked queue types
	 * only
	 * <p>
	 * 
	 * @param losses
	 *            The losses
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}

	/**
	 * Date stats were last modified specified as epoch milliseconds.
	 * <p>
	 * 
	 * @return The modifyDate
	 */
	public long getModifyDate() {
		return modifyDate;
	}

	/**
	 * Date stats were last modified specified as epoch milliseconds.
	 * <p>
	 * 
	 * @param modifyDate
	 *            The modifyDate
	 */
	public void setModifyDate(long modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * Player stats summary type
	 * <p>
	 * 
	 * @return The playerStatSummaryType
	 */
	public PlayerStatsSummary.PlayerStatSummaryType getPlayerStatSummaryType() {
		return playerStatSummaryType;
	}

	/**
	 * Player stats summary type
	 * <p>
	 * 
	 * @param playerStatSummaryType
	 *            The playerStatSummaryType
	 */
	public void setPlayerStatSummaryType(PlayerStatsSummary.PlayerStatSummaryType playerStatSummaryType) {
		this.playerStatSummaryType = playerStatSummaryType;
	}

	/**
	 * Number of wins for this queue type.
	 * <p>
	 * 
	 * @return The wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * Number of wins for this queue type.
	 * <p>
	 * 
	 * @param wins
	 *            The wins
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(rank).append(losses).append(modifyDate).append(playerStatSummaryType).append(wins).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof PlayerStatsSummary) == false) {
			return false;
		}
		PlayerStatsSummary rhs = ((PlayerStatsSummary) other);
		return new EqualsBuilder().append(rank, rhs.rank).append(losses, rhs.losses).append(modifyDate, rhs.modifyDate).append(playerStatSummaryType, rhs.playerStatSummaryType).append(wins, rhs.wins).isEquals();
	}

	@Generated("org.jsonschema2pojo")
	public static enum PlayerStatSummaryType {

		@SerializedName("AramUnranked5x5")
		ARAM_UNRANKED_5_X_5("AramUnranked5x5"), @SerializedName("CoopVsAI")
		COOP_VS_AI("CoopVsAI"), @SerializedName("CoopVsAI3x3")
		COOP_VS_AI_3_X_3("CoopVsAI3x3"), @SerializedName("OdinUnranked")
		ODIN_UNRANKED("OdinUnranked"), @SerializedName("RankedPremade3x3")
		RANKED_PREMADE_3_X_3("RankedPremade3x3"), @SerializedName("RankedPremade5x5")
		RANKED_PREMADE_5_X_5("RankedPremade5x5"), @SerializedName("RankedSolo5x5")
		RANKED_SOLO_5_X_5("RankedSolo5x5"), @SerializedName("RankedTeam3x3")
		RANKED_TEAM_3_X_3("RankedTeam3x3"), @SerializedName("RankedTeam5x5")
		RANKED_TEAM_5_X_5("RankedTeam5x5"), @SerializedName("Unranked")
		UNRANKED("Unranked"), @SerializedName("Unranked3x3")
		UNRANKED_3_X_3("Unranked3x3"), @SerializedName("OneForAll5x5")
		ONE_FOR_ALL_5_X_5("OneForAll5x5"), @SerializedName("FirstBlood1x1")
		FIRST_BLOOD_1_X_1("FirstBlood1x1"), @SerializedName("FirstBlood2x2")
		FIRST_BLOOD_2_X_2("FirstBlood2x2"), @SerializedName("SummonersRift6x6")
		SUMMONERS_RIFT_6_X_6("SummonersRift6x6"), @SerializedName("CAP5x5")
		CAP_5_X_5("CAP5x5"), @SerializedName("URF")
		URF("URF"), @SerializedName("URFBots")
		URF_BOTS("URFBots"), @SerializedName("NightmareBot")
		NIGHTMARE_BOT("NightmareBot"), @SerializedName("Ascension")
		ASCENSION("Ascension"), @SerializedName("Hexakill")
		HEXAKILL("Hexakill"), @SerializedName("KingPoro")
		KING_PORO("KingPoro"), @SerializedName("CounterPick")
		COUNTER_PICK("CounterPick");
		private final String value;
		private static Map<String, PlayerStatsSummary.PlayerStatSummaryType> constants = new HashMap<String, PlayerStatsSummary.PlayerStatSummaryType>();

		static {
			for (PlayerStatsSummary.PlayerStatSummaryType c : values()) {
				constants.put(c.value, c);
			}
		}

		private PlayerStatSummaryType(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static PlayerStatsSummary.PlayerStatSummaryType fromValue(String value) {
			PlayerStatsSummary.PlayerStatSummaryType constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

}
