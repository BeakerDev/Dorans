package gg.buff.dorans.objects.generated.lol_static;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Info
 * <p>
 * This object contains champion info data
 */
@Generated("org.jsonschema2pojo")
public class Info {

	@Expose
	private int attack;
	@Expose
	private int defense;
	@Expose
	private int difficulty;
	@Expose
	private int magic;

	/**
	 * @return The attack
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * @param attack
	 *            The attack
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}

	/**
	 * @return The defense
	 */
	public int getDefense() {
		return defense;
	}

	/**
	 * @param defense
	 *            The defense
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}

	/**
	 * @return The difficulty
	 */
	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * @param difficulty
	 *            The difficulty
	 */
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	/**
	 * @return The magic
	 */
	public int getMagic() {
		return magic;
	}

	/**
	 * @param magic
	 *            The magic
	 */
	public void setMagic(int magic) {
		this.magic = magic;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(attack).append(defense).append(difficulty).append(magic).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Info) == false) {
			return false;
		}
		Info rhs = ((Info) other);
		return new EqualsBuilder().append(attack, rhs.attack).append(defense, rhs.defense).append(difficulty, rhs.difficulty).append(magic, rhs.magic).isEquals();
	}

}
