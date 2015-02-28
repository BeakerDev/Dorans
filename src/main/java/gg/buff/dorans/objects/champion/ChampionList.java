package gg.buff.dorans.objects.champion;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ChampionList {

	/**
	 * champions
	 * <p>
	 */
	@Expose
	private List<Champion> champions = new ArrayList<Champion>();

	/**
	 * champions
	 * <p>
	 * 
	 * @return The champions
	 */
	public List<Champion> getChampions() {
		return champions;
	}

	/**
	 * champions
	 * <p>
	 * 
	 * @param champions
	 *            The champions
	 */
	public void setChampions(List<Champion> champions) {
		this.champions = champions;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(champions).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ChampionList) == false) {
			return false;
		}
		ChampionList rhs = ((ChampionList) other);
		return new EqualsBuilder().append(champions, rhs.champions).isEquals();
	}

}
