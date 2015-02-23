
package gg.buff.dorans.objects.current_game;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * BannedChampion
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class BannedChampion {

    /**
     * The ID of the banned champion
     * <p>
     * 
     * 
     */
    @Expose
    private Object championId;
    /**
     * The turn during which the champion was banned
     * <p>
     * 
     * 
     */
    @Expose
    private Object pickTurn;
    /**
     * The ID of the team that banned the champion
     * <p>
     * 
     * 
     */
    @Expose
    private Object teamId;

    /**
     * The ID of the banned champion
     * <p>
     * 
     * 
     * @return
     *     The championId
     */
    public Object getChampionId() {
        return championId;
    }

    /**
     * The ID of the banned champion
     * <p>
     * 
     * 
     * @param championId
     *     The championId
     */
    public void setChampionId(Object championId) {
        this.championId = championId;
    }

    /**
     * The turn during which the champion was banned
     * <p>
     * 
     * 
     * @return
     *     The pickTurn
     */
    public Object getPickTurn() {
        return pickTurn;
    }

    /**
     * The turn during which the champion was banned
     * <p>
     * 
     * 
     * @param pickTurn
     *     The pickTurn
     */
    public void setPickTurn(Object pickTurn) {
        this.pickTurn = pickTurn;
    }

    /**
     * The ID of the team that banned the champion
     * <p>
     * 
     * 
     * @return
     *     The teamId
     */
    public Object getTeamId() {
        return teamId;
    }

    /**
     * The ID of the team that banned the champion
     * <p>
     * 
     * 
     * @param teamId
     *     The teamId
     */
    public void setTeamId(Object teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(championId).append(pickTurn).append(teamId).toHashCode();
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
        return new EqualsBuilder().append(championId, rhs.championId).append(pickTurn, rhs.pickTurn).append(teamId, rhs.teamId).isEquals();
    }

}
