
package gg.buff.dorans.objects.game;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * RawStats
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class RawStats {

    @Expose
    private int assists;
    /**
     * Number of enemy inhibitors killed
     * <p>
     * 
     * 
     */
    @Expose
    private int barracksKilled;
    @Expose
    private int championsKilled;
    @Expose
    private int combatPlayerScore;
    @Expose
    private int consumablesPurchased;
    @Expose
    private int damageDealtPlayer;
    @Expose
    private int doubleKills;
    @Expose
    private int firstBlood;
    @Expose
    private int gold;
    @Expose
    private int goldEarned;
    @Expose
    private int goldSpent;
    @Expose
    private int item0;
    @Expose
    private int item1;
    @Expose
    private int item2;
    @Expose
    private int item3;
    @Expose
    private int item4;
    @Expose
    private int item5;
    @Expose
    private int item6;
    @Expose
    private int itemPurchased;
    @Expose
    private int killingSprees;
    @Expose
    private int largestCriticalStrike;
    @Expose
    private int largestKillingSpree;
    @Expose
    private int largestMultiKill;
    /**
     * Number of tier 3 items built.
     * <p>
     * 
     * 
     */
    @Expose
    private int legendaryItemsCreated;
    @Expose
    private Object level;
    @Expose
    private int magicDamageDealtPlayer;
    @Expose
    private int magicDamageDealtToChampions;
    @Expose
    private int magicDamageTaken;
    @Expose
    private int minionsDenied;
    @Expose
    private int minionsKilled;
    @Expose
    private int neutralMinionsKilled;
    @Expose
    private int neutralMinionsKilledEnemyJungle;
    @Expose
    private int neutralMinionsKilledYourJungle;
    /**
     * Flag specifying if the summoner got the killing blow on the nexus.
     * <p>
     * 
     * 
     */
    @Expose
    private boolean nexusKilled;
    @Expose
    private int nodeCaptureAssist;
    @Expose
    private int nodeNeutralize;
    @Expose
    private int nodeNeutralizeAssist;
    @Expose
    private int numDeaths;
    @Expose
    private int numItemsBought;
    @Expose
    private int objectivePlayerScore;
    @Expose
    private int pentaKills;
    @Expose
    private int physicalDamageDealtPlayer;
    @Expose
    private int physicalDamageDealtToChampions;
    @Expose
    private int physicalDamageTaken;
    @Expose
    private int quadraKills;
    @Expose
    private int sightWardsBought;
    /**
     * Number of times first champion spell was cast.
     * <p>
     * 
     * 
     */
    @Expose
    private int spell1Cast;
    /**
     * Number of times second champion spell was cast.
     * <p>
     * 
     * 
     */
    @Expose
    private int spell2Cast;
    /**
     * Number of times third champion spell was cast.
     * <p>
     * 
     * 
     */
    @Expose
    private int spell3Cast;
    /**
     * Number of times fourth champion spell was cast.
     * <p>
     * 
     * 
     */
    @Expose
    private int spell4Cast;
    /**
     * Number of times first summoner spell was cast.
     * <p>
     * 
     * 
     */
    @Expose
    private int summonSpell1Cast;
    /**
     * Number of times second summoner spell was cast.
     * <p>
     * 
     * 
     */
    @Expose
    private int summonSpell2Cast;
    @Expose
    private int superMonsterKilled;
    @Expose
    private int team;
    @Expose
    private int teamObjective;
    @Expose
    private int timePlayed;
    @Expose
    private int totalDamageDealt;
    @Expose
    private int totalDamageDealtToChampions;
    @Expose
    private int totalDamageTaken;
    @Expose
    private int totalHeal;
    @Expose
    private int totalPlayerScore;
    @Expose
    private int totalScoreRank;
    @Expose
    private int totalTimeCrowdControlDealt;
    @Expose
    private int totalUnitsHealed;
    @Expose
    private int tripleKills;
    @Expose
    private int trueDamageDealtPlayer;
    @Expose
    private int trueDamageDealtToChampions;
    @Expose
    private int trueDamageTaken;
    @Expose
    private int turretsKilled;
    @Expose
    private int unrealKills;
    @Expose
    private int victoryPointTotal;
    @Expose
    private int visionWardsBought;
    @Expose
    private int wardKilled;
    @Expose
    private int wardPlaced;
    @Expose
    private int win;

    /**
     * 
     * @return
     *     The assists
     */
    public int getAssists() {
        return assists;
    }

    /**
     * 
     * @param assists
     *     The assists
     */
    public void setAssists(int assists) {
        this.assists = assists;
    }

    /**
     * Number of enemy inhibitors killed
     * <p>
     * 
     * 
     * @return
     *     The barracksKilled
     */
    public int getBarracksKilled() {
        return barracksKilled;
    }

    /**
     * Number of enemy inhibitors killed
     * <p>
     * 
     * 
     * @param barracksKilled
     *     The barracksKilled
     */
    public void setBarracksKilled(int barracksKilled) {
        this.barracksKilled = barracksKilled;
    }

    /**
     * 
     * @return
     *     The championsKilled
     */
    public int getChampionsKilled() {
        return championsKilled;
    }

    /**
     * 
     * @param championsKilled
     *     The championsKilled
     */
    public void setChampionsKilled(int championsKilled) {
        this.championsKilled = championsKilled;
    }

    /**
     * 
     * @return
     *     The combatPlayerScore
     */
    public int getCombatPlayerScore() {
        return combatPlayerScore;
    }

    /**
     * 
     * @param combatPlayerScore
     *     The combatPlayerScore
     */
    public void setCombatPlayerScore(int combatPlayerScore) {
        this.combatPlayerScore = combatPlayerScore;
    }

    /**
     * 
     * @return
     *     The consumablesPurchased
     */
    public int getConsumablesPurchased() {
        return consumablesPurchased;
    }

    /**
     * 
     * @param consumablesPurchased
     *     The consumablesPurchased
     */
    public void setConsumablesPurchased(int consumablesPurchased) {
        this.consumablesPurchased = consumablesPurchased;
    }

    /**
     * 
     * @return
     *     The damageDealtPlayer
     */
    public int getDamageDealtPlayer() {
        return damageDealtPlayer;
    }

    /**
     * 
     * @param damageDealtPlayer
     *     The damageDealtPlayer
     */
    public void setDamageDealtPlayer(int damageDealtPlayer) {
        this.damageDealtPlayer = damageDealtPlayer;
    }

    /**
     * 
     * @return
     *     The doubleKills
     */
    public int getDoubleKills() {
        return doubleKills;
    }

    /**
     * 
     * @param doubleKills
     *     The doubleKills
     */
    public void setDoubleKills(int doubleKills) {
        this.doubleKills = doubleKills;
    }

    /**
     * 
     * @return
     *     The firstBlood
     */
    public int getFirstBlood() {
        return firstBlood;
    }

    /**
     * 
     * @param firstBlood
     *     The firstBlood
     */
    public void setFirstBlood(int firstBlood) {
        this.firstBlood = firstBlood;
    }

    /**
     * 
     * @return
     *     The gold
     */
    public int getGold() {
        return gold;
    }

    /**
     * 
     * @param gold
     *     The gold
     */
    public void setGold(int gold) {
        this.gold = gold;
    }

    /**
     * 
     * @return
     *     The goldEarned
     */
    public int getGoldEarned() {
        return goldEarned;
    }

    /**
     * 
     * @param goldEarned
     *     The goldEarned
     */
    public void setGoldEarned(int goldEarned) {
        this.goldEarned = goldEarned;
    }

    /**
     * 
     * @return
     *     The goldSpent
     */
    public int getGoldSpent() {
        return goldSpent;
    }

    /**
     * 
     * @param goldSpent
     *     The goldSpent
     */
    public void setGoldSpent(int goldSpent) {
        this.goldSpent = goldSpent;
    }

    /**
     * 
     * @return
     *     The item0
     */
    public int getItem0() {
        return item0;
    }

    /**
     * 
     * @param item0
     *     The item0
     */
    public void setItem0(int item0) {
        this.item0 = item0;
    }

    /**
     * 
     * @return
     *     The item1
     */
    public int getItem1() {
        return item1;
    }

    /**
     * 
     * @param item1
     *     The item1
     */
    public void setItem1(int item1) {
        this.item1 = item1;
    }

    /**
     * 
     * @return
     *     The item2
     */
    public int getItem2() {
        return item2;
    }

    /**
     * 
     * @param item2
     *     The item2
     */
    public void setItem2(int item2) {
        this.item2 = item2;
    }

    /**
     * 
     * @return
     *     The item3
     */
    public int getItem3() {
        return item3;
    }

    /**
     * 
     * @param item3
     *     The item3
     */
    public void setItem3(int item3) {
        this.item3 = item3;
    }

    /**
     * 
     * @return
     *     The item4
     */
    public int getItem4() {
        return item4;
    }

    /**
     * 
     * @param item4
     *     The item4
     */
    public void setItem4(int item4) {
        this.item4 = item4;
    }

    /**
     * 
     * @return
     *     The item5
     */
    public int getItem5() {
        return item5;
    }

    /**
     * 
     * @param item5
     *     The item5
     */
    public void setItem5(int item5) {
        this.item5 = item5;
    }

    /**
     * 
     * @return
     *     The item6
     */
    public int getItem6() {
        return item6;
    }

    /**
     * 
     * @param item6
     *     The item6
     */
    public void setItem6(int item6) {
        this.item6 = item6;
    }

    /**
     * 
     * @return
     *     The itemPurchased
     */
    public int getItemPurchased() {
        return itemPurchased;
    }

    /**
     * 
     * @param itemPurchased
     *     The itemPurchased
     */
    public void setItemPurchased(int itemPurchased) {
        this.itemPurchased = itemPurchased;
    }

    /**
     * 
     * @return
     *     The killingSprees
     */
    public int getKillingSprees() {
        return killingSprees;
    }

    /**
     * 
     * @param killingSprees
     *     The killingSprees
     */
    public void setKillingSprees(int killingSprees) {
        this.killingSprees = killingSprees;
    }

    /**
     * 
     * @return
     *     The largestCriticalStrike
     */
    public int getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    /**
     * 
     * @param largestCriticalStrike
     *     The largestCriticalStrike
     */
    public void setLargestCriticalStrike(int largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    /**
     * 
     * @return
     *     The largestKillingSpree
     */
    public int getLargestKillingSpree() {
        return largestKillingSpree;
    }

    /**
     * 
     * @param largestKillingSpree
     *     The largestKillingSpree
     */
    public void setLargestKillingSpree(int largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    /**
     * 
     * @return
     *     The largestMultiKill
     */
    public int getLargestMultiKill() {
        return largestMultiKill;
    }

    /**
     * 
     * @param largestMultiKill
     *     The largestMultiKill
     */
    public void setLargestMultiKill(int largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    /**
     * Number of tier 3 items built.
     * <p>
     * 
     * 
     * @return
     *     The legendaryItemsCreated
     */
    public int getLegendaryItemsCreated() {
        return legendaryItemsCreated;
    }

    /**
     * Number of tier 3 items built.
     * <p>
     * 
     * 
     * @param legendaryItemsCreated
     *     The legendaryItemsCreated
     */
    public void setLegendaryItemsCreated(int legendaryItemsCreated) {
        this.legendaryItemsCreated = legendaryItemsCreated;
    }

    /**
     * 
     * @return
     *     The level
     */
    public Object getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    public void setLevel(Object level) {
        this.level = level;
    }

    /**
     * 
     * @return
     *     The magicDamageDealtPlayer
     */
    public int getMagicDamageDealtPlayer() {
        return magicDamageDealtPlayer;
    }

    /**
     * 
     * @param magicDamageDealtPlayer
     *     The magicDamageDealtPlayer
     */
    public void setMagicDamageDealtPlayer(int magicDamageDealtPlayer) {
        this.magicDamageDealtPlayer = magicDamageDealtPlayer;
    }

    /**
     * 
     * @return
     *     The magicDamageDealtToChampions
     */
    public int getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    /**
     * 
     * @param magicDamageDealtToChampions
     *     The magicDamageDealtToChampions
     */
    public void setMagicDamageDealtToChampions(int magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    /**
     * 
     * @return
     *     The magicDamageTaken
     */
    public int getMagicDamageTaken() {
        return magicDamageTaken;
    }

    /**
     * 
     * @param magicDamageTaken
     *     The magicDamageTaken
     */
    public void setMagicDamageTaken(int magicDamageTaken) {
        this.magicDamageTaken = magicDamageTaken;
    }

    /**
     * 
     * @return
     *     The minionsDenied
     */
    public int getMinionsDenied() {
        return minionsDenied;
    }

    /**
     * 
     * @param minionsDenied
     *     The minionsDenied
     */
    public void setMinionsDenied(int minionsDenied) {
        this.minionsDenied = minionsDenied;
    }

    /**
     * 
     * @return
     *     The minionsKilled
     */
    public int getMinionsKilled() {
        return minionsKilled;
    }

    /**
     * 
     * @param minionsKilled
     *     The minionsKilled
     */
    public void setMinionsKilled(int minionsKilled) {
        this.minionsKilled = minionsKilled;
    }

    /**
     * 
     * @return
     *     The neutralMinionsKilled
     */
    public int getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    /**
     * 
     * @param neutralMinionsKilled
     *     The neutralMinionsKilled
     */
    public void setNeutralMinionsKilled(int neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    /**
     * 
     * @return
     *     The neutralMinionsKilledEnemyJungle
     */
    public int getNeutralMinionsKilledEnemyJungle() {
        return neutralMinionsKilledEnemyJungle;
    }

    /**
     * 
     * @param neutralMinionsKilledEnemyJungle
     *     The neutralMinionsKilledEnemyJungle
     */
    public void setNeutralMinionsKilledEnemyJungle(int neutralMinionsKilledEnemyJungle) {
        this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
    }

    /**
     * 
     * @return
     *     The neutralMinionsKilledYourJungle
     */
    public int getNeutralMinionsKilledYourJungle() {
        return neutralMinionsKilledYourJungle;
    }

    /**
     * 
     * @param neutralMinionsKilledYourJungle
     *     The neutralMinionsKilledYourJungle
     */
    public void setNeutralMinionsKilledYourJungle(int neutralMinionsKilledYourJungle) {
        this.neutralMinionsKilledYourJungle = neutralMinionsKilledYourJungle;
    }

    /**
     * Flag specifying if the summoner got the killing blow on the nexus.
     * <p>
     * 
     * 
     * @return
     *     The nexusKilled
     */
    public boolean isNexusKilled() {
        return nexusKilled;
    }

    /**
     * Flag specifying if the summoner got the killing blow on the nexus.
     * <p>
     * 
     * 
     * @param nexusKilled
     *     The nexusKilled
     */
    public void setNexusKilled(boolean nexusKilled) {
        this.nexusKilled = nexusKilled;
    }

    /**
     * 
     * @return
     *     The nodeCaptureAssist
     */
    public int getNodeCaptureAssist() {
        return nodeCaptureAssist;
    }

    /**
     * 
     * @param nodeCaptureAssist
     *     The nodeCaptureAssist
     */
    public void setNodeCaptureAssist(int nodeCaptureAssist) {
        this.nodeCaptureAssist = nodeCaptureAssist;
    }

    /**
     * 
     * @return
     *     The nodeNeutralize
     */
    public int getNodeNeutralize() {
        return nodeNeutralize;
    }

    /**
     * 
     * @param nodeNeutralize
     *     The nodeNeutralize
     */
    public void setNodeNeutralize(int nodeNeutralize) {
        this.nodeNeutralize = nodeNeutralize;
    }

    /**
     * 
     * @return
     *     The nodeNeutralizeAssist
     */
    public int getNodeNeutralizeAssist() {
        return nodeNeutralizeAssist;
    }

    /**
     * 
     * @param nodeNeutralizeAssist
     *     The nodeNeutralizeAssist
     */
    public void setNodeNeutralizeAssist(int nodeNeutralizeAssist) {
        this.nodeNeutralizeAssist = nodeNeutralizeAssist;
    }

    /**
     * 
     * @return
     *     The numDeaths
     */
    public int getNumDeaths() {
        return numDeaths;
    }

    /**
     * 
     * @param numDeaths
     *     The numDeaths
     */
    public void setNumDeaths(int numDeaths) {
        this.numDeaths = numDeaths;
    }

    /**
     * 
     * @return
     *     The numItemsBought
     */
    public int getNumItemsBought() {
        return numItemsBought;
    }

    /**
     * 
     * @param numItemsBought
     *     The numItemsBought
     */
    public void setNumItemsBought(int numItemsBought) {
        this.numItemsBought = numItemsBought;
    }

    /**
     * 
     * @return
     *     The objectivePlayerScore
     */
    public int getObjectivePlayerScore() {
        return objectivePlayerScore;
    }

    /**
     * 
     * @param objectivePlayerScore
     *     The objectivePlayerScore
     */
    public void setObjectivePlayerScore(int objectivePlayerScore) {
        this.objectivePlayerScore = objectivePlayerScore;
    }

    /**
     * 
     * @return
     *     The pentaKills
     */
    public int getPentaKills() {
        return pentaKills;
    }

    /**
     * 
     * @param pentaKills
     *     The pentaKills
     */
    public void setPentaKills(int pentaKills) {
        this.pentaKills = pentaKills;
    }

    /**
     * 
     * @return
     *     The physicalDamageDealtPlayer
     */
    public int getPhysicalDamageDealtPlayer() {
        return physicalDamageDealtPlayer;
    }

    /**
     * 
     * @param physicalDamageDealtPlayer
     *     The physicalDamageDealtPlayer
     */
    public void setPhysicalDamageDealtPlayer(int physicalDamageDealtPlayer) {
        this.physicalDamageDealtPlayer = physicalDamageDealtPlayer;
    }

    /**
     * 
     * @return
     *     The physicalDamageDealtToChampions
     */
    public int getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    /**
     * 
     * @param physicalDamageDealtToChampions
     *     The physicalDamageDealtToChampions
     */
    public void setPhysicalDamageDealtToChampions(int physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    /**
     * 
     * @return
     *     The physicalDamageTaken
     */
    public int getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    /**
     * 
     * @param physicalDamageTaken
     *     The physicalDamageTaken
     */
    public void setPhysicalDamageTaken(int physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    /**
     * 
     * @return
     *     The quadraKills
     */
    public int getQuadraKills() {
        return quadraKills;
    }

    /**
     * 
     * @param quadraKills
     *     The quadraKills
     */
    public void setQuadraKills(int quadraKills) {
        this.quadraKills = quadraKills;
    }

    /**
     * 
     * @return
     *     The sightWardsBought
     */
    public int getSightWardsBought() {
        return sightWardsBought;
    }

    /**
     * 
     * @param sightWardsBought
     *     The sightWardsBought
     */
    public void setSightWardsBought(int sightWardsBought) {
        this.sightWardsBought = sightWardsBought;
    }

    /**
     * Number of times first champion spell was cast.
     * <p>
     * 
     * 
     * @return
     *     The spell1Cast
     */
    public int getSpell1Cast() {
        return spell1Cast;
    }

    /**
     * Number of times first champion spell was cast.
     * <p>
     * 
     * 
     * @param spell1Cast
     *     The spell1Cast
     */
    public void setSpell1Cast(int spell1Cast) {
        this.spell1Cast = spell1Cast;
    }

    /**
     * Number of times second champion spell was cast.
     * <p>
     * 
     * 
     * @return
     *     The spell2Cast
     */
    public int getSpell2Cast() {
        return spell2Cast;
    }

    /**
     * Number of times second champion spell was cast.
     * <p>
     * 
     * 
     * @param spell2Cast
     *     The spell2Cast
     */
    public void setSpell2Cast(int spell2Cast) {
        this.spell2Cast = spell2Cast;
    }

    /**
     * Number of times third champion spell was cast.
     * <p>
     * 
     * 
     * @return
     *     The spell3Cast
     */
    public int getSpell3Cast() {
        return spell3Cast;
    }

    /**
     * Number of times third champion spell was cast.
     * <p>
     * 
     * 
     * @param spell3Cast
     *     The spell3Cast
     */
    public void setSpell3Cast(int spell3Cast) {
        this.spell3Cast = spell3Cast;
    }

    /**
     * Number of times fourth champion spell was cast.
     * <p>
     * 
     * 
     * @return
     *     The spell4Cast
     */
    public int getSpell4Cast() {
        return spell4Cast;
    }

    /**
     * Number of times fourth champion spell was cast.
     * <p>
     * 
     * 
     * @param spell4Cast
     *     The spell4Cast
     */
    public void setSpell4Cast(int spell4Cast) {
        this.spell4Cast = spell4Cast;
    }

    /**
     * Number of times first summoner spell was cast.
     * <p>
     * 
     * 
     * @return
     *     The summonSpell1Cast
     */
    public int getSummonSpell1Cast() {
        return summonSpell1Cast;
    }

    /**
     * Number of times first summoner spell was cast.
     * <p>
     * 
     * 
     * @param summonSpell1Cast
     *     The summonSpell1Cast
     */
    public void setSummonSpell1Cast(int summonSpell1Cast) {
        this.summonSpell1Cast = summonSpell1Cast;
    }

    /**
     * Number of times second summoner spell was cast.
     * <p>
     * 
     * 
     * @return
     *     The summonSpell2Cast
     */
    public int getSummonSpell2Cast() {
        return summonSpell2Cast;
    }

    /**
     * Number of times second summoner spell was cast.
     * <p>
     * 
     * 
     * @param summonSpell2Cast
     *     The summonSpell2Cast
     */
    public void setSummonSpell2Cast(int summonSpell2Cast) {
        this.summonSpell2Cast = summonSpell2Cast;
    }

    /**
     * 
     * @return
     *     The superMonsterKilled
     */
    public int getSuperMonsterKilled() {
        return superMonsterKilled;
    }

    /**
     * 
     * @param superMonsterKilled
     *     The superMonsterKilled
     */
    public void setSuperMonsterKilled(int superMonsterKilled) {
        this.superMonsterKilled = superMonsterKilled;
    }

    /**
     * 
     * @return
     *     The team
     */
    public int getTeam() {
        return team;
    }

    /**
     * 
     * @param team
     *     The team
     */
    public void setTeam(int team) {
        this.team = team;
    }

    /**
     * 
     * @return
     *     The teamObjective
     */
    public int getTeamObjective() {
        return teamObjective;
    }

    /**
     * 
     * @param teamObjective
     *     The teamObjective
     */
    public void setTeamObjective(int teamObjective) {
        this.teamObjective = teamObjective;
    }

    /**
     * 
     * @return
     *     The timePlayed
     */
    public int getTimePlayed() {
        return timePlayed;
    }

    /**
     * 
     * @param timePlayed
     *     The timePlayed
     */
    public void setTimePlayed(int timePlayed) {
        this.timePlayed = timePlayed;
    }

    /**
     * 
     * @return
     *     The totalDamageDealt
     */
    public int getTotalDamageDealt() {
        return totalDamageDealt;
    }

    /**
     * 
     * @param totalDamageDealt
     *     The totalDamageDealt
     */
    public void setTotalDamageDealt(int totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    /**
     * 
     * @return
     *     The totalDamageDealtToChampions
     */
    public int getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    /**
     * 
     * @param totalDamageDealtToChampions
     *     The totalDamageDealtToChampions
     */
    public void setTotalDamageDealtToChampions(int totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    /**
     * 
     * @return
     *     The totalDamageTaken
     */
    public int getTotalDamageTaken() {
        return totalDamageTaken;
    }

    /**
     * 
     * @param totalDamageTaken
     *     The totalDamageTaken
     */
    public void setTotalDamageTaken(int totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    /**
     * 
     * @return
     *     The totalHeal
     */
    public int getTotalHeal() {
        return totalHeal;
    }

    /**
     * 
     * @param totalHeal
     *     The totalHeal
     */
    public void setTotalHeal(int totalHeal) {
        this.totalHeal = totalHeal;
    }

    /**
     * 
     * @return
     *     The totalPlayerScore
     */
    public int getTotalPlayerScore() {
        return totalPlayerScore;
    }

    /**
     * 
     * @param totalPlayerScore
     *     The totalPlayerScore
     */
    public void setTotalPlayerScore(int totalPlayerScore) {
        this.totalPlayerScore = totalPlayerScore;
    }

    /**
     * 
     * @return
     *     The totalScoreRank
     */
    public int getTotalScoreRank() {
        return totalScoreRank;
    }

    /**
     * 
     * @param totalScoreRank
     *     The totalScoreRank
     */
    public void setTotalScoreRank(int totalScoreRank) {
        this.totalScoreRank = totalScoreRank;
    }

    /**
     * 
     * @return
     *     The totalTimeCrowdControlDealt
     */
    public int getTotalTimeCrowdControlDealt() {
        return totalTimeCrowdControlDealt;
    }

    /**
     * 
     * @param totalTimeCrowdControlDealt
     *     The totalTimeCrowdControlDealt
     */
    public void setTotalTimeCrowdControlDealt(int totalTimeCrowdControlDealt) {
        this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
    }

    /**
     * 
     * @return
     *     The totalUnitsHealed
     */
    public int getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    /**
     * 
     * @param totalUnitsHealed
     *     The totalUnitsHealed
     */
    public void setTotalUnitsHealed(int totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    /**
     * 
     * @return
     *     The tripleKills
     */
    public int getTripleKills() {
        return tripleKills;
    }

    /**
     * 
     * @param tripleKills
     *     The tripleKills
     */
    public void setTripleKills(int tripleKills) {
        this.tripleKills = tripleKills;
    }

    /**
     * 
     * @return
     *     The trueDamageDealtPlayer
     */
    public int getTrueDamageDealtPlayer() {
        return trueDamageDealtPlayer;
    }

    /**
     * 
     * @param trueDamageDealtPlayer
     *     The trueDamageDealtPlayer
     */
    public void setTrueDamageDealtPlayer(int trueDamageDealtPlayer) {
        this.trueDamageDealtPlayer = trueDamageDealtPlayer;
    }

    /**
     * 
     * @return
     *     The trueDamageDealtToChampions
     */
    public int getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    /**
     * 
     * @param trueDamageDealtToChampions
     *     The trueDamageDealtToChampions
     */
    public void setTrueDamageDealtToChampions(int trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    /**
     * 
     * @return
     *     The trueDamageTaken
     */
    public int getTrueDamageTaken() {
        return trueDamageTaken;
    }

    /**
     * 
     * @param trueDamageTaken
     *     The trueDamageTaken
     */
    public void setTrueDamageTaken(int trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    /**
     * 
     * @return
     *     The turretsKilled
     */
    public int getTurretsKilled() {
        return turretsKilled;
    }

    /**
     * 
     * @param turretsKilled
     *     The turretsKilled
     */
    public void setTurretsKilled(int turretsKilled) {
        this.turretsKilled = turretsKilled;
    }

    /**
     * 
     * @return
     *     The unrealKills
     */
    public int getUnrealKills() {
        return unrealKills;
    }

    /**
     * 
     * @param unrealKills
     *     The unrealKills
     */
    public void setUnrealKills(int unrealKills) {
        this.unrealKills = unrealKills;
    }

    /**
     * 
     * @return
     *     The victoryPointTotal
     */
    public int getVictoryPointTotal() {
        return victoryPointTotal;
    }

    /**
     * 
     * @param victoryPointTotal
     *     The victoryPointTotal
     */
    public void setVictoryPointTotal(int victoryPointTotal) {
        this.victoryPointTotal = victoryPointTotal;
    }

    /**
     * 
     * @return
     *     The visionWardsBought
     */
    public int getVisionWardsBought() {
        return visionWardsBought;
    }

    /**
     * 
     * @param visionWardsBought
     *     The visionWardsBought
     */
    public void setVisionWardsBought(int visionWardsBought) {
        this.visionWardsBought = visionWardsBought;
    }

    /**
     * 
     * @return
     *     The wardKilled
     */
    public int getWardKilled() {
        return wardKilled;
    }

    /**
     * 
     * @param wardKilled
     *     The wardKilled
     */
    public void setWardKilled(int wardKilled) {
        this.wardKilled = wardKilled;
    }

    /**
     * 
     * @return
     *     The wardPlaced
     */
    public int getWardPlaced() {
        return wardPlaced;
    }

    /**
     * 
     * @param wardPlaced
     *     The wardPlaced
     */
    public void setWardPlaced(int wardPlaced) {
        this.wardPlaced = wardPlaced;
    }

    /**
     * 
     * @return
     *     The win
     */
    public int getWin() {
        return win;
    }

    /**
     * 
     * @param win
     *     The win
     */
    public void setWin(int win) {
        this.win = win;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(assists).append(barracksKilled).append(championsKilled).append(combatPlayerScore).append(consumablesPurchased).append(damageDealtPlayer).append(doubleKills).append(firstBlood).append(gold).append(goldEarned).append(goldSpent).append(item0).append(item1).append(item2).append(item3).append(item4).append(item5).append(item6).append(itemPurchased).append(killingSprees).append(largestCriticalStrike).append(largestKillingSpree).append(largestMultiKill).append(legendaryItemsCreated).append(level).append(magicDamageDealtPlayer).append(magicDamageDealtToChampions).append(magicDamageTaken).append(minionsDenied).append(minionsKilled).append(neutralMinionsKilled).append(neutralMinionsKilledEnemyJungle).append(neutralMinionsKilledYourJungle).append(nexusKilled).append(nodeCaptureAssist).append(nodeNeutralize).append(nodeNeutralizeAssist).append(numDeaths).append(numItemsBought).append(objectivePlayerScore).append(pentaKills).append(physicalDamageDealtPlayer).append(physicalDamageDealtToChampions).append(physicalDamageTaken).append(quadraKills).append(sightWardsBought).append(spell1Cast).append(spell2Cast).append(spell3Cast).append(spell4Cast).append(summonSpell1Cast).append(summonSpell2Cast).append(superMonsterKilled).append(team).append(teamObjective).append(timePlayed).append(totalDamageDealt).append(totalDamageDealtToChampions).append(totalDamageTaken).append(totalHeal).append(totalPlayerScore).append(totalScoreRank).append(totalTimeCrowdControlDealt).append(totalUnitsHealed).append(tripleKills).append(trueDamageDealtPlayer).append(trueDamageDealtToChampions).append(trueDamageTaken).append(turretsKilled).append(unrealKills).append(victoryPointTotal).append(visionWardsBought).append(wardKilled).append(wardPlaced).append(win).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RawStats) == false) {
            return false;
        }
        RawStats rhs = ((RawStats) other);
        return new EqualsBuilder().append(assists, rhs.assists).append(barracksKilled, rhs.barracksKilled).append(championsKilled, rhs.championsKilled).append(combatPlayerScore, rhs.combatPlayerScore).append(consumablesPurchased, rhs.consumablesPurchased).append(damageDealtPlayer, rhs.damageDealtPlayer).append(doubleKills, rhs.doubleKills).append(firstBlood, rhs.firstBlood).append(gold, rhs.gold).append(goldEarned, rhs.goldEarned).append(goldSpent, rhs.goldSpent).append(item0, rhs.item0).append(item1, rhs.item1).append(item2, rhs.item2).append(item3, rhs.item3).append(item4, rhs.item4).append(item5, rhs.item5).append(item6, rhs.item6).append(itemPurchased, rhs.itemPurchased).append(killingSprees, rhs.killingSprees).append(largestCriticalStrike, rhs.largestCriticalStrike).append(largestKillingSpree, rhs.largestKillingSpree).append(largestMultiKill, rhs.largestMultiKill).append(legendaryItemsCreated, rhs.legendaryItemsCreated).append(level, rhs.level).append(magicDamageDealtPlayer, rhs.magicDamageDealtPlayer).append(magicDamageDealtToChampions, rhs.magicDamageDealtToChampions).append(magicDamageTaken, rhs.magicDamageTaken).append(minionsDenied, rhs.minionsDenied).append(minionsKilled, rhs.minionsKilled).append(neutralMinionsKilled, rhs.neutralMinionsKilled).append(neutralMinionsKilledEnemyJungle, rhs.neutralMinionsKilledEnemyJungle).append(neutralMinionsKilledYourJungle, rhs.neutralMinionsKilledYourJungle).append(nexusKilled, rhs.nexusKilled).append(nodeCaptureAssist, rhs.nodeCaptureAssist).append(nodeNeutralize, rhs.nodeNeutralize).append(nodeNeutralizeAssist, rhs.nodeNeutralizeAssist).append(numDeaths, rhs.numDeaths).append(numItemsBought, rhs.numItemsBought).append(objectivePlayerScore, rhs.objectivePlayerScore).append(pentaKills, rhs.pentaKills).append(physicalDamageDealtPlayer, rhs.physicalDamageDealtPlayer).append(physicalDamageDealtToChampions, rhs.physicalDamageDealtToChampions).append(physicalDamageTaken, rhs.physicalDamageTaken).append(quadraKills, rhs.quadraKills).append(sightWardsBought, rhs.sightWardsBought).append(spell1Cast, rhs.spell1Cast).append(spell2Cast, rhs.spell2Cast).append(spell3Cast, rhs.spell3Cast).append(spell4Cast, rhs.spell4Cast).append(summonSpell1Cast, rhs.summonSpell1Cast).append(summonSpell2Cast, rhs.summonSpell2Cast).append(superMonsterKilled, rhs.superMonsterKilled).append(team, rhs.team).append(teamObjective, rhs.teamObjective).append(timePlayed, rhs.timePlayed).append(totalDamageDealt, rhs.totalDamageDealt).append(totalDamageDealtToChampions, rhs.totalDamageDealtToChampions).append(totalDamageTaken, rhs.totalDamageTaken).append(totalHeal, rhs.totalHeal).append(totalPlayerScore, rhs.totalPlayerScore).append(totalScoreRank, rhs.totalScoreRank).append(totalTimeCrowdControlDealt, rhs.totalTimeCrowdControlDealt).append(totalUnitsHealed, rhs.totalUnitsHealed).append(tripleKills, rhs.tripleKills).append(trueDamageDealtPlayer, rhs.trueDamageDealtPlayer).append(trueDamageDealtToChampions, rhs.trueDamageDealtToChampions).append(trueDamageTaken, rhs.trueDamageTaken).append(turretsKilled, rhs.turretsKilled).append(unrealKills, rhs.unrealKills).append(victoryPointTotal, rhs.victoryPointTotal).append(visionWardsBought, rhs.visionWardsBought).append(wardKilled, rhs.wardKilled).append(wardPlaced, rhs.wardPlaced).append(win, rhs.win).isEquals();
    }

}
