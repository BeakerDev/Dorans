package gg.buff.dorans.objects.generated.match_history;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * MatchSummary
 * <p>
 * This object contains player match history information
 */
@Generated("org.jsonschema2pojo")
public class PlayerHistory {

	/**
	 * List of matches for the player
	 * <p>
	 */
	@Expose
	private List<MatchSummary> matches = new ArrayList<MatchSummary>();

	/**
	 * List of matches for the player
	 * <p>
	 * 
	 * @return The matches
	 */
	public List<MatchSummary> getMatches() {
		return matches;
	}

	/**
	 * List of matches for the player
	 * <p>
	 * 
	 * @param matches
	 *            The matches
	 */
	public void setMatches(List<MatchSummary> matches) {
		this.matches = matches;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(matches).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof PlayerHistory) == false) {
			return false;
		}
		PlayerHistory rhs = ((PlayerHistory) other);
		return new EqualsBuilder().append(matches, rhs.matches).isEquals();
	}

}
