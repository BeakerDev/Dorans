package gg.buff.dorans.objects.generated.lol_static;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * SummonerSpell
 * <p>
 * This object contains summoner spell data
 */
@Generated("org.jsonschema2pojo")
public class SummonerSpell {

	@Expose
	private List<Double> cooldown = new ArrayList<Double>();
	@Expose
	private String cooldownBurn;
	@Expose
	private List<Integer> cost = new ArrayList<Integer>();
	@Expose
	private String costBurn;
	@Expose
	private int costType;
	@Expose
	private String description;
	/**
	 * This field is a List of List of Double
	 * <p>
	 */
	@Expose
	private List<List<Double>> effect = new ArrayList<List<Double>>();
	@Expose
	private List<String> effectBurn = new ArrayList<String>();
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
	private String key;
	/**
	 * LevelTip
	 * <p>
	 * This object contains champion level tip data
	 */
	@Expose
	private LevelTip levelTip;
	@Expose
	private int maxrank;
	@Expose
	private List<String> modes = new ArrayList<String>();
	@Expose
	private String name;
	/**
	 * This field is either a List of Integer or the String 'self' for spells
	 * that target one's own champion
	 * <p>
	 */
	@Expose
	private Range range;
	@Expose
	private String rangeBurn;
	@Expose
	private String resource;
	@Expose
	private String sanitizedDescription;
	@Expose
	private String sanitizedTooltip;
	@Expose
	private int summonerLevel;
	@Expose
	private String tooltip;
	@Expose
	private List<SpellVars> vars = new ArrayList<SpellVars>();

	/**
	 * @return The cooldown
	 */
	public List<Double> getCooldown() {
		return cooldown;
	}

	/**
	 * @param cooldown
	 *            The cooldown
	 */
	public void setCooldown(List<Double> cooldown) {
		this.cooldown = cooldown;
	}

	/**
	 * @return The cooldownBurn
	 */
	public String getCooldownBurn() {
		return cooldownBurn;
	}

	/**
	 * @param cooldownBurn
	 *            The cooldownBurn
	 */
	public void setCooldownBurn(String cooldownBurn) {
		this.cooldownBurn = cooldownBurn;
	}

	/**
	 * @return The cost
	 */
	public List<Integer> getCost() {
		return cost;
	}

	/**
	 * @param cost
	 *            The cost
	 */
	public void setCost(List<Integer> cost) {
		this.cost = cost;
	}

	/**
	 * @return The costBurn
	 */
	public String getCostBurn() {
		return costBurn;
	}

	/**
	 * @param costBurn
	 *            The costBurn
	 */
	public void setCostBurn(String costBurn) {
		this.costBurn = costBurn;
	}

	/**
	 * @return The costType
	 */
	public int getCostType() {
		return costType;
	}

	/**
	 * @param costType
	 *            The costType
	 */
	public void setCostType(int costType) {
		this.costType = costType;
	}

	/**
	 * @return The description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            The description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This field is a List of List of Double
	 * <p>
	 * 
	 * @return The effect
	 */
	public List<List<Double>> getEffect() {
		return effect;
	}

	/**
	 * This field is a List of List of Double
	 * <p>
	 * 
	 * @param effect
	 *            The effect
	 */
	public void setEffect(List<List<Double>> effect) {
		this.effect = effect;
	}

	/**
	 * @return The effectBurn
	 */
	public List<String> getEffectBurn() {
		return effectBurn;
	}

	/**
	 * @param effectBurn
	 *            The effectBurn
	 */
	public void setEffectBurn(List<String> effectBurn) {
		this.effectBurn = effectBurn;
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
	 * @return The key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key
	 *            The key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * LevelTip
	 * <p>
	 * This object contains champion level tip data
	 * 
	 * @return The levelTip
	 */
	public LevelTip getLevelTip() {
		return levelTip;
	}

	/**
	 * LevelTip
	 * <p>
	 * This object contains champion level tip data
	 * 
	 * @param levelTip
	 *            The levelTip
	 */
	public void setLevelTip(LevelTip levelTip) {
		this.levelTip = levelTip;
	}

	/**
	 * @return The maxrank
	 */
	public int getMaxrank() {
		return maxrank;
	}

	/**
	 * @param maxrank
	 *            The maxrank
	 */
	public void setMaxrank(int maxrank) {
		this.maxrank = maxrank;
	}

	/**
	 * @return The modes
	 */
	public List<String> getModes() {
		return modes;
	}

	/**
	 * @param modes
	 *            The modes
	 */
	public void setModes(List<String> modes) {
		this.modes = modes;
	}

	/**
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This field is either a List of Integer or the String 'self' for spells
	 * that target one's own champion
	 * <p>
	 * 
	 * @return The range
	 */
	public Range getRange() {
		return range;
	}

	/**
	 * This field is either a List of Integer or the String 'self' for spells
	 * that target one's own champion
	 * <p>
	 * 
	 * @param range
	 *            The range
	 */
	public void setRange(Range range) {
		this.range = range;
	}

	/**
	 * @return The rangeBurn
	 */
	public String getRangeBurn() {
		return rangeBurn;
	}

	/**
	 * @param rangeBurn
	 *            The rangeBurn
	 */
	public void setRangeBurn(String rangeBurn) {
		this.rangeBurn = rangeBurn;
	}

	/**
	 * @return The resource
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * @param resource
	 *            The resource
	 */
	public void setResource(String resource) {
		this.resource = resource;
	}

	/**
	 * @return The sanitizedDescription
	 */
	public String getSanitizedDescription() {
		return sanitizedDescription;
	}

	/**
	 * @param sanitizedDescription
	 *            The sanitizedDescription
	 */
	public void setSanitizedDescription(String sanitizedDescription) {
		this.sanitizedDescription = sanitizedDescription;
	}

	/**
	 * @return The sanitizedTooltip
	 */
	public String getSanitizedTooltip() {
		return sanitizedTooltip;
	}

	/**
	 * @param sanitizedTooltip
	 *            The sanitizedTooltip
	 */
	public void setSanitizedTooltip(String sanitizedTooltip) {
		this.sanitizedTooltip = sanitizedTooltip;
	}

	/**
	 * @return The summonerLevel
	 */
	public int getSummonerLevel() {
		return summonerLevel;
	}

	/**
	 * @param summonerLevel
	 *            The summonerLevel
	 */
	public void setSummonerLevel(int summonerLevel) {
		this.summonerLevel = summonerLevel;
	}

	/**
	 * @return The tooltip
	 */
	public String getTooltip() {
		return tooltip;
	}

	/**
	 * @param tooltip
	 *            The tooltip
	 */
	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	/**
	 * @return The vars
	 */
	public List<SpellVars> getVars() {
		return vars;
	}

	/**
	 * @param vars
	 *            The vars
	 */
	public void setVars(List<SpellVars> vars) {
		this.vars = vars;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(cooldown).append(cooldownBurn).append(cost).append(costBurn).append(costType).append(description).append(effect).append(effectBurn).append(id).append(image).append(key).append(levelTip).append(maxrank).append(modes).append(name).append(range).append(rangeBurn).append(resource).append(sanitizedDescription).append(sanitizedTooltip).append(summonerLevel).append(tooltip).append(vars).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof SummonerSpell) == false) {
			return false;
		}
		SummonerSpell rhs = ((SummonerSpell) other);
		return new EqualsBuilder().append(cooldown, rhs.cooldown).append(cooldownBurn, rhs.cooldownBurn).append(cost, rhs.cost).append(costBurn, rhs.costBurn).append(costType, rhs.costType).append(description, rhs.description).append(effect, rhs.effect).append(effectBurn, rhs.effectBurn).append(id, rhs.id).append(image, rhs.image).append(key, rhs.key).append(levelTip, rhs.levelTip).append(maxrank, rhs.maxrank).append(modes, rhs.modes).append(name, rhs.name).append(range, rhs.range).append(rangeBurn, rhs.rangeBurn).append(resource, rhs.resource).append(sanitizedDescription, rhs.sanitizedDescription).append(sanitizedTooltip, rhs.sanitizedTooltip).append(summonerLevel, rhs.summonerLevel).append(tooltip, rhs.tooltip).append(vars, rhs.vars).isEquals();
	}

}
