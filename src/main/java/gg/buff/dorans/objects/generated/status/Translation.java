package gg.buff.dorans.objects.generated.status;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Translation
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class Translation {

	@Expose
	private String content;
	@Expose
	private String locale;
	@SerializedName("updated_at")
	@Expose
	private String updatedAt;

	/**
	 * @return The content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            The content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return The locale
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * @param locale
	 *            The locale
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}

	/**
	 * @return The updatedAt
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * @param updatedAt
	 *            The updated_at
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(content).append(locale).append(updatedAt).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Translation) == false) {
			return false;
		}
		Translation rhs = ((Translation) other);
		return new EqualsBuilder().append(content, rhs.content).append(locale, rhs.locale).append(updatedAt, rhs.updatedAt).isEquals();
	}

}
