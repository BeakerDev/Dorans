package gg.buff.dorans.objects.generated.generated.match;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Player
 * <p>
 * This object contains match player information
 */
@Generated("org.jsonschema2pojo")
public class Player {

	/**
	 * Match history URI
	 * <p>
	 */
	@Expose
	private String matchHistoryUri;
	/**
	 * Profile icon ID
	 * <p>
	 */
	@Expose
	private int profileIcon;
	/**
	 * Summoner ID
	 * <p>
	 */
	@Expose
	private long summonerId;
	/**
	 * Summoner name
	 * <p>
	 */
	@Expose
	private String summonerName;

	/**
	 * Match history URI
	 * <p>
	 * 
	 * @return The matchHistoryUri
	 */
	public String getMatchHistoryUri() {
		return matchHistoryUri;
	}

	/**
	 * Match history URI
	 * <p>
	 * 
	 * @param matchHistoryUri
	 *            The matchHistoryUri
	 */
	public void setMatchHistoryUri(String matchHistoryUri) {
		this.matchHistoryUri = matchHistoryUri;
	}

	/**
	 * Profile icon ID
	 * <p>
	 * 
	 * @return The profileIcon
	 */
	public int getProfileIcon() {
		return profileIcon;
	}

	/**
	 * Profile icon ID
	 * <p>
	 * 
	 * @param profileIcon
	 *            The profileIcon
	 */
	public void setProfileIcon(int profileIcon) {
		this.profileIcon = profileIcon;
	}

	/**
	 * Summoner ID
	 * <p>
	 * 
	 * @return The summonerId
	 */
	public long getSummonerId() {
		return summonerId;
	}

	/**
	 * Summoner ID
	 * <p>
	 * 
	 * @param summonerId
	 *            The summonerId
	 */
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}

	/**
	 * Summoner name
	 * <p>
	 * 
	 * @return The summonerName
	 */
	public String getSummonerName() {
		return summonerName;
	}

	/**
	 * Summoner name
	 * <p>
	 * 
	 * @param summonerName
	 *            The summonerName
	 */
	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(matchHistoryUri).append(profileIcon).append(summonerId).append(summonerName).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Player) == false) {
			return false;
		}
		Player rhs = ((Player) other);
		return new EqualsBuilder().append(matchHistoryUri, rhs.matchHistoryUri).append(profileIcon, rhs.profileIcon).append(summonerId, rhs.summonerId).append(summonerName, rhs.summonerName).isEquals();
	}

}
