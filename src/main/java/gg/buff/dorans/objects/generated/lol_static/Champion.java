package gg.buff.dorans.objects.generated.lol_static;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Champion
 * <p>
 * This object contains champion data
 */
@Generated("org.jsonschema2pojo")
public class Champion {

	@Expose
	private List<String> allytips = new ArrayList<String>();
	@Expose
	private String blurb;
	@Expose
	private List<String> enemytips = new ArrayList<String>();
	@Expose
	private int id;
	/**
	 * Image
	 * <p>
	 * This object contains spell vars data
	 */
	@Expose
	private Image image;
	/**
	 * Info
	 * <p>
	 * This object contains champion info data
	 */
	@Expose
	private Info info;
	@Expose
	private String key;
	@Expose
	private String lore;
	@Expose
	private String name;
	@Expose
	private String partype;
	/**
	 * Passive
	 * <p>
	 * This object contains champion passive data
	 */
	@Expose
	private Passive passive;
	@Expose
	private List<Recommended> recommended = new ArrayList<Recommended>();
	@Expose
	private List<Skin> skins = new ArrayList<Skin>();
	@Expose
	private List<ChampionSpell> spells = new ArrayList<ChampionSpell>();
	/**
	 * Stats
	 * <p>
	 * This object contains champion stats data
	 */
	@Expose
	private Stats stats;
	@Expose
	private List<String> tags = new ArrayList<String>();
	@Expose
	private String title;

	/**
	 * @return The allytips
	 */
	public List<String> getAllytips() {
		return allytips;
	}

	/**
	 * @param allytips
	 *            The allytips
	 */
	public void setAllytips(List<String> allytips) {
		this.allytips = allytips;
	}

	/**
	 * @return The blurb
	 */
	public String getBlurb() {
		return blurb;
	}

	/**
	 * @param blurb
	 *            The blurb
	 */
	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}

	/**
	 * @return The enemytips
	 */
	public List<String> getEnemytips() {
		return enemytips;
	}

	/**
	 * @param enemytips
	 *            The enemytips
	 */
	public void setEnemytips(List<String> enemytips) {
		this.enemytips = enemytips;
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
	 * Info
	 * <p>
	 * This object contains champion info data
	 * 
	 * @return The info
	 */
	public Info getInfo() {
		return info;
	}

	/**
	 * Info
	 * <p>
	 * This object contains champion info data
	 * 
	 * @param info
	 *            The info
	 */
	public void setInfo(Info info) {
		this.info = info;
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
	 * @return The lore
	 */
	public String getLore() {
		return lore;
	}

	/**
	 * @param lore
	 *            The lore
	 */
	public void setLore(String lore) {
		this.lore = lore;
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
	 * @return The partype
	 */
	public String getPartype() {
		return partype;
	}

	/**
	 * @param partype
	 *            The partype
	 */
	public void setPartype(String partype) {
		this.partype = partype;
	}

	/**
	 * Passive
	 * <p>
	 * This object contains champion passive data
	 * 
	 * @return The passive
	 */
	public Passive getPassive() {
		return passive;
	}

	/**
	 * Passive
	 * <p>
	 * This object contains champion passive data
	 * 
	 * @param passive
	 *            The passive
	 */
	public void setPassive(Passive passive) {
		this.passive = passive;
	}

	/**
	 * @return The recommended
	 */
	public List<Recommended> getRecommended() {
		return recommended;
	}

	/**
	 * @param recommended
	 *            The recommended
	 */
	public void setRecommended(List<Recommended> recommended) {
		this.recommended = recommended;
	}

	/**
	 * @return The skins
	 */
	public List<Skin> getSkins() {
		return skins;
	}

	/**
	 * @param skins
	 *            The skins
	 */
	public void setSkins(List<Skin> skins) {
		this.skins = skins;
	}

	/**
	 * @return The spells
	 */
	public List<ChampionSpell> getSpells() {
		return spells;
	}

	/**
	 * @param spells
	 *            The spells
	 */
	public void setSpells(List<ChampionSpell> spells) {
		this.spells = spells;
	}

	/**
	 * Stats
	 * <p>
	 * This object contains champion stats data
	 * 
	 * @return The stats
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * Stats
	 * <p>
	 * This object contains champion stats data
	 * 
	 * @param stats
	 *            The stats
	 */
	public void setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * @return The tags
	 */
	public List<String> getTags() {
		return tags;
	}

	/**
	 * @param tags
	 *            The tags
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(allytips).append(blurb).append(enemytips).append(id).append(image).append(info).append(key).append(lore).append(name).append(partype).append(passive).append(recommended).append(skins).append(spells).append(stats).append(tags).append(title).toHashCode();
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
		return new EqualsBuilder().append(allytips, rhs.allytips).append(blurb, rhs.blurb).append(enemytips, rhs.enemytips).append(id, rhs.id).append(image, rhs.image).append(info, rhs.info).append(key, rhs.key).append(lore, rhs.lore).append(name, rhs.name).append(partype, rhs.partype).append(passive, rhs.passive).append(recommended, rhs.recommended).append(skins, rhs.skins).append(spells, rhs.spells).append(stats, rhs.stats).append(tags, rhs.tags).append(title, rhs.title).isEquals();
	}

}
