package gg.buff.dorans.objects.league;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class League {

	/**
	 * The requested league entries
	 * <p>
	 */
	@Expose
	private List<LeagueEntry> entries = new ArrayList<LeagueEntry>();
	/**
	 * This name is an internal place-holder name only. Display and localization
	 * of names in the game client are handled client-side.
	 * <p>
	 */
	@Expose
	private String name;
	/**
	 * Specifies the relevant participant that is a member of this league (i.e.,
	 * a requested summoner ID, a requested team ID, or the ID of a team to
	 * which one of the requested summoners belongs). Only present when full
	 * league is requested so that participant's entry can be identified. Not
	 * present when individual entry is requested.
	 * <p>
	 */
	@Expose
	private String participantId;
	/**
	 * The league's queue type.
	 * <p>
	 */
	@Expose
	private League.Queue queue;
	/**
	 * The league's tier
	 * <p>
	 */
	@Expose
	private League.Tier tier;

	/**
	 * The requested league entries
	 * <p>
	 * 
	 * @return The entries
	 */
	public List<LeagueEntry> getEntries() {
		return entries;
	}

	/**
	 * The requested league entries
	 * <p>
	 * 
	 * @param entries
	 *            The entries
	 */
	public void setEntries(List<LeagueEntry> entries) {
		this.entries = entries;
	}

	/**
	 * This name is an internal place-holder name only. Display and localization
	 * of names in the game client are handled client-side.
	 * <p>
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * This name is an internal place-holder name only. Display and localization
	 * of names in the game client are handled client-side.
	 * <p>
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Specifies the relevant participant that is a member of this league (i.e.,
	 * a requested summoner ID, a requested team ID, or the ID of a team to
	 * which one of the requested summoners belongs). Only present when full
	 * league is requested so that participant's entry can be identified. Not
	 * present when individual entry is requested.
	 * <p>
	 * 
	 * @return The participantId
	 */
	public String getParticipantId() {
		return participantId;
	}

	/**
	 * Specifies the relevant participant that is a member of this league (i.e.,
	 * a requested summoner ID, a requested team ID, or the ID of a team to
	 * which one of the requested summoners belongs). Only present when full
	 * league is requested so that participant's entry can be identified. Not
	 * present when individual entry is requested.
	 * <p>
	 * 
	 * @param participantId
	 *            The participantId
	 */
	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	/**
	 * The league's queue type.
	 * <p>
	 * 
	 * @return The queue
	 */
	public League.Queue getQueue() {
		return queue;
	}

	/**
	 * The league's queue type.
	 * <p>
	 * 
	 * @param queue
	 *            The queue
	 */
	public void setQueue(League.Queue queue) {
		this.queue = queue;
	}

	/**
	 * The league's tier
	 * <p>
	 * 
	 * @return The tier
	 */
	public League.Tier getTier() {
		return tier;
	}

	/**
	 * The league's tier
	 * <p>
	 * 
	 * @param tier
	 *            The tier
	 */
	public void setTier(League.Tier tier) {
		this.tier = tier;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(entries).append(name).append(participantId).append(queue).append(tier).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof League) == false) {
			return false;
		}
		League rhs = ((League) other);
		return new EqualsBuilder().append(entries, rhs.entries).append(name, rhs.name).append(participantId, rhs.participantId).append(queue, rhs.queue).append(tier, rhs.tier).isEquals();
	}

	@Generated("org.jsonschema2pojo")
	public static enum Queue {

		@SerializedName("RANKED_SOLO_5x5")
		RANKED_SOLO_5_X_5("RANKED_SOLO_5x5"), @SerializedName("RANKED_TEAM_3x3")
		RANKED_TEAM_3_X_3("RANKED_TEAM_3x3"), @SerializedName("RANKED_TEAM_5x5")
		RANKED_TEAM_5_X_5("RANKED_TEAM_5x5");
		private final String value;
		private static Map<String, League.Queue> constants = new HashMap<String, League.Queue>();

		static {
			for (League.Queue c : values()) {
				constants.put(c.value, c);
			}
		}

		private Queue(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static League.Queue fromValue(String value) {
			League.Queue constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

	@Generated("org.jsonschema2pojo")
	public static enum Tier {

		@SerializedName("CHALLENGER")
		CHALLENGER("CHALLENGER"), @SerializedName("MASTER")
		MASTER("MASTER"), @SerializedName("DIAMOND")
		DIAMOND("DIAMOND"), @SerializedName("PLATINUM")
		PLATINUM("PLATINUM"), @SerializedName("GOLD")
		GOLD("GOLD"), @SerializedName("SILVER")
		SILVER("SILVER"), @SerializedName("BRONZE")
		BRONZE("BRONZE");
		private final String value;
		private static Map<String, League.Tier> constants = new HashMap<String, League.Tier>();

		static {
			for (League.Tier c : values()) {
				constants.put(c.value, c);
			}
		}

		private Tier(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static League.Tier fromValue(String value) {
			League.Tier constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

}
