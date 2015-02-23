
package gg.buff.dorans.objects.current_game;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
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
     * Flag indicating whether or not this participant is a bot
     * <p>
     * 
     * 
     */
    @Expose
    private boolean bot;
    /**
     * The ID of the champion played by this participant
     * <p>
     * 
     * 
     */
    @Expose
    private long championId;
    /**
     * THe masteries used by this participant
     * <p>
     * 
     * 
     */
    @Expose
    private List<Mastery> masteries = new ArrayList<Mastery>();
    /**
     * The ID of the profile icon used by this participant
     * <p>
     * 
     * 
     */
    @Expose
    private long profileIconId;
    /**
     * The runes used by this participant
     * <p>
     * 
     * 
     */
    @Expose
    private List<Rune> runes = new ArrayList<Rune>();
    /**
     * The ID of the first summoner spell used by this participant
     * <p>
     * 
     * 
     */
    @Expose
    private long spell1Id;
    /**
     * The ID of the second summoner spell used by this participant
     * <p>
     * 
     * 
     */
    @Expose
    private long spell2Id;
    /**
     * The summoner ID of this participant
     * <p>
     * 
     * 
     */
    @Expose
    private long summonerId;
    /**
     * The summoner name of this participant
     * <p>
     * 
     * 
     */
    @Expose
    private String summonerName;
    /**
     * The team ID of this participant, indicating the participants's team
     * <p>
     * 
     * 
     */
    @Expose
    private long teamId;

    /**
     * Flag indicating whether or not this participant is a bot
     * <p>
     * 
     * 
     * @return
     *     The bot
     */
    public boolean isBot() {
        return bot;
    }

    /**
     * Flag indicating whether or not this participant is a bot
     * <p>
     * 
     * 
     * @param bot
     *     The bot
     */
    public void setBot(boolean bot) {
        this.bot = bot;
    }

    /**
     * The ID of the champion played by this participant
     * <p>
     * 
     * 
     * @return
     *     The championId
     */
    public long getChampionId() {
        return championId;
    }

    /**
     * The ID of the champion played by this participant
     * <p>
     * 
     * 
     * @param championId
     *     The championId
     */
    public void setChampionId(long championId) {
        this.championId = championId;
    }

    /**
     * THe masteries used by this participant
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
     * THe masteries used by this participant
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
     * The ID of the profile icon used by this participant
     * <p>
     * 
     * 
     * @return
     *     The profileIconId
     */
    public long getProfileIconId() {
        return profileIconId;
    }

    /**
     * The ID of the profile icon used by this participant
     * <p>
     * 
     * 
     * @param profileIconId
     *     The profileIconId
     */
    public void setProfileIconId(long profileIconId) {
        this.profileIconId = profileIconId;
    }

    /**
     * The runes used by this participant
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
     * The runes used by this participant
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
     * The ID of the first summoner spell used by this participant
     * <p>
     * 
     * 
     * @return
     *     The spell1Id
     */
    public long getSpell1Id() {
        return spell1Id;
    }

    /**
     * The ID of the first summoner spell used by this participant
     * <p>
     * 
     * 
     * @param spell1Id
     *     The spell1Id
     */
    public void setSpell1Id(long spell1Id) {
        this.spell1Id = spell1Id;
    }

    /**
     * The ID of the second summoner spell used by this participant
     * <p>
     * 
     * 
     * @return
     *     The spell2Id
     */
    public long getSpell2Id() {
        return spell2Id;
    }

    /**
     * The ID of the second summoner spell used by this participant
     * <p>
     * 
     * 
     * @param spell2Id
     *     The spell2Id
     */
    public void setSpell2Id(long spell2Id) {
        this.spell2Id = spell2Id;
    }

    /**
     * The summoner ID of this participant
     * <p>
     * 
     * 
     * @return
     *     The summonerId
     */
    public long getSummonerId() {
        return summonerId;
    }

    /**
     * The summoner ID of this participant
     * <p>
     * 
     * 
     * @param summonerId
     *     The summonerId
     */
    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    /**
     * The summoner name of this participant
     * <p>
     * 
     * 
     * @return
     *     The summonerName
     */
    public String getSummonerName() {
        return summonerName;
    }

    /**
     * The summoner name of this participant
     * <p>
     * 
     * 
     * @param summonerName
     *     The summonerName
     */
    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    /**
     * The team ID of this participant, indicating the participants's team
     * <p>
     * 
     * 
     * @return
     *     The teamId
     */
    public long getTeamId() {
        return teamId;
    }

    /**
     * The team ID of this participant, indicating the participants's team
     * <p>
     * 
     * 
     * @param teamId
     *     The teamId
     */
    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bot).append(championId).append(masteries).append(profileIconId).append(runes).append(spell1Id).append(spell2Id).append(summonerId).append(summonerName).append(teamId).toHashCode();
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
        return new EqualsBuilder().append(bot, rhs.bot).append(championId, rhs.championId).append(masteries, rhs.masteries).append(profileIconId, rhs.profileIconId).append(runes, rhs.runes).append(spell1Id, rhs.spell1Id).append(spell2Id, rhs.spell2Id).append(summonerId, rhs.summonerId).append(summonerName, rhs.summonerName).append(teamId, rhs.teamId).isEquals();
    }

}
