package gg.buff.dorans.objects.generated.champion;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Champion
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class Champion {

	/**
	 * Champion ID. For static information correlating to champion IDs, please
	 * refer to the LoL Static Data API.
	 * <p>
	 */
	@Expose
	private long id;
	/**
	 * Indicates if the champion is active
	 * <p>
	 */
	@Expose
	private boolean active;
	/**
	 * Bot enabled flag (for custom games).
	 * <p>
	 */
	@Expose
	private boolean botEnabled;
	/**
	 * Bot Match Made enabled flag (for Co-op vs. AI games)
	 * <p>
	 */
	@Expose
	private boolean botMmEnabled;
	/**
	 * Indicates if the champion is free to play. Free to play champions are
	 * rotated periodically.
	 * <p>
	 */
	@Expose
	private boolean freeToPlay;
	/**
	 * Ranked play enabled flag.
	 * <p>
	 */
	@Expose
	private boolean rankedPlayEnabled;

	/**
	 * Champion ID. For static information correlating to champion IDs, please
	 * refer to the LoL Static Data API.
	 * <p>
	 * 
	 * @return The id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Champion ID. For static information correlating to champion IDs, please
	 * refer to the LoL Static Data API.
	 * <p>
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Indicates if the champion is active
	 * <p>
	 * 
	 * @return The active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * Indicates if the champion is active
	 * <p>
	 * 
	 * @param active
	 *            The active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * Bot enabled flag (for custom games).
	 * <p>
	 * 
	 * @return The botEnabled
	 */
	public boolean isBotEnabled() {
		return botEnabled;
	}

	/**
	 * Bot enabled flag (for custom games).
	 * <p>
	 * 
	 * @param botEnabled
	 *            The botEnabled
	 */
	public void setBotEnabled(boolean botEnabled) {
		this.botEnabled = botEnabled;
	}

	/**
	 * Bot Match Made enabled flag (for Co-op vs. AI games)
	 * <p>
	 * 
	 * @return The botMmEnabled
	 */
	public boolean isBotMmEnabled() {
		return botMmEnabled;
	}

	/**
	 * Bot Match Made enabled flag (for Co-op vs. AI games)
	 * <p>
	 * 
	 * @param botMmEnabled
	 *            The botMmEnabled
	 */
	public void setBotMmEnabled(boolean botMmEnabled) {
		this.botMmEnabled = botMmEnabled;
	}

	/**
	 * Indicates if the champion is free to play. Free to play champions are
	 * rotated periodically.
	 * <p>
	 * 
	 * @return The freeToPlay
	 */
	public boolean isFreeToPlay() {
		return freeToPlay;
	}

	/**
	 * Indicates if the champion is free to play. Free to play champions are
	 * rotated periodically.
	 * <p>
	 * 
	 * @param freeToPlay
	 *            The freeToPlay
	 */
	public void setFreeToPlay(boolean freeToPlay) {
		this.freeToPlay = freeToPlay;
	}

	/**
	 * Ranked play enabled flag.
	 * <p>
	 * 
	 * @return The rankedPlayEnabled
	 */
	public boolean isRankedPlayEnabled() {
		return rankedPlayEnabled;
	}

	/**
	 * Ranked play enabled flag.
	 * <p>
	 * 
	 * @param rankedPlayEnabled
	 *            The rankedPlayEnabled
	 */
	public void setRankedPlayEnabled(boolean rankedPlayEnabled) {
		this.rankedPlayEnabled = rankedPlayEnabled;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(active).append(botEnabled).append(botMmEnabled).append(freeToPlay).append(rankedPlayEnabled).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Champion) == false) {
			return false;
		}
		Champion rhs = ((Champion) other);
		return new EqualsBuilder().append(id, rhs.id).append(active, rhs.active).append(botEnabled, rhs.botEnabled).append(botMmEnabled, rhs.botMmEnabled).append(freeToPlay, rhs.freeToPlay).append(rankedPlayEnabled, rhs.rankedPlayEnabled).isEquals();
	}

}
