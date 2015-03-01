package gg.buff.dorans.objects.summoner;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * summoner
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class Summoner {

	@Expose
	private long id;
	/**
	 * Summoner Name
	 * <p>
	 */
	@Expose
	private String name;
	/**
	 * ID of the summoner icon associated with the summoner.
	 * <p>
	 */
	@Expose
	private int profileIconId;
	@Expose
	private long revisionDate;
	@Expose
	private long summonerLevel;

	/**
	 * @return The id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            The id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Summoner Name
	 * <p>
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Summoner Name
	 * <p>
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ID of the summoner icon associated with the summoner.
	 * <p>
	 * 
	 * @return The profileIconId
	 */
	public int getProfileIconId() {
		return profileIconId;
	}

	/**
	 * ID of the summoner icon associated with the summoner.
	 * <p>
	 * 
	 * @param profileIconId
	 *            The profileIconId
	 */
	public void setProfileIconId(int profileIconId) {
		this.profileIconId = profileIconId;
	}

	/**
	 * @return The revisionDate
	 */
	public long getRevisionDate() {
		return revisionDate;
	}

	/**
	 * @param revisionDate
	 *            The revisionDate
	 */
	public void setRevisionDate(long revisionDate) {
		this.revisionDate = revisionDate;
	}

	/**
	 * @return The summonerLevel
	 */
	public long getSummonerLevel() {
		return summonerLevel;
	}

	/**
	 * @param summonerLevel
	 *            The summonerLevel
	 */
	public void setSummonerLevel(long summonerLevel) {
		this.summonerLevel = summonerLevel;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(name).append(profileIconId).append(revisionDate).append(summonerLevel).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Summoner) == false) {
			return false;
		}
		Summoner rhs = ((Summoner) other);
		return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(profileIconId, rhs.profileIconId).append(revisionDate, rhs.revisionDate).append(summonerLevel, rhs.summonerLevel).isEquals();
	}

}
