package gg.buff.dorans.objects.generated.lol_static;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Realm
 * <p>
 * This object contains meta data
 */
@Generated("org.jsonschema2pojo")
public class Realm {

	/**
	 * The base CDN url
	 * <p>
	 */
	@Expose
	private String cdn;
	/**
	 * Latest changed version of Dragon Magic's css file
	 * <p>
	 */
	@Expose
	private String css;
	/**
	 * Latest changed version of Dragon Magic
	 * <p>
	 */
	@Expose
	private String dd;
	/**
	 * Default language for this realm
	 * <p>
	 */
	@Expose
	private String l;
	/**
	 * Legacy script mode for IE6 or older
	 * <p>
	 */
	@Expose
	private String lg;
	/**
	 * Latest changed version for each data type listed
	 * <p>
	 */
	@Expose
	private Map n;
	/**
	 * Special behavior number identifying the largest profileicon id that can
	 * be used under 500. Any profileicon that is requested between this number
	 * and 500 should be mapped to 0.
	 * <p>
	 */
	@Expose
	private int profileiconmax;
	/**
	 * Additional api data drawn from other sources that may be related to data
	 * dragon functionality
	 * <p>
	 */
	@Expose
	private String store;
	/**
	 * Current version of this file for this realm
	 * <p>
	 */
	@Expose
	private String v;

	/**
	 * The base CDN url
	 * <p>
	 * 
	 * @return The cdn
	 */
	public String getCdn() {
		return cdn;
	}

	/**
	 * The base CDN url
	 * <p>
	 * 
	 * @param cdn
	 *            The cdn
	 */
	public void setCdn(String cdn) {
		this.cdn = cdn;
	}

	/**
	 * Latest changed version of Dragon Magic's css file
	 * <p>
	 * 
	 * @return The css
	 */
	public String getCss() {
		return css;
	}

	/**
	 * Latest changed version of Dragon Magic's css file
	 * <p>
	 * 
	 * @param css
	 *            The css
	 */
	public void setCss(String css) {
		this.css = css;
	}

	/**
	 * Latest changed version of Dragon Magic
	 * <p>
	 * 
	 * @return The dd
	 */
	public String getDd() {
		return dd;
	}

	/**
	 * Latest changed version of Dragon Magic
	 * <p>
	 * 
	 * @param dd
	 *            The dd
	 */
	public void setDd(String dd) {
		this.dd = dd;
	}

	/**
	 * Default language for this realm
	 * <p>
	 * 
	 * @return The l
	 */
	public String getL() {
		return l;
	}

	/**
	 * Default language for this realm
	 * <p>
	 * 
	 * @param l
	 *            The l
	 */
	public void setL(String l) {
		this.l = l;
	}

	/**
	 * Legacy script mode for IE6 or older
	 * <p>
	 * 
	 * @return The lg
	 */
	public String getLg() {
		return lg;
	}

	/**
	 * Legacy script mode for IE6 or older
	 * <p>
	 * 
	 * @param lg
	 *            The lg
	 */
	public void setLg(String lg) {
		this.lg = lg;
	}

	/**
	 * Latest changed version for each data type listed
	 * <p>
	 * 
	 * @return The n
	 */
	public Map getN() {
		return n;
	}

	/**
	 * Latest changed version for each data type listed
	 * <p>
	 * 
	 * @param n
	 *            The n
	 */
	public void setN(Map n) {
		this.n = n;
	}

	/**
	 * Special behavior number identifying the largest profileicon id that can
	 * be used under 500. Any profileicon that is requested between this number
	 * and 500 should be mapped to 0.
	 * <p>
	 * 
	 * @return The profileiconmax
	 */
	public int getProfileiconmax() {
		return profileiconmax;
	}

	/**
	 * Special behavior number identifying the largest profileicon id that can
	 * be used under 500. Any profileicon that is requested between this number
	 * and 500 should be mapped to 0.
	 * <p>
	 * 
	 * @param profileiconmax
	 *            The profileiconmax
	 */
	public void setProfileiconmax(int profileiconmax) {
		this.profileiconmax = profileiconmax;
	}

	/**
	 * Additional api data drawn from other sources that may be related to data
	 * dragon functionality
	 * <p>
	 * 
	 * @return The store
	 */
	public String getStore() {
		return store;
	}

	/**
	 * Additional api data drawn from other sources that may be related to data
	 * dragon functionality
	 * <p>
	 * 
	 * @param store
	 *            The store
	 */
	public void setStore(String store) {
		this.store = store;
	}

	/**
	 * Current version of this file for this realm
	 * <p>
	 * 
	 * @return The v
	 */
	public String getV() {
		return v;
	}

	/**
	 * Current version of this file for this realm
	 * <p>
	 * 
	 * @param v
	 *            The v
	 */
	public void setV(String v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(cdn).append(css).append(dd).append(l).append(lg).append(n).append(profileiconmax).append(store).append(v).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Realm) == false) {
			return false;
		}
		Realm rhs = ((Realm) other);
		return new EqualsBuilder().append(cdn, rhs.cdn).append(css, rhs.css).append(dd, rhs.dd).append(l, rhs.l).append(lg, rhs.lg).append(n, rhs.n).append(profileiconmax, rhs.profileiconmax).append(store, rhs.store).append(v, rhs.v).isEquals();
	}

}
