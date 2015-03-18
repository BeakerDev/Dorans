package gg.buff.dorans.objects.generated.lol_static;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * LevelTip
 * <p>
 * This object contains champion level tip data
 */
@Generated("org.jsonschema2pojo")
public class LevelTip {

	@Expose
	private List<String> effect = new ArrayList<String>();
	@Expose
	private List<String> label = new ArrayList<String>();

	/**
	 * @return The effect
	 */
	public List<String> getEffect() {
		return effect;
	}

	/**
	 * @param effect
	 *            The effect
	 */
	public void setEffect(List<String> effect) {
		this.effect = effect;
	}

	/**
	 * @return The label
	 */
	public List<String> getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            The label
	 */
	public void setLabel(List<String> label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(effect).append(label).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof LevelTip) == false) {
			return false;
		}
		LevelTip rhs = ((LevelTip) other);
		return new EqualsBuilder().append(effect, rhs.effect).append(label, rhs.label).isEquals();
	}

}
