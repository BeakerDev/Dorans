package gg.buff.dorans.objects.match;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * ParticipantTimelineData
 * <p>
 * The object contains timeline data
 */
@Generated("org.jsonschema2pojo")
public class ParticipantTimelineData {

	@Expose
	private Object tenToTwenty;

	/**
	 * @return The tenToTwenty
	 */
	public Object getTenToTwenty() {
		return tenToTwenty;
	}

	/**
	 * @param tenToTwenty
	 *            The tenToTwenty
	 */
	public void setTenToTwenty(Object tenToTwenty) {
		this.tenToTwenty = tenToTwenty;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(tenToTwenty).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ParticipantTimelineData) == false) {
			return false;
		}
		ParticipantTimelineData rhs = ((ParticipantTimelineData) other);
		return new EqualsBuilder().append(tenToTwenty, rhs.tenToTwenty).isEquals();
	}

}
