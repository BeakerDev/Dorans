package gg.buff.dorans.objects.generated.lol_static;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Recommended
 * <p>
 * This object contains champion recommended data
 */
@Generated("org.jsonschema2pojo")
public class Recommended {

	@Expose
	private List<Block> blocks = new ArrayList<Block>();
	@Expose
	private String champion;
	@Expose
	private String map;
	@Expose
	private String mode;
	@Expose
	private boolean priority;
	@Expose
	private String title;
	@Expose
	private String type;

	/**
	 * @return The blocks
	 */
	public List<Block> getBlocks() {
		return blocks;
	}

	/**
	 * @param blocks
	 *            The blocks
	 */
	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}

	/**
	 * @return The champion
	 */
	public String getChampion() {
		return champion;
	}

	/**
	 * @param champion
	 *            The champion
	 */
	public void setChampion(String champion) {
		this.champion = champion;
	}

	/**
	 * @return The map
	 */
	public String getMap() {
		return map;
	}

	/**
	 * @param map
	 *            The map
	 */
	public void setMap(String map) {
		this.map = map;
	}

	/**
	 * @return The mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @param mode
	 *            The mode
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @return The priority
	 */
	public boolean isPriority() {
		return priority;
	}

	/**
	 * @param priority
	 *            The priority
	 */
	public void setPriority(boolean priority) {
		this.priority = priority;
	}

	/**
	 * @return The title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            The title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return The type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            The type
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(blocks).append(champion).append(map).append(mode).append(priority).append(title).append(type).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Recommended) == false) {
			return false;
		}
		Recommended rhs = ((Recommended) other);
		return new EqualsBuilder().append(blocks, rhs.blocks).append(champion, rhs.champion).append(map, rhs.map).append(mode, rhs.mode).append(priority, rhs.priority).append(title, rhs.title).append(type, rhs.type).isEquals();
	}

}
