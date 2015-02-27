
package gg.buff.dorans.objects.game;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class RecentGames {

    /**
     * Collection of recent games played (max 10).
     * <p>
     * 
     * 
     */
    @Expose
    private List<RawStats> games = new ArrayList<RawStats>();
    /**
     * Summoner ID.
     * <p>
     * 
     * 
     */
    @Expose
    private long summonerId;

    /**
     * Collection of recent games played (max 10).
     * <p>
     * 
     * 
     * @return
     *     The games
     */
    public List<RawStats> getGames() {
        return games;
    }

    /**
     * Collection of recent games played (max 10).
     * <p>
     * 
     * 
     * @param games
     *     The games
     */
    public void setGames(List<RawStats> games) {
        this.games = games;
    }

    /**
     * Summoner ID.
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
     * Summoner ID.
     * <p>
     * 
     * 
     * @param summonerId
     *     The summonerId
     */
    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(games).append(summonerId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecentGames) == false) {
            return false;
        }
        RecentGames rhs = ((RecentGames) other);
        return new EqualsBuilder().append(games, rhs.games).append(summonerId, rhs.summonerId).isEquals();
    }

}
