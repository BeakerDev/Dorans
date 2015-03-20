package gg.buff.dorans.objects.generated.lol_static;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Mastery
 * <p>
 * This object contains mastery data
 */
@Generated("org.jsonschema2pojo")
public class Mastery {

	@Expose
	private List<String> description = new ArrayList<String>();
	@Expose
	private int id;
	@Expose
	private Mastery.MasteryTree masteryTree;
	@Expose
	private String name;
	@Expose
	private String prereq;
	@Expose
	private int ranks;
	@Expose
	private List<String> sanatizedDescription = new ArrayList<String>();

	/**
	 * @return The description
	 */
	public List<String> getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            The description
	 */
	public void setDescription(List<String> description) {
		this.description = description;
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
	 * @return The masteryTree
	 */
	public Mastery.MasteryTree getMasteryTree() {
		return masteryTree;
	}

	/**
	 * @param masteryTree
	 *            The masteryTree
	 */
	public void setMasteryTree(Mastery.MasteryTree masteryTree) {
		this.masteryTree = masteryTree;
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
	 * @return The prereq
	 */
	public String getPrereq() {
		return prereq;
	}

	/**
	 * @param prereq
	 *            The prereq
	 */
	public void setPrereq(String prereq) {
		this.prereq = prereq;
	}

	/**
	 * @return The ranks
	 */
	public int getRanks() {
		return ranks;
	}

	/**
	 * @param ranks
	 *            The ranks
	 */
	public void setRanks(int ranks) {
		this.ranks = ranks;
	}

	/**
	 * @return The sanatizedDescription
	 */
	public List<String> getSanatizedDescription() {
		return sanatizedDescription;
	}

	/**
	 * @param sanatizedDescription
	 *            The sanatizedDescription
	 */
	public void setSanatizedDescription(List<String> sanatizedDescription) {
		this.sanatizedDescription = sanatizedDescription;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(description).append(id).append(masteryTree).append(name).append(prereq).append(ranks).append(sanatizedDescription).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Mastery) == false) {
			return false;
		}
		Mastery rhs = ((Mastery) other);
		return new EqualsBuilder().append(description, rhs.description).append(id, rhs.id).append(masteryTree, rhs.masteryTree).append(name, rhs.name).append(prereq, rhs.prereq).append(ranks, rhs.ranks).append(sanatizedDescription, rhs.sanatizedDescription).isEquals();
	}

	@Generated("org.jsonschema2pojo")
	public static enum MasteryTree {

		@SerializedName("Defense")
		DEFENSE("Defense"), @SerializedName("Offense")
		OFFENSE("Offense"), @SerializedName("Utility")
		UTILITY("Utility");
		private final String value;
		private static Map<String, Mastery.MasteryTree> constants = new HashMap<String, Mastery.MasteryTree>();

		static {
			for (Mastery.MasteryTree c : values()) {
				constants.put(c.value, c);
			}
		}

		private MasteryTree(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static Mastery.MasteryTree fromValue(String value) {
			Mastery.MasteryTree constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

}
