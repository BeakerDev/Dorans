package gg.buff.dorans.objects.generated.lol_static;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * BasicData
 * <p>
 * This object contains basic data
 */
@Generated("org.jsonschema2pojo")
public class BasicData {

	@Expose
	private java.lang.String colloq;
	@Expose
	private boolean consumeOnFull;
	@Expose
	private boolean consumed;
	@Expose
	private int depth;
	@Expose
	private java.lang.String description;
	@Expose
	private Object from;
	/**
	 * Gold
	 * <p>
	 * This object contains item gold data
	 */
	@Expose
	private Gold gold;
	@Expose
	private java.lang.String group;
	@Expose
	private boolean hideFromAll;
	@Expose
	private int id;
	/**
	 * Image
	 * <p>
	 * This object contains spell vars data
	 */
	@Expose
	private Image image;
	@Expose
	private boolean inStore;
	@Expose
	private List<java.lang.String> into = new ArrayList<java.lang.String>();
	@Expose
	private Map<String, Boolean> maps;
	@Expose
	private java.lang.String name;
	@Expose
	private java.lang.String plaintext;
	@Expose
	private java.lang.String requiredChampion;
	/**
	 * MetaData
	 * <p>
	 * This object contains meta data
	 */
	@Expose
	private MetaData rune;
	@Expose
	private java.lang.String sanitizedDescription;
	@Expose
	private int specialRecipe;
	@Expose
	private int stacks;
	/**
	 * BasicDataStats
	 * <p>
	 * This object contains basic data stats
	 */
	@Expose
	private BasicDataStats stats;
	@Expose
	private List<java.lang.String> tags = new ArrayList<java.lang.String>();

	/**
	 * @return The colloq
	 */
	public java.lang.String getColloq() {
		return colloq;
	}

	/**
	 * @param colloq
	 *            The colloq
	 */
	public void setColloq(java.lang.String colloq) {
		this.colloq = colloq;
	}

	/**
	 * @return The consumeOnFull
	 */
	public boolean isConsumeOnFull() {
		return consumeOnFull;
	}

	/**
	 * @param consumeOnFull
	 *            The consumeOnFull
	 */
	public void setConsumeOnFull(boolean consumeOnFull) {
		this.consumeOnFull = consumeOnFull;
	}

	/**
	 * @return The consumed
	 */
	public boolean isConsumed() {
		return consumed;
	}

	/**
	 * @param consumed
	 *            The consumed
	 */
	public void setConsumed(boolean consumed) {
		this.consumed = consumed;
	}

	/**
	 * @return The depth
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * @param depth
	 *            The depth
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}

	/**
	 * @return The description
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            The description
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**
	 * @return The from
	 */
	public Object getFrom() {
		return from;
	}

	/**
	 * @param from
	 *            The from
	 */
	public void setFrom(Object from) {
		this.from = from;
	}

	/**
	 * Gold
	 * <p>
	 * This object contains item gold data
	 * 
	 * @return The gold
	 */
	public Gold getGold() {
		return gold;
	}

	/**
	 * Gold
	 * <p>
	 * This object contains item gold data
	 * 
	 * @param gold
	 *            The gold
	 */
	public void setGold(Gold gold) {
		this.gold = gold;
	}

	/**
	 * @return The group
	 */
	public java.lang.String getGroup() {
		return group;
	}

	/**
	 * @param group
	 *            The group
	 */
	public void setGroup(java.lang.String group) {
		this.group = group;
	}

	/**
	 * @return The hideFromAll
	 */
	public boolean isHideFromAll() {
		return hideFromAll;
	}

	/**
	 * @param hideFromAll
	 *            The hideFromAll
	 */
	public void setHideFromAll(boolean hideFromAll) {
		this.hideFromAll = hideFromAll;
	}

	/**
	 * @return The id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            The id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Image
	 * <p>
	 * This object contains spell vars data
	 * 
	 * @return The image
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * Image
	 * <p>
	 * This object contains spell vars data
	 * 
	 * @param image
	 *            The image
	 */
	public void setImage(Image image) {
		this.image = image;
	}

	/**
	 * @return The inStore
	 */
	public boolean isInStore() {
		return inStore;
	}

	/**
	 * @param inStore
	 *            The inStore
	 */
	public void setInStore(boolean inStore) {
		this.inStore = inStore;
	}

	/**
	 * @return The into
	 */
	public List<java.lang.String> getInto() {
		return into;
	}

	/**
	 * @param into
	 *            The into
	 */
	public void setInto(List<java.lang.String> into) {
		this.into = into;
	}

	/**
	 * @return The maps
	 */
	public Map<String, Boolean> getMaps() {
		return maps;
	}

	/**
	 * @param maps
	 *            The maps
	 */
	public void setMaps(Map<String, Boolean> maps) {
		this.maps = maps;
	}

	/**
	 * @return The name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * @param name
	 *            The name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * @return The plaintext
	 */
	public java.lang.String getPlaintext() {
		return plaintext;
	}

	/**
	 * @param plaintext
	 *            The plaintext
	 */
	public void setPlaintext(java.lang.String plaintext) {
		this.plaintext = plaintext;
	}

	/**
	 * @return The requiredChampion
	 */
	public java.lang.String getRequiredChampion() {
		return requiredChampion;
	}

	/**
	 * @param requiredChampion
	 *            The requiredChampion
	 */
	public void setRequiredChampion(java.lang.String requiredChampion) {
		this.requiredChampion = requiredChampion;
	}

	/**
	 * MetaData
	 * <p>
	 * This object contains meta data
	 * 
	 * @return The rune
	 */
	public MetaData getRune() {
		return rune;
	}

	/**
	 * MetaData
	 * <p>
	 * This object contains meta data
	 * 
	 * @param rune
	 *            The rune
	 */
	public void setRune(MetaData rune) {
		this.rune = rune;
	}

	/**
	 * @return The sanitizedDescription
	 */
	public java.lang.String getSanitizedDescription() {
		return sanitizedDescription;
	}

	/**
	 * @param sanitizedDescription
	 *            The sanitizedDescription
	 */
	public void setSanitizedDescription(java.lang.String sanitizedDescription) {
		this.sanitizedDescription = sanitizedDescription;
	}

	/**
	 * @return The specialRecipe
	 */
	public int getSpecialRecipe() {
		return specialRecipe;
	}

	/**
	 * @param specialRecipe
	 *            The specialRecipe
	 */
	public void setSpecialRecipe(int specialRecipe) {
		this.specialRecipe = specialRecipe;
	}

	/**
	 * @return The stacks
	 */
	public int getStacks() {
		return stacks;
	}

	/**
	 * @param stacks
	 *            The stacks
	 */
	public void setStacks(int stacks) {
		this.stacks = stacks;
	}

	/**
	 * BasicDataStats
	 * <p>
	 * This object contains basic data stats
	 * 
	 * @return The stats
	 */
	public BasicDataStats getStats() {
		return stats;
	}

	/**
	 * BasicDataStats
	 * <p>
	 * This object contains basic data stats
	 * 
	 * @param stats
	 *            The stats
	 */
	public void setStats(BasicDataStats stats) {
		this.stats = stats;
	}

	/**
	 * @return The tags
	 */
	public List<java.lang.String> getTags() {
		return tags;
	}

	/**
	 * @param tags
	 *            The tags
	 */
	public void setTags(List<java.lang.String> tags) {
		this.tags = tags;
	}

	@Override
	public java.lang.String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(colloq).append(consumeOnFull).append(consumed).append(depth).append(description).append(from).append(gold).append(group).append(hideFromAll).append(id).append(image).append(inStore).append(into).append(maps).append(name).append(plaintext).append(requiredChampion).append(rune).append(sanitizedDescription).append(specialRecipe).append(stacks).append(stats).append(tags).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof BasicData) == false) {
			return false;
		}
		BasicData rhs = ((BasicData) other);
		return new EqualsBuilder().append(colloq, rhs.colloq).append(consumeOnFull, rhs.consumeOnFull).append(consumed, rhs.consumed).append(depth, rhs.depth).append(description, rhs.description).append(from, rhs.from).append(gold, rhs.gold).append(group, rhs.group).append(hideFromAll, rhs.hideFromAll).append(id, rhs.id).append(image, rhs.image).append(inStore, rhs.inStore).append(into, rhs.into).append(maps, rhs.maps).append(name, rhs.name).append(plaintext, rhs.plaintext).append(requiredChampion, rhs.requiredChampion).append(rune, rhs.rune).append(sanitizedDescription, rhs.sanitizedDescription).append(specialRecipe, rhs.specialRecipe).append(stacks, rhs.stacks).append(stats, rhs.stats).append(tags, rhs.tags).isEquals();
	}

}
