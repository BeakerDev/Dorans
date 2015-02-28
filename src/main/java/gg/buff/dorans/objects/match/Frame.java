
package gg.buff.dorans.objects.match;

import java.util.Map;
import javax.annotation.Generated;
import gg.buff.dorans.objects.match.ParticipantFrame;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Frame
 * <p>
 * This object contains game frame information
 * 
 */
@Generated("org.jsonschema2pojo")
public class Frame {

    /**
     * List of events for this frame
     * <p>
     * 
     * 
     */
    @Expose
    private Object events;
    /**
     * Map of each participant ID to the participant's information for the frame.
     * <p>
     * 
     * 
     */
    @Expose
    private Map<String, ParticipantFrame> participants;
    /**
     * Represents how many milliseconds into the game the frame occurred.
     * <p>
     * 
     * 
     */
    @Expose
    private long timestamp;

    /**
     * List of events for this frame
     * <p>
     * 
     * 
     * @return
     *     The events
     */
    public Object getEvents() {
        return events;
    }

    /**
     * List of events for this frame
     * <p>
     * 
     * 
     * @param events
     *     The events
     */
    public void setEvents(Object events) {
        this.events = events;
    }

    /**
     * Map of each participant ID to the participant's information for the frame.
     * <p>
     * 
     * 
     * @return
     *     The participants
     */
    public Map<String, ParticipantFrame> getParticipants() {
        return participants;
    }

    /**
     * Map of each participant ID to the participant's information for the frame.
     * <p>
     * 
     * 
     * @param participants
     *     The participants
     */
    public void setParticipants(Map<String, ParticipantFrame> participants) {
        this.participants = participants;
    }

    /**
     * Represents how many milliseconds into the game the frame occurred.
     * <p>
     * 
     * 
     * @return
     *     The timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Represents how many milliseconds into the game the frame occurred.
     * <p>
     * 
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public java.lang.String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(events).append(participants).append(timestamp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Frame) == false) {
            return false;
        }
        Frame rhs = ((Frame) other);
        return new EqualsBuilder().append(events, rhs.events).append(participants, rhs.participants).append(timestamp, rhs.timestamp).isEquals();
    }

}
