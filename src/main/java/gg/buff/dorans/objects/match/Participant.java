
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
 * Participant
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class Participant {

    /**
     * Champion ID
     * <p>
     * 
     * 
     */
    @Expose
    private int championId;
    /**
     * Highest ranked tier achieved for the previous season, if any, otherwise null. Used to display border in game loading screen
     * <p>
     * 
     * 
     */
    @Expose
    private Participant.HighestAchievedSeasonTier highestAchievedSeasonTier;
    /**
     * List of mastery information
     * <p>
     * 
     * 
     */
    @Expose
    private List<Mastery> masteries = new ArrayList<Mastery>();
    /**
     * Participant ID
     * <p>
     * 
     * 
     */
    @Expose
    private int participantId;
    /**
     * List of rune information
     * <p>
     * 
     * 
     */
    @Expose
    private List<Rune> runes = new ArrayList<Rune>();
    /**
     * First summoner spell ID
     * <p>
     * 
     * 
     */
    @Expose
    private int spell1Id;
    @Expose
    private int spell2Id;
    /**
     * ParticipantStats
     * <p>
     * 
     * 
     */
    @Expose
    private ParticipantStats stats;
    /**
     * Frame
     * <p>
     * This object contains game frame information
     * 
     */
    @Expose
    private Frame timeline;

    /**
     * Champion ID
     * <p>
     * 
     * 
     * @return
     *     The championId
     */
    public int getChampionId() {
        return championId;
    }

    /**
     * Champion ID
     * <p>
     * 
     * 
     * @param championId
     *     The championId
     */
    public void setChampionId(int championId) {
        this.championId = championId;
    }

    /**
     * Highest ranked tier achieved for the previous season, if any, otherwise null. Used to display border in game loading screen
     * <p>
     * 
     * 
     * @return
     *     The highestAchievedSeasonTier
     */
    public Participant.HighestAchievedSeasonTier getHighestAchievedSeasonTier() {
        return highestAchievedSeasonTier;
    }

    /**
     * Highest ranked tier achieved for the previous season, if any, otherwise null. Used to display border in game loading screen
     * <p>
     * 
     * 
     * @param highestAchievedSeasonTier
     *     The highestAchievedSeasonTier
     */
    public void setHighestAchievedSeasonTier(Participant.HighestAchievedSeasonTier highestAchievedSeasonTier) {
        this.highestAchievedSeasonTier = highestAchievedSeasonTier;
    }

    /**
     * List of mastery information
     * <p>
     * 
     * 
     * @return
     *     The masteries
     */
    public List<Mastery> getMasteries() {
        return masteries;
    }

    /**
     * List of mastery information
     * <p>
     * 
     * 
     * @param masteries
     *     The masteries
     */
    public void setMasteries(List<Mastery> masteries) {
        this.masteries = masteries;
    }

    /**
     * Participant ID
     * <p>
     * 
     * 
     * @return
     *     The participantId
     */
    public int getParticipantId() {
        return participantId;
    }

    /**
     * Participant ID
     * <p>
     * 
     * 
     * @param participantId
     *     The participantId
     */
    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    /**
     * List of rune information
     * <p>
     * 
     * 
     * @return
     *     The runes
     */
    public List<Rune> getRunes() {
        return runes;
    }

    /**
     * List of rune information
     * <p>
     * 
     * 
     * @param runes
     *     The runes
     */
    public void setRunes(List<Rune> runes) {
        this.runes = runes;
    }

    /**
     * First summoner spell ID
     * <p>
     * 
     * 
     * @return
     *     The spell1Id
     */
    public int getSpell1Id() {
        return spell1Id;
    }

    /**
     * First summoner spell ID
     * <p>
     * 
     * 
     * @param spell1Id
     *     The spell1Id
     */
    public void setSpell1Id(int spell1Id) {
        this.spell1Id = spell1Id;
    }

    /**
     * 
     * @return
     *     The spell2Id
     */
    public int getSpell2Id() {
        return spell2Id;
    }

    /**
     * 
     * @param spell2Id
     *     The spell2Id
     */
    public void setSpell2Id(int spell2Id) {
        this.spell2Id = spell2Id;
    }

    /**
     * ParticipantStats
     * <p>
     * 
     * 
     * @return
     *     The stats
     */
    public ParticipantStats getStats() {
        return stats;
    }

    /**
     * ParticipantStats
     * <p>
     * 
     * 
     * @param stats
     *     The stats
     */
    public void setStats(ParticipantStats stats) {
        this.stats = stats;
    }

    /**
     * Frame
     * <p>
     * This object contains game frame information
     * 
     * @return
     *     The timeline
     */
    public Frame getTimeline() {
        return timeline;
    }

    /**
     * Frame
     * <p>
     * This object contains game frame information
     * 
     * @param timeline
     *     The timeline
     */
    public void setTimeline(Frame timeline) {
        this.timeline = timeline;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(championId).append(highestAchievedSeasonTier).append(masteries).append(participantId).append(runes).append(spell1Id).append(spell2Id).append(stats).append(timeline).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Participant) == false) {
            return false;
        }
        Participant rhs = ((Participant) other);
        return new EqualsBuilder().append(championId, rhs.championId).append(highestAchievedSeasonTier, rhs.highestAchievedSeasonTier).append(masteries, rhs.masteries).append(participantId, rhs.participantId).append(runes, rhs.runes).append(spell1Id, rhs.spell1Id).append(spell2Id, rhs.spell2Id).append(stats, rhs.stats).append(timeline, rhs.timeline).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum HighestAchievedSeasonTier {

        @SerializedName("CHALLENGER")
        CHALLENGER("CHALLENGER"),
        @SerializedName("MASTER")
        MASTER("MASTER"),
        @SerializedName("DIAMOND")
        DIAMOND("DIAMOND"),
        @SerializedName("PLATINUM")
        PLATINUM("PLATINUM"),
        @SerializedName("GOLD")
        GOLD("GOLD"),
        @SerializedName("SILVER")
        SILVER("SILVER"),
        @SerializedName("BRONZE")
        BRONZE("BRONZE"),
        @SerializedName("UNRANKED")
        UNRANKED("UNRANKED");
        private final String value;
        private static Map<String, Participant.HighestAchievedSeasonTier> constants = new HashMap<String, Participant.HighestAchievedSeasonTier>();

        static {
            for (Participant.HighestAchievedSeasonTier c: values()) {
                constants.put(c.value, c);
            }
        }

        private HighestAchievedSeasonTier(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static Participant.HighestAchievedSeasonTier fromValue(String value) {
            Participant.HighestAchievedSeasonTier constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
