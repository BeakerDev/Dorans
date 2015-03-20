package gg.buff.dorans.objects.generated.lol_static;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Passive
 * <p>
 * This object contains champion passive data
 */
@Generated("org.jsonschema2pojo")
public class Passive {

	@Expose
	private String description;
	/**
	 * Image
	 * <p>
	 * This object contains spell vars data
	 */
	@Expose
	private Image image;
	@Expose
	private String name;
	@Expose
	private String sanitizedDescription;

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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(description).append(image).append(name).append(sanitizedDescription).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Passive) == false) {
			return false;
		}
		Passive rhs = ((Passive) other);
		return new EqualsBuilder().append(description, rhs.description).append(image, rhs.image).append(name, rhs.name).append(sanitizedDescription, rhs.sanitizedDescription).isEquals();
	}

}
