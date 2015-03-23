package gg.buff.dorans.objects.generated.match;

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
 * Event
 * <p>
 * This object contains game event information. Note that not all legal type
 * values documented below are valid for all games. Event data evolves over time
 * and certain values may be relevant only for older or newer games.
 */
@Generated("org.jsonschema2pojo")
public class Event {

	/**
	 * The ascended type of the event. Only present if relevant. Note that
	 * CLEAR_ASCENDED refers to when a participants kills the ascended player.
	 * <p>
	 */
	@Expose
	private Event.AscendedType ascendedType;
	/**
	 * The assisting participant IDs of the event. Only present if relevant.
	 * <p>
	 */
	@Expose
	private List<Integer> assistingParticipantIds = new ArrayList<Integer>();
	/**
	 * The building type of the event. Only present if relevant.
	 * <p>
	 */
	@Expose
	private Event.BuildingType buildingType;
	/**
	 * The creator ID of the event. Only present if relevant.
	 * <p>
	 */
	@Expose
	private int creatorId;
	/**
	 * Event type. (Legal values: ASCENDED_EVENT, BUILDING_KILL, CAPTURE_POINT,
	 * CHAMPION_KILL, ELITE_MONSTER_KILL, ITEM_DESTROYED, ITEM_PURCHASED,
	 * ITEM_SOLD, ITEM_UNDO, PORO_KING_SUMMON, SKILL_LEVEL_UP, WARD_KILL,
	 * WARD_PLACED)
	 * <p>
	 */
	@Expose
	private String eventType;
	/**
	 * The ending item ID of the event. Only present if relevant.
	 * <p>
	 */
	@Expose
	private int itemAfter;
	/**
	 * The starting item ID of the event. Only present if relevant.
	 * <p>
	 */
	@Expose
	private int itemBefore;
	/**
	 * The item ID of the event. Onl;y present if relevant.
	 * <p>
	 */
	@Expose
	private int itemId;
	/**
	 * The killer ID of the event. Only present if relevant. Killer ID 0
	 * indicates a minion.
	 * <p>
	 */
	@Expose
	private int killerId;
	/**
	 * The lane type of the event. Only present if relevant.
	 * <p>
	 */
	@Expose
	private Event.LaneType laneType;
	/**
	 * The level up type of the event. Only present if relevant.
	 * <p>
	 */
	@Expose
	private Event.LevelUpType levelUpType;
	/**
	 * The monster type of the event. Only present if relevant.
	 * <p>
	 */
	@Expose
	private Event.MonsterType monsterType;
	/**
	 * The participant ID of the event. Only present if relevant.
	 * <p>
	 */
	@Expose
	private int participantId;
	/**
	 * The point captured in the event. Only present if relevant.
	 * <p>
	 */
	@Expose
	private Event.PointCaptured pointCaptured;
	/**
	 * Position
	 * <p>
	 * This object contains the participant frame position information
	 */
	@Expose
	private Position position;
	/**
	 * The skill slot of the event. Only present if relevant. Killer ID 0
	 * indicates a minion.
	 * <p>
	 */
	@Expose
	private int skillSlot;
	/**
	 * The team ID of the event. Only present if relevant. Killer ID 0 indicates
	 * a minion.
	 * <p>
	 */
	@Expose
	private int teamId;
	/**
	 * Represents how many milliseconds into the game the event occurred.
	 * <p>
	 */
	@Expose
	private long timestamp;
	/**
	 * The tower type of the event. Only present if relevant.
	 * <p>
	 */
	@Expose
	private Event.TowerType towerType;
	/**
	 * The victim ID of the event. Only present if relevant.
	 * <p>
	 */
	@Expose
	private int victimId;
	/**
	 * The ward type of the event. Only present if relevant.
	 * <p>
	 */
	@Expose
	private Event.WardType wardType;

	/**
	 * The ascended type of the event. Only present if relevant. Note that
	 * CLEAR_ASCENDED refers to when a participants kills the ascended player.
	 * <p>
	 * 
	 * @return The ascendedType
	 */
	public Event.AscendedType getAscendedType() {
		return ascendedType;
	}

	/**
	 * The ascended type of the event. Only present if relevant. Note that
	 * CLEAR_ASCENDED refers to when a participants kills the ascended player.
	 * <p>
	 * 
	 * @param ascendedType
	 *            The ascendedType
	 */
	public void setAscendedType(Event.AscendedType ascendedType) {
		this.ascendedType = ascendedType;
	}

	/**
	 * The assisting participant IDs of the event. Only present if relevant.
	 * <p>
	 * 
	 * @return The assistingParticipantIds
	 */
	public List<Integer> getAssistingParticipantIds() {
		return assistingParticipantIds;
	}

	/**
	 * The assisting participant IDs of the event. Only present if relevant.
	 * <p>
	 * 
	 * @param assistingParticipantIds
	 *            The assistingParticipantIds
	 */
	public void setAssistingParticipantIds(List<Integer> assistingParticipantIds) {
		this.assistingParticipantIds = assistingParticipantIds;
	}

	/**
	 * The building type of the event. Only present if relevant.
	 * <p>
	 * 
	 * @return The buildingType
	 */
	public Event.BuildingType getBuildingType() {
		return buildingType;
	}

	/**
	 * The building type of the event. Only present if relevant.
	 * <p>
	 * 
	 * @param buildingType
	 *            The buildingType
	 */
	public void setBuildingType(Event.BuildingType buildingType) {
		this.buildingType = buildingType;
	}

	/**
	 * The creator ID of the event. Only present if relevant.
	 * <p>
	 * 
	 * @return The creatorId
	 */
	public int getCreatorId() {
		return creatorId;
	}

	/**
	 * The creator ID of the event. Only present if relevant.
	 * <p>
	 * 
	 * @param creatorId
	 *            The creatorId
	 */
	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}

	/**
	 * Event type. (Legal values: ASCENDED_EVENT, BUILDING_KILL, CAPTURE_POINT,
	 * CHAMPION_KILL, ELITE_MONSTER_KILL, ITEM_DESTROYED, ITEM_PURCHASED,
	 * ITEM_SOLD, ITEM_UNDO, PORO_KING_SUMMON, SKILL_LEVEL_UP, WARD_KILL,
	 * WARD_PLACED)
	 * <p>
	 * 
	 * @return The eventType
	 */
	public String getEventType() {
		return eventType;
	}

	/**
	 * Event type. (Legal values: ASCENDED_EVENT, BUILDING_KILL, CAPTURE_POINT,
	 * CHAMPION_KILL, ELITE_MONSTER_KILL, ITEM_DESTROYED, ITEM_PURCHASED,
	 * ITEM_SOLD, ITEM_UNDO, PORO_KING_SUMMON, SKILL_LEVEL_UP, WARD_KILL,
	 * WARD_PLACED)
	 * <p>
	 * 
	 * @param eventType
	 *            The eventType
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	/**
	 * The ending item ID of the event. Only present if relevant.
	 * <p>
	 * 
	 * @return The itemAfter
	 */
	public int getItemAfter() {
		return itemAfter;
	}

	/**
	 * The ending item ID of the event. Only present if relevant.
	 * <p>
	 * 
	 * @param itemAfter
	 *            The itemAfter
	 */
	public void setItemAfter(int itemAfter) {
		this.itemAfter = itemAfter;
	}

	/**
	 * The starting item ID of the event. Only present if relevant.
	 * <p>
	 * 
	 * @return The itemBefore
	 */
	public int getItemBefore() {
		return itemBefore;
	}

	/**
	 * The starting item ID of the event. Only present if relevant.
	 * <p>
	 * 
	 * @param itemBefore
	 *            The itemBefore
	 */
	public void setItemBefore(int itemBefore) {
		this.itemBefore = itemBefore;
	}

	/**
	 * The item ID of the event. Onl;y present if relevant.
	 * <p>
	 * 
	 * @return The itemId
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * The item ID of the event. Onl;y present if relevant.
	 * <p>
	 * 
	 * @param itemId
	 *            The itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * The killer ID of the event. Only present if relevant. Killer ID 0
	 * indicates a minion.
	 * <p>
	 * 
	 * @return The killerId
	 */
	public int getKillerId() {
		return killerId;
	}

	/**
	 * The killer ID of the event. Only present if relevant. Killer ID 0
	 * indicates a minion.
	 * <p>
	 * 
	 * @param killerId
	 *            The killerId
	 */
	public void setKillerId(int killerId) {
		this.killerId = killerId;
	}

	/**
	 * The lane type of the event. Only present if relevant.
	 * <p>
	 * 
	 * @return The laneType
	 */
	public Event.LaneType getLaneType() {
		return laneType;
	}

	/**
	 * The lane type of the event. Only present if relevant.
	 * <p>
	 * 
	 * @param laneType
	 *            The laneType
	 */
	public void setLaneType(Event.LaneType laneType) {
		this.laneType = laneType;
	}

	/**
	 * The level up type of the event. Only present if relevant.
	 * <p>
	 * 
	 * @return The levelUpType
	 */
	public Event.LevelUpType getLevelUpType() {
		return levelUpType;
	}

	/**
	 * The level up type of the event. Only present if relevant.
	 * <p>
	 * 
	 * @param levelUpType
	 *            The levelUpType
	 */
	public void setLevelUpType(Event.LevelUpType levelUpType) {
		this.levelUpType = levelUpType;
	}

	/**
	 * The monster type of the event. Only present if relevant.
	 * <p>
	 * 
	 * @return The monsterType
	 */
	public Event.MonsterType getMonsterType() {
		return monsterType;
	}

	/**
	 * The monster type of the event. Only present if relevant.
	 * <p>
	 * 
	 * @param monsterType
	 *            The monsterType
	 */
	public void setMonsterType(Event.MonsterType monsterType) {
		this.monsterType = monsterType;
	}

	/**
	 * The participant ID of the event. Only present if relevant.
	 * <p>
	 * 
	 * @return The participantId
	 */
	public int getParticipantId() {
		return participantId;
	}

	/**
	 * The participant ID of the event. Only present if relevant.
	 * <p>
	 * 
	 * @param participantId
	 *            The participantId
	 */
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}

	/**
	 * The point captured in the event. Only present if relevant.
	 * <p>
	 * 
	 * @return The pointCaptured
	 */
	public Event.PointCaptured getPointCaptured() {
		return pointCaptured;
	}

	/**
	 * The point captured in the event. Only present if relevant.
	 * <p>
	 * 
	 * @param pointCaptured
	 *            The pointCaptured
	 */
	public void setPointCaptured(Event.PointCaptured pointCaptured) {
		this.pointCaptured = pointCaptured;
	}

	/**
	 * Position
	 * <p>
	 * This object contains the participant frame position information
	 * 
	 * @return The position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * Position
	 * <p>
	 * This object contains the participant frame position information
	 * 
	 * @param position
	 *            The position
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * The skill slot of the event. Only present if relevant. Killer ID 0
	 * indicates a minion.
	 * <p>
	 * 
	 * @return The skillSlot
	 */
	public int getSkillSlot() {
		return skillSlot;
	}

	/**
	 * The skill slot of the event. Only present if relevant. Killer ID 0
	 * indicates a minion.
	 * <p>
	 * 
	 * @param skillSlot
	 *            The skillSlot
	 */
	public void setSkillSlot(int skillSlot) {
		this.skillSlot = skillSlot;
	}

	/**
	 * The team ID of the event. Only present if relevant. Killer ID 0 indicates
	 * a minion.
	 * <p>
	 * 
	 * @return The teamId
	 */
	public int getTeamId() {
		return teamId;
	}

	/**
	 * The team ID of the event. Only present if relevant. Killer ID 0 indicates
	 * a minion.
	 * <p>
	 * 
	 * @param teamId
	 *            The teamId
	 */
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	/**
	 * Represents how many milliseconds into the game the event occurred.
	 * <p>
	 * 
	 * @return The timestamp
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * Represents how many milliseconds into the game the event occurred.
	 * <p>
	 * 
	 * @param timestamp
	 *            The timestamp
	 */
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * The tower type of the event. Only present if relevant.
	 * <p>
	 * 
	 * @return The towerType
	 */
	public Event.TowerType getTowerType() {
		return towerType;
	}

	/**
	 * The tower type of the event. Only present if relevant.
	 * <p>
	 * 
	 * @param towerType
	 *            The towerType
	 */
	public void setTowerType(Event.TowerType towerType) {
		this.towerType = towerType;
	}

	/**
	 * The victim ID of the event. Only present if relevant.
	 * <p>
	 * 
	 * @return The victimId
	 */
	public int getVictimId() {
		return victimId;
	}

	/**
	 * The victim ID of the event. Only present if relevant.
	 * <p>
	 * 
	 * @param victimId
	 *            The victimId
	 */
	public void setVictimId(int victimId) {
		this.victimId = victimId;
	}

	/**
	 * The ward type of the event. Only present if relevant.
	 * <p>
	 * 
	 * @return The wardType
	 */
	public Event.WardType getWardType() {
		return wardType;
	}

	/**
	 * The ward type of the event. Only present if relevant.
	 * <p>
	 * 
	 * @param wardType
	 *            The wardType
	 */
	public void setWardType(Event.WardType wardType) {
		this.wardType = wardType;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ascendedType).append(assistingParticipantIds).append(buildingType).append(creatorId).append(eventType).append(itemAfter).append(itemBefore).append(itemId).append(killerId).append(laneType).append(levelUpType).append(monsterType).append(participantId).append(pointCaptured).append(position).append(skillSlot).append(teamId).append(timestamp).append(towerType).append(victimId).append(wardType).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Event) == false) {
			return false;
		}
		Event rhs = ((Event) other);
		return new EqualsBuilder().append(ascendedType, rhs.ascendedType).append(assistingParticipantIds, rhs.assistingParticipantIds).append(buildingType, rhs.buildingType).append(creatorId, rhs.creatorId).append(eventType, rhs.eventType).append(itemAfter, rhs.itemAfter).append(itemBefore, rhs.itemBefore).append(itemId, rhs.itemId).append(killerId, rhs.killerId).append(laneType, rhs.laneType).append(levelUpType, rhs.levelUpType).append(monsterType, rhs.monsterType).append(participantId, rhs.participantId).append(pointCaptured, rhs.pointCaptured).append(position, rhs.position).append(skillSlot, rhs.skillSlot).append(teamId, rhs.teamId).append(timestamp, rhs.timestamp).append(towerType, rhs.towerType).append(victimId, rhs.victimId).append(wardType, rhs.wardType).isEquals();
	}

	@Generated("org.jsonschema2pojo")
	public static enum AscendedType {

		@SerializedName("CHAMPION_ASCENDED")
		CHAMPION_ASCENDED("CHAMPION_ASCENDED"), @SerializedName("CLEAR_ASCENDED")
		CLEAR_ASCENDED("CLEAR_ASCENDED"), @SerializedName("MINION_ASCENDED")
		MINION_ASCENDED("MINION_ASCENDED");
		private final String value;
		private static Map<String, Event.AscendedType> constants = new HashMap<String, Event.AscendedType>();

		static {
			for (Event.AscendedType c : values()) {
				constants.put(c.value, c);
			}
		}

		private AscendedType(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static Event.AscendedType fromValue(String value) {
			Event.AscendedType constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

	@Generated("org.jsonschema2pojo")
	public static enum BuildingType {

		@SerializedName("INHIBITOR_BUILDING")
		INHIBITOR_BUILDING("INHIBITOR_BUILDING"), @SerializedName("TOWER_BUILDING")
		TOWER_BUILDING("TOWER_BUILDING");
		private final String value;
		private static Map<String, Event.BuildingType> constants = new HashMap<String, Event.BuildingType>();

		static {
			for (Event.BuildingType c : values()) {
				constants.put(c.value, c);
			}
		}

		private BuildingType(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static Event.BuildingType fromValue(String value) {
			Event.BuildingType constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

	@Generated("org.jsonschema2pojo")
	public static enum LaneType {

		@SerializedName("BOT_LANE")
		BOT_LANE("BOT_LANE"), @SerializedName("MID_LANE")
		MID_LANE("MID_LANE"), @SerializedName("TOP_LANE")
		TOP_LANE("TOP_LANE");
		private final String value;
		private static Map<String, Event.LaneType> constants = new HashMap<String, Event.LaneType>();

		static {
			for (Event.LaneType c : values()) {
				constants.put(c.value, c);
			}
		}

		private LaneType(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static Event.LaneType fromValue(String value) {
			Event.LaneType constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

	@Generated("org.jsonschema2pojo")
	public static enum LevelUpType {

		@SerializedName("EVOLVE")
		EVOLVE("EVOLVE"), @SerializedName("NORMAL")
		NORMAL("NORMAL");
		private final String value;
		private static Map<String, Event.LevelUpType> constants = new HashMap<String, Event.LevelUpType>();

		static {
			for (Event.LevelUpType c : values()) {
				constants.put(c.value, c);
			}
		}

		private LevelUpType(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static Event.LevelUpType fromValue(String value) {
			Event.LevelUpType constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

	@Generated("org.jsonschema2pojo")
	public static enum MonsterType {

		@SerializedName("BARON_NASHOR")
		BARON_NASHOR("BARON_NASHOR"), @SerializedName("BLUE_GOLEM")
		BLUE_GOLEM("BLUE_GOLEM"), @SerializedName("DRAGON")
		DRAGON("DRAGON"), @SerializedName("RED_LIZARD")
		RED_LIZARD("RED_LIZARD"), @SerializedName("VILEMAW")
		VILEMAW("VILEMAW");
		private final String value;
		private static Map<String, Event.MonsterType> constants = new HashMap<String, Event.MonsterType>();

		static {
			for (Event.MonsterType c : values()) {
				constants.put(c.value, c);
			}
		}

		private MonsterType(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static Event.MonsterType fromValue(String value) {
			Event.MonsterType constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

	@Generated("org.jsonschema2pojo")
	public static enum PointCaptured {

		@SerializedName("POINT_A")
		POINT_A("POINT_A"), @SerializedName("POINT_B")
		POINT_B("POINT_B"), @SerializedName("POINT_C")
		POINT_C("POINT_C"), @SerializedName("POINT_D")
		POINT_D("POINT_D"), @SerializedName("POINT_E")
		POINT_E("POINT_E");
		private final String value;
		private static Map<String, Event.PointCaptured> constants = new HashMap<String, Event.PointCaptured>();

		static {
			for (Event.PointCaptured c : values()) {
				constants.put(c.value, c);
			}
		}

		private PointCaptured(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static Event.PointCaptured fromValue(String value) {
			Event.PointCaptured constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

	@Generated("org.jsonschema2pojo")
	public static enum TowerType {

		@SerializedName("BASE_TURRET")
		BASE_TURRET("BASE_TURRET"), @SerializedName("FOUNTAIN_TURRET")
		FOUNTAIN_TURRET("FOUNTAIN_TURRET"), @SerializedName("INNER_TURRET")
		INNER_TURRET("INNER_TURRET"), @SerializedName("NEXUS_TURRET")
		NEXUS_TURRET("NEXUS_TURRET"), @SerializedName("OUTER_TURRET")
		OUTER_TURRET("OUTER_TURRET"), @SerializedName("UNDEFINED_TURRET")
		UNDEFINED_TURRET("UNDEFINED_TURRET");
		private final String value;
		private static Map<String, Event.TowerType> constants = new HashMap<String, Event.TowerType>();

		static {
			for (Event.TowerType c : values()) {
				constants.put(c.value, c);
			}
		}

		private TowerType(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static Event.TowerType fromValue(String value) {
			Event.TowerType constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

	@Generated("org.jsonschema2pojo")
	public static enum WardType {

		@SerializedName("SIGHT_WARD")
		SIGHT_WARD("SIGHT_WARD"), @SerializedName("TEEMO_MUSHROOM")
		TEEMO_MUSHROOM("TEEMO_MUSHROOM"), @SerializedName("UNDEFINED")
		UNDEFINED("UNDEFINED"), @SerializedName("VISION_WARD")
		VISION_WARD("VISION_WARD"), @SerializedName("YELLOW_TRINKET")
		YELLOW_TRINKET("YELLOW_TRINKET"), @SerializedName("YELLOW_TRINKET_UPGRADE")
		YELLOW_TRINKET_UPGRADE("YELLOW_TRINKET_UPGRADE");
		private final String value;
		private static Map<String, Event.WardType> constants = new HashMap<String, Event.WardType>();

		static {
			for (Event.WardType c : values()) {
				constants.put(c.value, c);
			}
		}

		private WardType(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static Event.WardType fromValue(String value) {
			Event.WardType constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

}
