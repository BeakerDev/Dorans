package gg.buff.dorans.objects.generated.match;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * ParticipantStats
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class ParticipantStats {

	/**
	 * Number of assists
	 * <p>
	 */
	@Expose
	private long assists;
	/**
	 * Champion level achieved
	 * <p>
	 */
	@Expose
	private long champLevel;
	/**
	 * If game was a dominion game, player's combat score, otherwise 0
	 * <p>
	 */
	@Expose
	private long combatPlayerScore;
	/**
	 * Number of deaths
	 * <p>
	 */
	@Expose
	private long deaths;
	/**
	 * Number of double kills
	 * <p>
	 */
	@Expose
	private long doubleKills;
	/**
	 * Flag indicating if participant got an assist on first blood
	 * <p>
	 */
	@Expose
	private boolean firstBloodAssist;
	/**
	 * Flag indicating if participant got first blood
	 * <p>
	 */
	@Expose
	private boolean firstBloodKill;
	/**
	 * Flag indicating if participant got an assist on the first inhibitor
	 * <p>
	 */
	@Expose
	private boolean firstInhibitorAssist;
	/**
	 * Flag indicating if participant destroyed the first inhibitor
	 * <p>
	 */
	@Expose
	private boolean firstInhibitorKill;
	/**
	 * Flag indicating if participant got an assist on the first tower
	 * <p>
	 */
	@Expose
	private boolean firstTowerAssist;
	/**
	 * Flag indicating if participant destroyed the first tower
	 * <p>
	 */
	@Expose
	private boolean firstTowerKill;
	/**
	 * Gold earned
	 * <p>
	 */
	@Expose
	private long goldEarned;
	/**
	 * Gold spent
	 * <p>
	 */
	@Expose
	private long goldSpent;
	/**
	 * Number of inhibitor kills
	 * <p>
	 */
	@Expose
	private long inhibitorKills;
	/**
	 * First item ID
	 * <p>
	 */
	@Expose
	private long item0;
	/**
	 * Second item ID
	 * <p>
	 */
	@Expose
	private long item1;
	/**
	 * Third item ID
	 * <p>
	 */
	@Expose
	private long item2;
	/**
	 * Fourth item ID
	 * <p>
	 */
	@Expose
	private long item3;
	/**
	 * Fifth item ID
	 * <p>
	 */
	@Expose
	private long item4;
	/**
	 * Sixth item ID
	 * <p>
	 */
	@Expose
	private long item5;
	/**
	 * Seventh item ID
	 * <p>
	 */
	@Expose
	private long item6;
	/**
	 * Number of killing sprees
	 * <p>
	 */
	@Expose
	private long killingSprees;
	/**
	 * Number of kills
	 * <p>
	 */
	@Expose
	private long kills;
	/**
	 * Largest critical strike
	 * <p>
	 */
	@Expose
	private long largestCriticalStrike;
	/**
	 * Largest killing spree
	 * <p>
	 */
	@Expose
	private long largestKillingSpree;
	/**
	 * Largest multi kill
	 * <p>
	 */
	@Expose
	private long largestMultiKill;
	/**
	 * Magical damage dealt
	 * <p>
	 */
	@Expose
	private long magicDamageDealt;
	/**
	 * Magical damage dealt to champions
	 * <p>
	 */
	@Expose
	private long magicDamageDealtToChampions;
	/**
	 * Magic damage taken
	 * <p>
	 */
	@Expose
	private long magicDamageTaken;
	/**
	 * Minions killed
	 * <p>
	 */
	@Expose
	private long minionsKilled;
	/**
	 * Neutral minions killed
	 * <p>
	 */
	@Expose
	private long neutralMinionsKilled;
	/**
	 * Neutral jungle minions killed in the enemy team's jungle
	 * <p>
	 */
	@Expose
	private long neutralMinionsKilledEnemyJungle;
	/**
	 * Neutral jungle minions killed in your team's jungle
	 * <p>
	 */
	@Expose
	private long neutralMinionsKilledTeamJungle;
	/**
	 * If game was a dominion game, number of node captures
	 * <p>
	 */
	@Expose
	private long nodeCapture;
	/**
	 * If game was a dominion game, number of node capture assists
	 * <p>
	 */
	@Expose
	private long nodeCaptureAssist;
	/**
	 * If game was a dominion game, number of node neutralizations,
	 * <p>
	 */
	@Expose
	private long nodeNeutralize;
	/**
	 * If game was a dominion game, number of node neutralization assists
	 * <p>
	 */
	@Expose
	private long nodeNeutralizeAssist;
	/**
	 * If game was a dominion game, player's objectives score, otherwise 0
	 * <p>
	 */
	@Expose
	private long objectivePlayerScore;
	/**
	 * Number of penta kills
	 * <p>
	 */
	@Expose
	private long pentaKills;
	/**
	 * Physical damage dealt
	 * <p>
	 */
	@Expose
	private long physicalDamageDealt;
	/**
	 * Physical damage dealt to champions
	 * <p>
	 */
	@Expose
	private long physicalDamageDealtToChampions;
	/**
	 * Physical damage taken
	 * <p>
	 */
	@Expose
	private long physicalDamageTaken;
	/**
	 * Number of quadra kills
	 * <p>
	 */
	@Expose
	private long quadraKills;
	/**
	 * Sight wards purchased
	 * <p>
	 */
	@Expose
	private long sightWardsBoughtInGame;
	/**
	 * If game was a dominion game, number of completed team objectives (i.e.,
	 * quests)
	 * <p>
	 */
	@Expose
	private long teamObjective;
	/**
	 * Total damage dealt
	 * <p>
	 */
	@Expose
	private long totalDamageDealt;
	/**
	 * Total damage dealt to champions
	 * <p>
	 */
	@Expose
	private long totalDamageDealtToChampions;
	/**
	 * Total damage taken
	 * <p>
	 */
	@Expose
	private long totalDamageTaken;
	/**
	 * Total heal amount
	 * <p>
	 */
	@Expose
	private long totalHeal;
	/**
	 * If game was a dominion game, player's total score, otherwise 0
	 * <p>
	 */
	@Expose
	private long totalPlayerScore;
	/**
	 * If game was a dominion game, team rank of the player's total score (e.g.,
	 * 1-5)
	 * <p>
	 */
	@Expose
	private long totalScoreRank;
	/**
	 * Total dealt crowd control time
	 * <p>
	 */
	@Expose
	private long totalTimeCrowdControlDealt;
	/**
	 * Total units healed
	 * <p>
	 */
	@Expose
	private long totalUnitsHealed;
	/**
	 * Number of tower kills
	 * <p>
	 */
	@Expose
	private long towerKills;
	/**
	 * Number of triple kills
	 * <p>
	 */
	@Expose
	private long tripleKills;
	/**
	 * True damage dealt
	 * <p>
	 */
	@Expose
	private long trueDamageDealt;
	/**
	 * True damage dealt to champions
	 * <p>
	 */
	@Expose
	private long trueDamageDealtToChampions;
	/**
	 * True damage taken
	 * <p>
	 */
	@Expose
	private long trueDamageTaken;
	/**
	 * Number of unreal kills
	 * <p>
	 */
	@Expose
	private long unrealKills;
	/**
	 * Vision wards purchased
	 * <p>
	 */
	@Expose
	private long visionWardsBoughtInGame;
	/**
	 * Number of wards killed
	 * <p>
	 */
	@Expose
	private long wardsKilled;
	/**
	 * Number of wards placed
	 * <p>
	 */
	@Expose
	private long wardsPlaced;

	/**
	 * Number of assists
	 * <p>
	 * 
	 * @return The assists
	 */
	public long getAssists() {
		return assists;
	}

	/**
	 * Number of assists
	 * <p>
	 * 
	 * @param assists
	 *            The assists
	 */
	public void setAssists(long assists) {
		this.assists = assists;
	}

	/**
	 * Champion level achieved
	 * <p>
	 * 
	 * @return The champLevel
	 */
	public long getChampLevel() {
		return champLevel;
	}

	/**
	 * Champion level achieved
	 * <p>
	 * 
	 * @param champLevel
	 *            The champLevel
	 */
	public void setChampLevel(long champLevel) {
		this.champLevel = champLevel;
	}

	/**
	 * If game was a dominion game, player's combat score, otherwise 0
	 * <p>
	 * 
	 * @return The combatPlayerScore
	 */
	public long getCombatPlayerScore() {
		return combatPlayerScore;
	}

	/**
	 * If game was a dominion game, player's combat score, otherwise 0
	 * <p>
	 * 
	 * @param combatPlayerScore
	 *            The combatPlayerScore
	 */
	public void setCombatPlayerScore(long combatPlayerScore) {
		this.combatPlayerScore = combatPlayerScore;
	}

	/**
	 * Number of deaths
	 * <p>
	 * 
	 * @return The deaths
	 */
	public long getDeaths() {
		return deaths;
	}

	/**
	 * Number of deaths
	 * <p>
	 * 
	 * @param deaths
	 *            The deaths
	 */
	public void setDeaths(long deaths) {
		this.deaths = deaths;
	}

	/**
	 * Number of double kills
	 * <p>
	 * 
	 * @return The doubleKills
	 */
	public long getDoubleKills() {
		return doubleKills;
	}

	/**
	 * Number of double kills
	 * <p>
	 * 
	 * @param doubleKills
	 *            The doubleKills
	 */
	public void setDoubleKills(long doubleKills) {
		this.doubleKills = doubleKills;
	}

	/**
	 * Flag indicating if participant got an assist on first blood
	 * <p>
	 * 
	 * @return The firstBloodAssist
	 */
	public boolean isFirstBloodAssist() {
		return firstBloodAssist;
	}

	/**
	 * Flag indicating if participant got an assist on first blood
	 * <p>
	 * 
	 * @param firstBloodAssist
	 *            The firstBloodAssist
	 */
	public void setFirstBloodAssist(boolean firstBloodAssist) {
		this.firstBloodAssist = firstBloodAssist;
	}

	/**
	 * Flag indicating if participant got first blood
	 * <p>
	 * 
	 * @return The firstBloodKill
	 */
	public boolean isFirstBloodKill() {
		return firstBloodKill;
	}

	/**
	 * Flag indicating if participant got first blood
	 * <p>
	 * 
	 * @param firstBloodKill
	 *            The firstBloodKill
	 */
	public void setFirstBloodKill(boolean firstBloodKill) {
		this.firstBloodKill = firstBloodKill;
	}

	/**
	 * Flag indicating if participant got an assist on the first inhibitor
	 * <p>
	 * 
	 * @return The firstInhibitorAssist
	 */
	public boolean isFirstInhibitorAssist() {
		return firstInhibitorAssist;
	}

	/**
	 * Flag indicating if participant got an assist on the first inhibitor
	 * <p>
	 * 
	 * @param firstInhibitorAssist
	 *            The firstInhibitorAssist
	 */
	public void setFirstInhibitorAssist(boolean firstInhibitorAssist) {
		this.firstInhibitorAssist = firstInhibitorAssist;
	}

	/**
	 * Flag indicating if participant destroyed the first inhibitor
	 * <p>
	 * 
	 * @return The firstInhibitorKill
	 */
	public boolean isFirstInhibitorKill() {
		return firstInhibitorKill;
	}

	/**
	 * Flag indicating if participant destroyed the first inhibitor
	 * <p>
	 * 
	 * @param firstInhibitorKill
	 *            The firstInhibitorKill
	 */
	public void setFirstInhibitorKill(boolean firstInhibitorKill) {
		this.firstInhibitorKill = firstInhibitorKill;
	}

	/**
	 * Flag indicating if participant got an assist on the first tower
	 * <p>
	 * 
	 * @return The firstTowerAssist
	 */
	public boolean isFirstTowerAssist() {
		return firstTowerAssist;
	}

	/**
	 * Flag indicating if participant got an assist on the first tower
	 * <p>
	 * 
	 * @param firstTowerAssist
	 *            The firstTowerAssist
	 */
	public void setFirstTowerAssist(boolean firstTowerAssist) {
		this.firstTowerAssist = firstTowerAssist;
	}

	/**
	 * Flag indicating if participant destroyed the first tower
	 * <p>
	 * 
	 * @return The firstTowerKill
	 */
	public boolean isFirstTowerKill() {
		return firstTowerKill;
	}

	/**
	 * Flag indicating if participant destroyed the first tower
	 * <p>
	 * 
	 * @param firstTowerKill
	 *            The firstTowerKill
	 */
	public void setFirstTowerKill(boolean firstTowerKill) {
		this.firstTowerKill = firstTowerKill;
	}

	/**
	 * Gold earned
	 * <p>
	 * 
	 * @return The goldEarned
	 */
	public long getGoldEarned() {
		return goldEarned;
	}

	/**
	 * Gold earned
	 * <p>
	 * 
	 * @param goldEarned
	 *            The goldEarned
	 */
	public void setGoldEarned(long goldEarned) {
		this.goldEarned = goldEarned;
	}

	/**
	 * Gold spent
	 * <p>
	 * 
	 * @return The goldSpent
	 */
	public long getGoldSpent() {
		return goldSpent;
	}

	/**
	 * Gold spent
	 * <p>
	 * 
	 * @param goldSpent
	 *            The goldSpent
	 */
	public void setGoldSpent(long goldSpent) {
		this.goldSpent = goldSpent;
	}

	/**
	 * Number of inhibitor kills
	 * <p>
	 * 
	 * @return The inhibitorKills
	 */
	public long getInhibitorKills() {
		return inhibitorKills;
	}

	/**
	 * Number of inhibitor kills
	 * <p>
	 * 
	 * @param inhibitorKills
	 *            The inhibitorKills
	 */
	public void setInhibitorKills(long inhibitorKills) {
		this.inhibitorKills = inhibitorKills;
	}

	/**
	 * First item ID
	 * <p>
	 * 
	 * @return The item0
	 */
	public long getItem0() {
		return item0;
	}

	/**
	 * First item ID
	 * <p>
	 * 
	 * @param item0
	 *            The item0
	 */
	public void setItem0(long item0) {
		this.item0 = item0;
	}

	/**
	 * Second item ID
	 * <p>
	 * 
	 * @return The item1
	 */
	public long getItem1() {
		return item1;
	}

	/**
	 * Second item ID
	 * <p>
	 * 
	 * @param item1
	 *            The item1
	 */
	public void setItem1(long item1) {
		this.item1 = item1;
	}

	/**
	 * Third item ID
	 * <p>
	 * 
	 * @return The item2
	 */
	public long getItem2() {
		return item2;
	}

	/**
	 * Third item ID
	 * <p>
	 * 
	 * @param item2
	 *            The item2
	 */
	public void setItem2(long item2) {
		this.item2 = item2;
	}

	/**
	 * Fourth item ID
	 * <p>
	 * 
	 * @return The item3
	 */
	public long getItem3() {
		return item3;
	}

	/**
	 * Fourth item ID
	 * <p>
	 * 
	 * @param item3
	 *            The item3
	 */
	public void setItem3(long item3) {
		this.item3 = item3;
	}

	/**
	 * Fifth item ID
	 * <p>
	 * 
	 * @return The item4
	 */
	public long getItem4() {
		return item4;
	}

	/**
	 * Fifth item ID
	 * <p>
	 * 
	 * @param item4
	 *            The item4
	 */
	public void setItem4(long item4) {
		this.item4 = item4;
	}

	/**
	 * Sixth item ID
	 * <p>
	 * 
	 * @return The item5
	 */
	public long getItem5() {
		return item5;
	}

	/**
	 * Sixth item ID
	 * <p>
	 * 
	 * @param item5
	 *            The item5
	 */
	public void setItem5(long item5) {
		this.item5 = item5;
	}

	/**
	 * Seventh item ID
	 * <p>
	 * 
	 * @return The item6
	 */
	public long getItem6() {
		return item6;
	}

	/**
	 * Seventh item ID
	 * <p>
	 * 
	 * @param item6
	 *            The item6
	 */
	public void setItem6(long item6) {
		this.item6 = item6;
	}

	/**
	 * Number of killing sprees
	 * <p>
	 * 
	 * @return The killingSprees
	 */
	public long getKillingSprees() {
		return killingSprees;
	}

	/**
	 * Number of killing sprees
	 * <p>
	 * 
	 * @param killingSprees
	 *            The killingSprees
	 */
	public void setKillingSprees(long killingSprees) {
		this.killingSprees = killingSprees;
	}

	/**
	 * Number of kills
	 * <p>
	 * 
	 * @return The kills
	 */
	public long getKills() {
		return kills;
	}

	/**
	 * Number of kills
	 * <p>
	 * 
	 * @param kills
	 *            The kills
	 */
	public void setKills(long kills) {
		this.kills = kills;
	}

	/**
	 * Largest critical strike
	 * <p>
	 * 
	 * @return The largestCriticalStrike
	 */
	public long getLargestCriticalStrike() {
		return largestCriticalStrike;
	}

	/**
	 * Largest critical strike
	 * <p>
	 * 
	 * @param largestCriticalStrike
	 *            The largestCriticalStrike
	 */
	public void setLargestCriticalStrike(long largestCriticalStrike) {
		this.largestCriticalStrike = largestCriticalStrike;
	}

	/**
	 * Largest killing spree
	 * <p>
	 * 
	 * @return The largestKillingSpree
	 */
	public long getLargestKillingSpree() {
		return largestKillingSpree;
	}

	/**
	 * Largest killing spree
	 * <p>
	 * 
	 * @param largestKillingSpree
	 *            The largestKillingSpree
	 */
	public void setLargestKillingSpree(long largestKillingSpree) {
		this.largestKillingSpree = largestKillingSpree;
	}

	/**
	 * Largest multi kill
	 * <p>
	 * 
	 * @return The largestMultiKill
	 */
	public long getLargestMultiKill() {
		return largestMultiKill;
	}

	/**
	 * Largest multi kill
	 * <p>
	 * 
	 * @param largestMultiKill
	 *            The largestMultiKill
	 */
	public void setLargestMultiKill(long largestMultiKill) {
		this.largestMultiKill = largestMultiKill;
	}

	/**
	 * Magical damage dealt
	 * <p>
	 * 
	 * @return The magicDamageDealt
	 */
	public long getMagicDamageDealt() {
		return magicDamageDealt;
	}

	/**
	 * Magical damage dealt
	 * <p>
	 * 
	 * @param magicDamageDealt
	 *            The magicDamageDealt
	 */
	public void setMagicDamageDealt(long magicDamageDealt) {
		this.magicDamageDealt = magicDamageDealt;
	}

	/**
	 * Magical damage dealt to champions
	 * <p>
	 * 
	 * @return The magicDamageDealtToChampions
	 */
	public long getMagicDamageDealtToChampions() {
		return magicDamageDealtToChampions;
	}

	/**
	 * Magical damage dealt to champions
	 * <p>
	 * 
	 * @param magicDamageDealtToChampions
	 *            The magicDamageDealtToChampions
	 */
	public void setMagicDamageDealtToChampions(long magicDamageDealtToChampions) {
		this.magicDamageDealtToChampions = magicDamageDealtToChampions;
	}

	/**
	 * Magic damage taken
	 * <p>
	 * 
	 * @return The magicDamageTaken
	 */
	public long getMagicDamageTaken() {
		return magicDamageTaken;
	}

	/**
	 * Magic damage taken
	 * <p>
	 * 
	 * @param magicDamageTaken
	 *            The magicDamageTaken
	 */
	public void setMagicDamageTaken(long magicDamageTaken) {
		this.magicDamageTaken = magicDamageTaken;
	}

	/**
	 * Minions killed
	 * <p>
	 * 
	 * @return The minionsKilled
	 */
	public long getMinionsKilled() {
		return minionsKilled;
	}

	/**
	 * Minions killed
	 * <p>
	 * 
	 * @param minionsKilled
	 *            The minionsKilled
	 */
	public void setMinionsKilled(long minionsKilled) {
		this.minionsKilled = minionsKilled;
	}

	/**
	 * Neutral minions killed
	 * <p>
	 * 
	 * @return The neutralMinionsKilled
	 */
	public long getNeutralMinionsKilled() {
		return neutralMinionsKilled;
	}

	/**
	 * Neutral minions killed
	 * <p>
	 * 
	 * @param neutralMinionsKilled
	 *            The neutralMinionsKilled
	 */
	public void setNeutralMinionsKilled(long neutralMinionsKilled) {
		this.neutralMinionsKilled = neutralMinionsKilled;
	}

	/**
	 * Neutral jungle minions killed in the enemy team's jungle
	 * <p>
	 * 
	 * @return The neutralMinionsKilledEnemyJungle
	 */
	public long getNeutralMinionsKilledEnemyJungle() {
		return neutralMinionsKilledEnemyJungle;
	}

	/**
	 * Neutral jungle minions killed in the enemy team's jungle
	 * <p>
	 * 
	 * @param neutralMinionsKilledEnemyJungle
	 *            The neutralMinionsKilledEnemyJungle
	 */
	public void setNeutralMinionsKilledEnemyJungle(long neutralMinionsKilledEnemyJungle) {
		this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
	}

	/**
	 * Neutral jungle minions killed in your team's jungle
	 * <p>
	 * 
	 * @return The neutralMinionsKilledTeamJungle
	 */
	public long getNeutralMinionsKilledTeamJungle() {
		return neutralMinionsKilledTeamJungle;
	}

	/**
	 * Neutral jungle minions killed in your team's jungle
	 * <p>
	 * 
	 * @param neutralMinionsKilledTeamJungle
	 *            The neutralMinionsKilledTeamJungle
	 */
	public void setNeutralMinionsKilledTeamJungle(long neutralMinionsKilledTeamJungle) {
		this.neutralMinionsKilledTeamJungle = neutralMinionsKilledTeamJungle;
	}

	/**
	 * If game was a dominion game, number of node captures
	 * <p>
	 * 
	 * @return The nodeCapture
	 */
	public long getNodeCapture() {
		return nodeCapture;
	}

	/**
	 * If game was a dominion game, number of node captures
	 * <p>
	 * 
	 * @param nodeCapture
	 *            The nodeCapture
	 */
	public void setNodeCapture(long nodeCapture) {
		this.nodeCapture = nodeCapture;
	}

	/**
	 * If game was a dominion game, number of node capture assists
	 * <p>
	 * 
	 * @return The nodeCaptureAssist
	 */
	public long getNodeCaptureAssist() {
		return nodeCaptureAssist;
	}

	/**
	 * If game was a dominion game, number of node capture assists
	 * <p>
	 * 
	 * @param nodeCaptureAssist
	 *            The nodeCaptureAssist
	 */
	public void setNodeCaptureAssist(long nodeCaptureAssist) {
		this.nodeCaptureAssist = nodeCaptureAssist;
	}

	/**
	 * If game was a dominion game, number of node neutralizations,
	 * <p>
	 * 
	 * @return The nodeNeutralize
	 */
	public long getNodeNeutralize() {
		return nodeNeutralize;
	}

	/**
	 * If game was a dominion game, number of node neutralizations,
	 * <p>
	 * 
	 * @param nodeNeutralize
	 *            The nodeNeutralize
	 */
	public void setNodeNeutralize(long nodeNeutralize) {
		this.nodeNeutralize = nodeNeutralize;
	}

	/**
	 * If game was a dominion game, number of node neutralization assists
	 * <p>
	 * 
	 * @return The nodeNeutralizeAssist
	 */
	public long getNodeNeutralizeAssist() {
		return nodeNeutralizeAssist;
	}

	/**
	 * If game was a dominion game, number of node neutralization assists
	 * <p>
	 * 
	 * @param nodeNeutralizeAssist
	 *            The nodeNeutralizeAssist
	 */
	public void setNodeNeutralizeAssist(long nodeNeutralizeAssist) {
		this.nodeNeutralizeAssist = nodeNeutralizeAssist;
	}

	/**
	 * If game was a dominion game, player's objectives score, otherwise 0
	 * <p>
	 * 
	 * @return The objectivePlayerScore
	 */
	public long getObjectivePlayerScore() {
		return objectivePlayerScore;
	}

	/**
	 * If game was a dominion game, player's objectives score, otherwise 0
	 * <p>
	 * 
	 * @param objectivePlayerScore
	 *            The objectivePlayerScore
	 */
	public void setObjectivePlayerScore(long objectivePlayerScore) {
		this.objectivePlayerScore = objectivePlayerScore;
	}

	/**
	 * Number of penta kills
	 * <p>
	 * 
	 * @return The pentaKills
	 */
	public long getPentaKills() {
		return pentaKills;
	}

	/**
	 * Number of penta kills
	 * <p>
	 * 
	 * @param pentaKills
	 *            The pentaKills
	 */
	public void setPentaKills(long pentaKills) {
		this.pentaKills = pentaKills;
	}

	/**
	 * Physical damage dealt
	 * <p>
	 * 
	 * @return The physicalDamageDealt
	 */
	public long getPhysicalDamageDealt() {
		return physicalDamageDealt;
	}

	/**
	 * Physical damage dealt
	 * <p>
	 * 
	 * @param physicalDamageDealt
	 *            The physicalDamageDealt
	 */
	public void setPhysicalDamageDealt(long physicalDamageDealt) {
		this.physicalDamageDealt = physicalDamageDealt;
	}

	/**
	 * Physical damage dealt to champions
	 * <p>
	 * 
	 * @return The physicalDamageDealtToChampions
	 */
	public long getPhysicalDamageDealtToChampions() {
		return physicalDamageDealtToChampions;
	}

	/**
	 * Physical damage dealt to champions
	 * <p>
	 * 
	 * @param physicalDamageDealtToChampions
	 *            The physicalDamageDealtToChampions
	 */
	public void setPhysicalDamageDealtToChampions(long physicalDamageDealtToChampions) {
		this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
	}

	/**
	 * Physical damage taken
	 * <p>
	 * 
	 * @return The physicalDamageTaken
	 */
	public long getPhysicalDamageTaken() {
		return physicalDamageTaken;
	}

	/**
	 * Physical damage taken
	 * <p>
	 * 
	 * @param physicalDamageTaken
	 *            The physicalDamageTaken
	 */
	public void setPhysicalDamageTaken(long physicalDamageTaken) {
		this.physicalDamageTaken = physicalDamageTaken;
	}

	/**
	 * Number of quadra kills
	 * <p>
	 * 
	 * @return The quadraKills
	 */
	public long getQuadraKills() {
		return quadraKills;
	}

	/**
	 * Number of quadra kills
	 * <p>
	 * 
	 * @param quadraKills
	 *            The quadraKills
	 */
	public void setQuadraKills(long quadraKills) {
		this.quadraKills = quadraKills;
	}

	/**
	 * Sight wards purchased
	 * <p>
	 * 
	 * @return The sightWardsBoughtInGame
	 */
	public long getSightWardsBoughtInGame() {
		return sightWardsBoughtInGame;
	}

	/**
	 * Sight wards purchased
	 * <p>
	 * 
	 * @param sightWardsBoughtInGame
	 *            The sightWardsBoughtInGame
	 */
	public void setSightWardsBoughtInGame(long sightWardsBoughtInGame) {
		this.sightWardsBoughtInGame = sightWardsBoughtInGame;
	}

	/**
	 * If game was a dominion game, number of completed team objectives (i.e.,
	 * quests)
	 * <p>
	 * 
	 * @return The teamObjective
	 */
	public long getTeamObjective() {
		return teamObjective;
	}

	/**
	 * If game was a dominion game, number of completed team objectives (i.e.,
	 * quests)
	 * <p>
	 * 
	 * @param teamObjective
	 *            The teamObjective
	 */
	public void setTeamObjective(long teamObjective) {
		this.teamObjective = teamObjective;
	}

	/**
	 * Total damage dealt
	 * <p>
	 * 
	 * @return The totalDamageDealt
	 */
	public long getTotalDamageDealt() {
		return totalDamageDealt;
	}

	/**
	 * Total damage dealt
	 * <p>
	 * 
	 * @param totalDamageDealt
	 *            The totalDamageDealt
	 */
	public void setTotalDamageDealt(long totalDamageDealt) {
		this.totalDamageDealt = totalDamageDealt;
	}

	/**
	 * Total damage dealt to champions
	 * <p>
	 * 
	 * @return The totalDamageDealtToChampions
	 */
	public long getTotalDamageDealtToChampions() {
		return totalDamageDealtToChampions;
	}

	/**
	 * Total damage dealt to champions
	 * <p>
	 * 
	 * @param totalDamageDealtToChampions
	 *            The totalDamageDealtToChampions
	 */
	public void setTotalDamageDealtToChampions(long totalDamageDealtToChampions) {
		this.totalDamageDealtToChampions = totalDamageDealtToChampions;
	}

	/**
	 * Total damage taken
	 * <p>
	 * 
	 * @return The totalDamageTaken
	 */
	public long getTotalDamageTaken() {
		return totalDamageTaken;
	}

	/**
	 * Total damage taken
	 * <p>
	 * 
	 * @param totalDamageTaken
	 *            The totalDamageTaken
	 */
	public void setTotalDamageTaken(long totalDamageTaken) {
		this.totalDamageTaken = totalDamageTaken;
	}

	/**
	 * Total heal amount
	 * <p>
	 * 
	 * @return The totalHeal
	 */
	public long getTotalHeal() {
		return totalHeal;
	}

	/**
	 * Total heal amount
	 * <p>
	 * 
	 * @param totalHeal
	 *            The totalHeal
	 */
	public void setTotalHeal(long totalHeal) {
		this.totalHeal = totalHeal;
	}

	/**
	 * If game was a dominion game, player's total score, otherwise 0
	 * <p>
	 * 
	 * @return The totalPlayerScore
	 */
	public long getTotalPlayerScore() {
		return totalPlayerScore;
	}

	/**
	 * If game was a dominion game, player's total score, otherwise 0
	 * <p>
	 * 
	 * @param totalPlayerScore
	 *            The totalPlayerScore
	 */
	public void setTotalPlayerScore(long totalPlayerScore) {
		this.totalPlayerScore = totalPlayerScore;
	}

	/**
	 * If game was a dominion game, team rank of the player's total score (e.g.,
	 * 1-5)
	 * <p>
	 * 
	 * @return The totalScoreRank
	 */
	public long getTotalScoreRank() {
		return totalScoreRank;
	}

	/**
	 * If game was a dominion game, team rank of the player's total score (e.g.,
	 * 1-5)
	 * <p>
	 * 
	 * @param totalScoreRank
	 *            The totalScoreRank
	 */
	public void setTotalScoreRank(long totalScoreRank) {
		this.totalScoreRank = totalScoreRank;
	}

	/**
	 * Total dealt crowd control time
	 * <p>
	 * 
	 * @return The totalTimeCrowdControlDealt
	 */
	public long getTotalTimeCrowdControlDealt() {
		return totalTimeCrowdControlDealt;
	}

	/**
	 * Total dealt crowd control time
	 * <p>
	 * 
	 * @param totalTimeCrowdControlDealt
	 *            The totalTimeCrowdControlDealt
	 */
	public void setTotalTimeCrowdControlDealt(long totalTimeCrowdControlDealt) {
		this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
	}

	/**
	 * Total units healed
	 * <p>
	 * 
	 * @return The totalUnitsHealed
	 */
	public long getTotalUnitsHealed() {
		return totalUnitsHealed;
	}

	/**
	 * Total units healed
	 * <p>
	 * 
	 * @param totalUnitsHealed
	 *            The totalUnitsHealed
	 */
	public void setTotalUnitsHealed(long totalUnitsHealed) {
		this.totalUnitsHealed = totalUnitsHealed;
	}

	/**
	 * Number of tower kills
	 * <p>
	 * 
	 * @return The towerKills
	 */
	public long getTowerKills() {
		return towerKills;
	}

	/**
	 * Number of tower kills
	 * <p>
	 * 
	 * @param towerKills
	 *            The towerKills
	 */
	public void setTowerKills(long towerKills) {
		this.towerKills = towerKills;
	}

	/**
	 * Number of triple kills
	 * <p>
	 * 
	 * @return The tripleKills
	 */
	public long getTripleKills() {
		return tripleKills;
	}

	/**
	 * Number of triple kills
	 * <p>
	 * 
	 * @param tripleKills
	 *            The tripleKills
	 */
	public void setTripleKills(long tripleKills) {
		this.tripleKills = tripleKills;
	}

	/**
	 * True damage dealt
	 * <p>
	 * 
	 * @return The trueDamageDealt
	 */
	public long getTrueDamageDealt() {
		return trueDamageDealt;
	}

	/**
	 * True damage dealt
	 * <p>
	 * 
	 * @param trueDamageDealt
	 *            The trueDamageDealt
	 */
	public void setTrueDamageDealt(long trueDamageDealt) {
		this.trueDamageDealt = trueDamageDealt;
	}

	/**
	 * True damage dealt to champions
	 * <p>
	 * 
	 * @return The trueDamageDealtToChampions
	 */
	public long getTrueDamageDealtToChampions() {
		return trueDamageDealtToChampions;
	}

	/**
	 * True damage dealt to champions
	 * <p>
	 * 
	 * @param trueDamageDealtToChampions
	 *            The trueDamageDealtToChampions
	 */
	public void setTrueDamageDealtToChampions(long trueDamageDealtToChampions) {
		this.trueDamageDealtToChampions = trueDamageDealtToChampions;
	}

	/**
	 * True damage taken
	 * <p>
	 * 
	 * @return The trueDamageTaken
	 */
	public long getTrueDamageTaken() {
		return trueDamageTaken;
	}

	/**
	 * True damage taken
	 * <p>
	 * 
	 * @param trueDamageTaken
	 *            The trueDamageTaken
	 */
	public void setTrueDamageTaken(long trueDamageTaken) {
		this.trueDamageTaken = trueDamageTaken;
	}

	/**
	 * Number of unreal kills
	 * <p>
	 * 
	 * @return The unrealKills
	 */
	public long getUnrealKills() {
		return unrealKills;
	}

	/**
	 * Number of unreal kills
	 * <p>
	 * 
	 * @param unrealKills
	 *            The unrealKills
	 */
	public void setUnrealKills(long unrealKills) {
		this.unrealKills = unrealKills;
	}

	/**
	 * Vision wards purchased
	 * <p>
	 * 
	 * @return The visionWardsBoughtInGame
	 */
	public long getVisionWardsBoughtInGame() {
		return visionWardsBoughtInGame;
	}

	/**
	 * Vision wards purchased
	 * <p>
	 * 
	 * @param visionWardsBoughtInGame
	 *            The visionWardsBoughtInGame
	 */
	public void setVisionWardsBoughtInGame(long visionWardsBoughtInGame) {
		this.visionWardsBoughtInGame = visionWardsBoughtInGame;
	}

	/**
	 * Number of wards killed
	 * <p>
	 * 
	 * @return The wardsKilled
	 */
	public long getWardsKilled() {
		return wardsKilled;
	}

	/**
	 * Number of wards killed
	 * <p>
	 * 
	 * @param wardsKilled
	 *            The wardsKilled
	 */
	public void setWardsKilled(long wardsKilled) {
		this.wardsKilled = wardsKilled;
	}

	/**
	 * Number of wards placed
	 * <p>
	 * 
	 * @return The wardsPlaced
	 */
	public long getWardsPlaced() {
		return wardsPlaced;
	}

	/**
	 * Number of wards placed
	 * <p>
	 * 
	 * @param wardsPlaced
	 *            The wardsPlaced
	 */
	public void setWardsPlaced(long wardsPlaced) {
		this.wardsPlaced = wardsPlaced;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(assists).append(champLevel).append(combatPlayerScore).append(deaths).append(doubleKills).append(firstBloodAssist).append(firstBloodKill).append(firstInhibitorAssist).append(firstInhibitorKill).append(firstTowerAssist).append(firstTowerKill).append(goldEarned).append(goldSpent).append(inhibitorKills).append(item0).append(item1).append(item2).append(item3).append(item4).append(item5).append(item6).append(killingSprees).append(kills).append(largestCriticalStrike).append(largestKillingSpree).append(largestMultiKill).append(magicDamageDealt).append(magicDamageDealtToChampions).append(magicDamageTaken).append(minionsKilled).append(neutralMinionsKilled).append(neutralMinionsKilledEnemyJungle).append(neutralMinionsKilledTeamJungle).append(nodeCapture).append(nodeCaptureAssist).append(nodeNeutralize).append(nodeNeutralizeAssist).append(objectivePlayerScore).append(pentaKills).append(physicalDamageDealt).append(physicalDamageDealtToChampions).append(physicalDamageTaken).append(quadraKills).append(sightWardsBoughtInGame).append(teamObjective).append(totalDamageDealt).append(totalDamageDealtToChampions).append(totalDamageTaken).append(totalHeal).append(totalPlayerScore).append(totalScoreRank).append(totalTimeCrowdControlDealt).append(totalUnitsHealed).append(towerKills).append(tripleKills).append(trueDamageDealt).append(trueDamageDealtToChampions).append(trueDamageTaken).append(unrealKills).append(visionWardsBoughtInGame).append(wardsKilled).append(wardsPlaced).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ParticipantStats) == false) {
			return false;
		}
		ParticipantStats rhs = ((ParticipantStats) other);
		return new EqualsBuilder().append(assists, rhs.assists).append(champLevel, rhs.champLevel).append(combatPlayerScore, rhs.combatPlayerScore).append(deaths, rhs.deaths).append(doubleKills, rhs.doubleKills).append(firstBloodAssist, rhs.firstBloodAssist).append(firstBloodKill, rhs.firstBloodKill).append(firstInhibitorAssist, rhs.firstInhibitorAssist).append(firstInhibitorKill, rhs.firstInhibitorKill).append(firstTowerAssist, rhs.firstTowerAssist).append(firstTowerKill, rhs.firstTowerKill).append(goldEarned, rhs.goldEarned).append(goldSpent, rhs.goldSpent).append(inhibitorKills, rhs.inhibitorKills).append(item0, rhs.item0).append(item1, rhs.item1).append(item2, rhs.item2).append(item3, rhs.item3).append(item4, rhs.item4).append(item5, rhs.item5).append(item6, rhs.item6).append(killingSprees, rhs.killingSprees).append(kills, rhs.kills).append(largestCriticalStrike, rhs.largestCriticalStrike).append(largestKillingSpree, rhs.largestKillingSpree).append(largestMultiKill, rhs.largestMultiKill).append(magicDamageDealt, rhs.magicDamageDealt).append(magicDamageDealtToChampions, rhs.magicDamageDealtToChampions).append(magicDamageTaken, rhs.magicDamageTaken).append(minionsKilled, rhs.minionsKilled).append(neutralMinionsKilled, rhs.neutralMinionsKilled).append(neutralMinionsKilledEnemyJungle, rhs.neutralMinionsKilledEnemyJungle).append(neutralMinionsKilledTeamJungle, rhs.neutralMinionsKilledTeamJungle).append(nodeCapture, rhs.nodeCapture).append(nodeCaptureAssist, rhs.nodeCaptureAssist).append(nodeNeutralize, rhs.nodeNeutralize).append(nodeNeutralizeAssist, rhs.nodeNeutralizeAssist).append(objectivePlayerScore, rhs.objectivePlayerScore).append(pentaKills, rhs.pentaKills).append(physicalDamageDealt, rhs.physicalDamageDealt).append(physicalDamageDealtToChampions, rhs.physicalDamageDealtToChampions).append(physicalDamageTaken, rhs.physicalDamageTaken).append(quadraKills, rhs.quadraKills).append(sightWardsBoughtInGame, rhs.sightWardsBoughtInGame).append(teamObjective, rhs.teamObjective).append(totalDamageDealt, rhs.totalDamageDealt).append(totalDamageDealtToChampions, rhs.totalDamageDealtToChampions).append(totalDamageTaken, rhs.totalDamageTaken).append(totalHeal, rhs.totalHeal).append(totalPlayerScore, rhs.totalPlayerScore).append(totalScoreRank, rhs.totalScoreRank).append(totalTimeCrowdControlDealt, rhs.totalTimeCrowdControlDealt).append(totalUnitsHealed, rhs.totalUnitsHealed).append(towerKills, rhs.towerKills).append(tripleKills, rhs.tripleKills).append(trueDamageDealt, rhs.trueDamageDealt).append(trueDamageDealtToChampions, rhs.trueDamageDealtToChampions).append(trueDamageTaken, rhs.trueDamageTaken).append(unrealKills, rhs.unrealKills).append(visionWardsBoughtInGame, rhs.visionWardsBoughtInGame).append(wardsKilled, rhs.wardsKilled).append(wardsPlaced, rhs.wardsPlaced).isEquals();
	}

}
