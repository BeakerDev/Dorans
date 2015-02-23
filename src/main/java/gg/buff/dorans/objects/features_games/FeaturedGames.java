
package gg.buff.dorans.objects.features_games;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import gg.buff.dorans.objects.current_game.CurrentGameInfo;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Featured Games
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class FeaturedGames {

    /**
     * The suggested interval to wait before requesting FeaturedGames again
     * <p>
     * 
     * 
     */
    @Expose
    private long clientRefreshInterval;
    /**
     * The list of featured games
     * <p>
     * 
     * 
     */
    @Expose
    private List<CurrentGameInfo> gamesList = new ArrayList<CurrentGameInfo>();

    /**
     * The suggested interval to wait before requesting FeaturedGames again
     * <p>
     * 
     * 
     * @return
     *     The clientRefreshInterval
     */
    public long getClientRefreshInterval() {
        return clientRefreshInterval;
    }

    /**
     * The suggested interval to wait before requesting FeaturedGames again
     * <p>
     * 
     * 
     * @param clientRefreshInterval
     *     The clientRefreshInterval
     */
    public void setClientRefreshInterval(long clientRefreshInterval) {
        this.clientRefreshInterval = clientRefreshInterval;
    }

    /**
     * The list of featured games
     * <p>
     * 
     * 
     * @return
     *     The gamesList
     */
    public List<CurrentGameInfo> getGamesList() {
        return gamesList;
    }

    /**
     * The list of featured games
     * <p>
     * 
     * 
     * @param gamesList
     *     The gamesList
     */
    public void setGamesList(List<CurrentGameInfo> gamesList) {
        this.gamesList = gamesList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clientRefreshInterval).append(gamesList).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FeaturedGames) == false) {
            return false;
        }
        FeaturedGames rhs = ((FeaturedGames) other);
        return new EqualsBuilder().append(clientRefreshInterval, rhs.clientRefreshInterval).append(gamesList, rhs.gamesList).isEquals();
    }

}
