package gg.buff.dorans.objects.match;

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

/**
 * MatchDetail
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class MatchDetail {

	/**
	 * Match map ID
	 * <p>
	 */
	@Expose
	private Object mapId;
	/**
	 * Match creation time. Designates when the team select lobby is created
	 * and/or the match is made through match making, not when the game actually
	 * starts.
	 * <p>
	 */
	@Expose
	private long matchCreation;
	/**
	 * Match duration
	 * <p>
	 */
	@Expose
	private long matchDuration;
	/**
	 * ID of the match
	 * <p>
	 */
	@Expose
	private long matchId;
	/**
	 * Match mode
	 * <p>
	 */
	@Expose
	private MatchDetail.MatchMode matchMode;
	/**
	 * Match version
	 * <p>
	 */
	@Expose
	private String matchVersion;
	/**
	 * Participant identity information
	 * <p>
	 */
	@Expose
	private List<ParticipantIdentity> participantIdentities = new ArrayList<ParticipantIdentity>();
	/**
	 * Participant information
	 * <p>
	 */
	@Expose
	private List<Participant> participants = new ArrayList<Participant>();
	/**
	 * Platform ID of the match
	 * <p>
	 */
	@Expose
	private String platformId;
	/**
	 * Match queue type
	 * <p>
	 */
	@Expose
	private MatchDetail.QueueType queueType;
	/**
	 * Region where the match was played
	 * <p>
	 */
	@Expose
	private String region;
	/**
	 * Match mode
	 * <p>
	 */
	@Expose
	private MatchDetail.Season season;
	/**
	 * Team information
	 * <p>
	 */
	@Expose
	private List<Team> teams = new ArrayList<Team>();
	/**
	 * Timeline
	 * <p>
	 */
	@Expose
	private Timeline timeline;

	/**
	 * Match map ID
	 * <p>
	 * 
	 * @return The mapId
	 */
	public Object getMapId() {
		return mapId;
	}

	/**
	 * Match map ID
	 * <p>
	 * 
	 * @param mapId
	 *            The mapId
	 */
	public void setMapId(Object mapId) {
		this.mapId = mapId;
	}

	/**
	 * Match creation time. Designates when the team select lobby is created
	 * and/or the match is made through match making, not when the game actually
	 * starts.
	 * <p>
	 * 
	 * @return The matchCreation
	 */
	public long getMatchCreation() {
		return matchCreation;
	}

	/**
	 * Match creation time. Designates when the team select lobby is created
	 * and/or the match is made through match making, not when the game actually
	 * starts.
	 * <p>
	 * 
	 * @param matchCreation
	 *            The matchCreation
	 */
	public void setMatchCreation(long matchCreation) {
		this.matchCreation = matchCreation;
	}

	/**
	 * Match duration
	 * <p>
	 * 
	 * @return The matchDuration
	 */
	public long getMatchDuration() {
		return matchDuration;
	}

	/**
	 * Match duration
	 * <p>
	 * 
	 * @param matchDuration
	 *            The matchDuration
	 */
	public void setMatchDuration(long matchDuration) {
		this.matchDuration = matchDuration;
	}

	/**
	 * ID of the match
	 * <p>
	 * 
	 * @return The matchId
	 */
	public long getMatchId() {
		return matchId;
	}

	/**
	 * ID of the match
	 * <p>
	 * 
	 * @param matchId
	 *            The matchId
	 */
	public void setMatchId(long matchId) {
		this.matchId = matchId;
	}

	/**
	 * Match mode
	 * <p>
	 * 
	 * @return The matchMode
	 */
	public MatchDetail.MatchMode getMatchMode() {
		return matchMode;
	}

	/**
	 * Match mode
	 * <p>
	 * 
	 * @param matchMode
	 *            The matchMode
	 */
	public void setMatchMode(MatchDetail.MatchMode matchMode) {
		this.matchMode = matchMode;
	}

	/**
	 * Match version
	 * <p>
	 * 
	 * @return The matchVersion
	 */
	public String getMatchVersion() {
		return matchVersion;
	}

	/**
	 * Match version
	 * <p>
	 * 
	 * @param matchVersion
	 *            The matchVersion
	 */
	public void setMatchVersion(String matchVersion) {
		this.matchVersion = matchVersion;
	}

	/**
	 * Participant identity information
	 * <p>
	 * 
	 * @return The participantIdentities
	 */
	public List<ParticipantIdentity> getParticipantIdentities() {
		return participantIdentities;
	}

	/**
	 * Participant identity information
	 * <p>
	 * 
	 * @param participantIdentities
	 *            The participantIdentities
	 */
	public void setParticipantIdentities(List<ParticipantIdentity> participantIdentities) {
		this.participantIdentities = participantIdentities;
	}

	/**
	 * Participant information
	 * <p>
	 * 
	 * @return The participants
	 */
	public List<Participant> getParticipants() {
		return participants;
	}

	/**
	 * Participant information
	 * <p>
	 * 
	 * @param participants
	 *            The participants
	 */
	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	/**
	 * Platform ID of the match
	 * <p>
	 * 
	 * @return The platformId
	 */
	public String getPlatformId() {
		return platformId;
	}

	/**
	 * Platform ID of the match
	 * <p>
	 * 
	 * @param platformId
	 *            The platformId
	 */
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	/**
	 * Match queue type
	 * <p>
	 * 
	 * @return The queueType
	 */
	public MatchDetail.QueueType getQueueType() {
		return queueType;
	}

	/**
	 * Match queue type
	 * <p>
	 * 
	 * @param queueType
	 *            The queueType
	 */
	public void setQueueType(MatchDetail.QueueType queueType) {
		this.queueType = queueType;
	}

	/**
	 * Region where the match was played
	 * <p>
	 * 
	 * @return The region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * Region where the match was played
	 * <p>
	 * 
	 * @param region
	 *            The region
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * Match mode
	 * <p>
	 * 
	 * @return The season
	 */
	public MatchDetail.Season getSeason() {
		return season;
	}

	/**
	 * Match mode
	 * <p>
	 * 
	 * @param season
	 *            The season
	 */
	public void setSeason(MatchDetail.Season season) {
		this.season = season;
	}

	/**
	 * Team information
	 * <p>
	 * 
	 * @return The teams
	 */
	public List<Team> getTeams() {
		return teams;
	}

	/**
	 * Team information
	 * <p>
	 * 
	 * @param teams
	 *            The teams
	 */
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	/**
	 * Timeline
	 * <p>
	 * 
	 * @return The timeline
	 */
	public Timeline getTimeline() {
		return timeline;
	}

	/**
	 * Timeline
	 * <p>
	 * 
	 * @param timeline
	 *            The timeline
	 */
	public void setTimeline(Timeline timeline) {
		this.timeline = timeline;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(mapId).append(matchCreation).append(matchDuration).append(matchId).append(matchMode).append(matchVersion).append(participantIdentities).append(participants).append(platformId).append(queueType).append(region).append(season).append(teams).append(timeline).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof MatchDetail) == false) {
			return false;
		}
		MatchDetail rhs = ((MatchDetail) other);
		return new EqualsBuilder().append(mapId, rhs.mapId).append(matchCreation, rhs.matchCreation).append(matchDuration, rhs.matchDuration).append(matchId, rhs.matchId).append(matchMode, rhs.matchMode).append(matchVersion, rhs.matchVersion).append(participantIdentities, rhs.participantIdentities).append(participants, rhs.participants).append(platformId, rhs.platformId).append(queueType, rhs.queueType).append(region, rhs.region).append(season, rhs.season).append(teams, rhs.teams).append(timeline, rhs.timeline).isEquals();
	}

	@Generated("org.jsonschema2pojo")
	public static enum MatchMode {

		@SerializedName("CUSTOM_GAME")
		CUSTOM_GAME("CUSTOM_GAME"), @SerializedName("MATCHED_GAME")
		MATCHED_GAME("MATCHED_GAME"), @SerializedName("TUTORIAL_GAME")
		TUTORIAL_GAME("TUTORIAL_GAME");
		private final String value;
		private static Map<String, MatchDetail.MatchMode> constants = new HashMap<String, MatchDetail.MatchMode>();

		static {
			for (MatchDetail.MatchMode c : values()) {
				constants.put(c.value, c);
			}
		}

		private MatchMode(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static MatchDetail.MatchMode fromValue(String value) {
			MatchDetail.MatchMode constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

	@Generated("org.jsonschema2pojo")
	public static enum QueueType {

		@SerializedName("CUSTOM")
		CUSTOM("CUSTOM"), @SerializedName("NORMAL_5x5_BLIND")
		NORMAL_5_X_5_BLIND("NORMAL_5x5_BLIND"), @SerializedName("RANKED_SOLO_5x5")
		RANKED_SOLO_5_X_5("RANKED_SOLO_5x5"), @SerializedName("RANKED_PREMADE_5x5")
		RANKED_PREMADE_5_X_5("RANKED_PREMADE_5x5"), @SerializedName("BOT_5x5")
		BOT_5_X_5("BOT_5x5"), @SerializedName("NORMAL_3x3")
		NORMAL_3_X_3("NORMAL_3x3"), @SerializedName("RANKED_PREMADE_3x3")
		RANKED_PREMADE_3_X_3("RANKED_PREMADE_3x3"), @SerializedName("NORMAL_5x5_DRAFT")
		NORMAL_5_X_5_DRAFT("NORMAL_5x5_DRAFT"), @SerializedName("ODIN_5x5_BLIND")
		ODIN_5_X_5_BLIND("ODIN_5x5_BLIND"), @SerializedName("ODIN_5x5_DRAFT")
		ODIN_5_X_5_DRAFT("ODIN_5x5_DRAFT"), @SerializedName("BOT_ODIN_5x5")
		BOT_ODIN_5_X_5("BOT_ODIN_5x5"), @SerializedName("BOT_5x5_INTRO")
		BOT_5_X_5_INTRO("BOT_5x5_INTRO"), @SerializedName("BOT_5x5_BEGINNER")
		BOT_5_X_5_BEGINNER("BOT_5x5_BEGINNER"), @SerializedName("BOT_5x5_INTERMEDIATE")
		BOT_5_X_5_INTERMEDIATE("BOT_5x5_INTERMEDIATE"), @SerializedName("RANKED_TEAM_3x3")
		RANKED_TEAM_3_X_3("RANKED_TEAM_3x3"), @SerializedName("RANKED_TEAM_5x5")
		RANKED_TEAM_5_X_5("RANKED_TEAM_5x5"), @SerializedName("BOT_TT_3x3")
		BOT_TT_3_X_3("BOT_TT_3x3"), @SerializedName("GROUP_FINDER_5x5")
		GROUP_FINDER_5_X_5("GROUP_FINDER_5x5"), @SerializedName("ARAM_5x5")
		ARAM_5_X_5("ARAM_5x5"), @SerializedName("ONEFORALL_5x5")
		ONEFORALL_5_X_5("ONEFORALL_5x5"), @SerializedName("FIRSTBLOOD_1x1")
		FIRSTBLOOD_1_X_1("FIRSTBLOOD_1x1"), @SerializedName("FIRSTBLOOD_2x2")
		FIRSTBLOOD_2_X_2("FIRSTBLOOD_2x2"), @SerializedName("SR_6x6")
		SR_6_X_6("SR_6x6"), @SerializedName("URF_5x5")
		URF_5_X_5("URF_5x5"), @SerializedName("ONEFORALL_MIRRORMODE_5x5")
		ONEFORALL_MIRRORMODE_5_X_5("ONEFORALL_MIRRORMODE_5x5"), @SerializedName("BOT_URF_5x5")
		BOT_URF_5_X_5("BOT_URF_5x5"), @SerializedName("NIGHTMARE_BOT_5x5_RANK1")
		NIGHTMARE_BOT_5_X_5_RANK_1("NIGHTMARE_BOT_5x5_RANK1"), @SerializedName("NIGHTMARE_BOT_5x5_RANK2")
		NIGHTMARE_BOT_5_X_5_RANK_2("NIGHTMARE_BOT_5x5_RANK2"), @SerializedName("NIGHTMARE_BOT_5x5_RANK5")
		NIGHTMARE_BOT_5_X_5_RANK_5("NIGHTMARE_BOT_5x5_RANK5"), @SerializedName("ASCENSION_5x5")
		ASCENSION_5_X_5("ASCENSION_5x5"), @SerializedName("HEXAKILL")
		HEXAKILL("HEXAKILL"), @SerializedName("KING_PORO_5x5")
		KING_PORO_5_X_5("KING_PORO_5x5"), @SerializedName("COUNTER_PICK")
		COUNTER_PICK("COUNTER_PICK");
		private final String value;
		private static Map<String, MatchDetail.QueueType> constants = new HashMap<String, MatchDetail.QueueType>();

		static {
			for (MatchDetail.QueueType c : values()) {
				constants.put(c.value, c);
			}
		}

		private QueueType(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static MatchDetail.QueueType fromValue(String value) {
			MatchDetail.QueueType constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

	@Generated("org.jsonschema2pojo")
	public static enum Season {

		@SerializedName("PRESEASON3")
		PRESEASON_3("PRESEASON3"), @SerializedName("SEASON3")
		SEASON_3("SEASON3"), @SerializedName("PRESEASON2014")
		PRESEASON_2014("PRESEASON2014"), @SerializedName("SEASON2014")
		SEASON_2014("SEASON2014"), @SerializedName("PRESEASON2015")
		PRESEASON_2015("PRESEASON2015"), @SerializedName("SEASON2015")
		SEASON_2015("SEASON2015");
		private final String value;
		private static Map<String, MatchDetail.Season> constants = new HashMap<String, MatchDetail.Season>();

		static {
			for (MatchDetail.Season c : values()) {
				constants.put(c.value, c);
			}
		}

		private Season(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static MatchDetail.Season fromValue(String value) {
			MatchDetail.Season constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

}
