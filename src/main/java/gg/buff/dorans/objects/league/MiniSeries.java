package gg.buff.dorans.objects.league;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * MiniSeries
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class MiniSeries {

	/**
	 * Number of wins required for promotion.
	 * <p>
	 */
	@Expose
	private int losses;
	/**
	 * String showing the current, sequential mini series progress where 'W'
	 * represents a win, 'L' represents a loss, and 'N' represents a game that
	 * hasn't been played yet.
	 * <p>
	 */
	@Expose
	private String progress;
	/**
	 * Number of current wins in the mini series.
	 * <p>
	 */
	@Expose
	private int wins;

	/**
	 * Number of wins required for promotion.
	 * <p>
	 * 
	 * @return The losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * Number of wins required for promotion.
	 * <p>
	 * 
	 * @param losses
	 *            The losses
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}

	/**
	 * String showing the current, sequential mini series progress where 'W'
	 * represents a win, 'L' represents a loss, and 'N' represents a game that
	 * hasn't been played yet.
	 * <p>
	 * 
	 * @return The progress
	 */
	public String getProgress() {
		return progress;
	}

	/**
	 * String showing the current, sequential mini series progress where 'W'
	 * represents a win, 'L' represents a loss, and 'N' represents a game that
	 * hasn't been played yet.
	 * <p>
	 * 
	 * @param progress
	 *            The progress
	 */
	public void setProgress(String progress) {
		this.progress = progress;
	}

	/**
	 * Number of current wins in the mini series.
	 * <p>
	 * 
	 * @return The wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * Number of current wins in the mini series.
	 * <p>
	 * 
	 * @param wins
	 *            The wins
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(losses).append(progress).append(wins).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof MiniSeries) == false) {
			return false;
		}
		MiniSeries rhs = ((MiniSeries) other);
		return new EqualsBuilder().append(losses, rhs.losses).append(progress, rhs.progress).append(wins, rhs.wins).isEquals();
	}

}
