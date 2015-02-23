
package gg.buff.dorans.objects.current_game;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Mastery
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class Mastery {

    /**
     * The ID of the mastery
     * <p>
     * 
     * 
     */
    @Expose
    private long masteryId;
    /**
     * The number of points put into this mastery by the user
     * <p>
     * 
     * 
     */
    @Expose
    private int rank;

    /**
     * The ID of the mastery
     * <p>
     * 
     * 
     * @return
     *     The masteryId
     */
    public long getMasteryId() {
        return masteryId;
    }

    /**
     * The ID of the mastery
     * <p>
     * 
     * 
     * @param masteryId
     *     The masteryId
     */
    public void setMasteryId(long masteryId) {
        this.masteryId = masteryId;
    }

    /**
     * The number of points put into this mastery by the user
     * <p>
     * 
     * 
     * @return
     *     The rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * The number of points put into this mastery by the user
     * <p>
     * 
     * 
     * @param rank
     *     The rank
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(masteryId).append(rank).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mastery) == false) {
            return false;
        }
        Mastery rhs = ((Mastery) other);
        return new EqualsBuilder().append(masteryId, rhs.masteryId).append(rank, rhs.rank).isEquals();
    }

}
