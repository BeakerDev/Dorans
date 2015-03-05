package gg.buff.dorans.objects.generated.status;

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
 * Message
 * <p>
 */
@Generated("org.jsonschema2pojo")
public class Message {

	@Expose
	private String author;
	@Expose
	private String content;
	@SerializedName("created_at")
	@Expose
	private String createdAt;
	@Expose
	private long id;
	@Expose
	private Message.Severity severity;
	@Expose
	private List<Translation> translations = new ArrayList<Translation>();
	@SerializedName("updated_at")
	@Expose
	private String updatedAt;

	/**
	 * @return The author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            The author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

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
	 * @return The createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt
	 *            The created_at
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return The id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            The id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return The severity
	 */
	public Message.Severity getSeverity() {
		return severity;
	}

	/**
	 * @param severity
	 *            The severity
	 */
	public void setSeverity(Message.Severity severity) {
		this.severity = severity;
	}

	/**
	 * @return The translations
	 */
	public List<Translation> getTranslations() {
		return translations;
	}

	/**
	 * @param translations
	 *            The translations
	 */
	public void setTranslations(List<Translation> translations) {
		this.translations = translations;
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
		return new HashCodeBuilder().append(author).append(content).append(createdAt).append(id).append(severity).append(translations).append(updatedAt).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Message) == false) {
			return false;
		}
		Message rhs = ((Message) other);
		return new EqualsBuilder().append(author, rhs.author).append(content, rhs.content).append(createdAt, rhs.createdAt).append(id, rhs.id).append(severity, rhs.severity).append(translations, rhs.translations).append(updatedAt, rhs.updatedAt).isEquals();
	}

	@Generated("org.jsonschema2pojo")
	public static enum Severity {

		@SerializedName("Info")
		INFO("Info"), @SerializedName("Alert")
		ALERT("Alert"), @SerializedName("Error")
		ERROR("Error");
		private final String value;
		private static Map<String, Message.Severity> constants = new HashMap<String, Message.Severity>();

		static {
			for (Message.Severity c : values()) {
				constants.put(c.value, c);
			}
		}

		private Severity(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public static Message.Severity fromValue(String value) {
			Message.Severity constant = constants.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

	}

}
