package gg.buff.dorans.query.params;

public class StaticLanguageStringsParams extends Params {
	/**
	 * Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale
	 * for the region is used.
	 *
	 * @param locale as a {@link java.lang.String}
	 * @return this
	 */
	public StaticLanguageStringsParams setLocale(String locale) {
		getParams().put("locale", locale);
		return this;
	}

	public String getLocale() {
		return getParams().get("locale");
	}

	/**
	 * Data dragon version for returned data. If not specified, the latest version for the
	 * region is used. List of valid versions can be obtained from the /versions endpoint.
	 *
	 * @param version as a {@link java.lang.String}
	 * @return this
	 */
	public StaticLanguageStringsParams setVersion(String version) {
		getParams().put("version", version);
		return this;
	}

	public String getVersion() {
		return getParams().get("version");
	}
}
