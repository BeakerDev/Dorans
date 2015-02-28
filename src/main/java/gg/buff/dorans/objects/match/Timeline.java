package gg.buff.dorans.objects.match;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Timeline
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class Timeline {

	/**
	 * Mastery rank
	 * <p>
	 */
	@Expose
	private long frameInterval;
	/**
	 * Mastery rank
	 * <p>
	 */
	@Expose
	private List<Frame> frames = new ArrayList<Frame>();

	/**
	 * Mastery rank
	 * <p>
	 * 
	 * @return The frameInterval
	 */
	public long getFrameInterval() {
		return frameInterval;
	}

	/**
	 * Mastery rank
	 * <p>
	 * 
	 * @param frameInterval
	 *            The frameInterval
	 */
	public void setFrameInterval(long frameInterval) {
		this.frameInterval = frameInterval;
	}

	/**
	 * Mastery rank
	 * <p>
	 * 
	 * @return The frames
	 */
	public List<Frame> getFrames() {
		return frames;
	}

	/**
	 * Mastery rank
	 * <p>
	 * 
	 * @param frames
	 *            The frames
	 */
	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(frameInterval).append(frames).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Timeline) == false) {
			return false;
		}
		Timeline rhs = ((Timeline) other);
		return new EqualsBuilder().append(frameInterval, rhs.frameInterval).append(frames, rhs.frames).isEquals();
	}

}
