package gg.buff.dorans.query.params;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

public class StaticMasteryParams extends Params {
	/**
	 * Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale
	 * for the region is used.
	 *
	 * @param locale as a {@link java.lang.String}
	 * @return this
	 */
	public StaticMasteryParams setLocale(String locale) {
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
	public StaticMasteryParams setVersion(String version) {
		getParams().put("version", version);
		return this;
	}

	public String getVersion() {
		return getParams().get("version");
	}

	/**
	 * Tags to return additional data. Only type, version, data, id, name, and description
	 * are returned by default if this parameter isn't specified. To return all additional
	 * data, use the tag 'all'.
	 *
	 * @param masteryListData {@link gg.buff.dorans.query.params.StaticMasteryParams.MasteryListData}
	 * @return this
	 */
	public StaticMasteryParams setMasteryListData(MasteryListData... masteryListData) {
		if (masteryListData == null) {
			getParams().remove("masteryListData");
		} else if (masteryListData.length > 1) {
			getParams().put("masteryListData", Joiner.on(",").join(convertToStringList(masteryListData)));
		} else {
			getParams().put("masteryListData", masteryListData[0].toString().toLowerCase());
		}
		return this;
	}

	private List<String> convertToStringList(MasteryListData[] itemListData) {
		List<String> result = new ArrayList<>();
		for (MasteryListData o : itemListData) {
			if (o != null) {
				result.add(o.getValue());
			}
		}
		return result;
	}

	public enum MasteryListData {
		ALL("all"),
		IMAGE("image"),
		MASTERY_TREE("masteryTree"),
		PREREQ("prereq"),
		RANKS("ranks"),
		SANITIZED_DESCRIPTION("sanitizedDescription"),
		TREE("tree");

		private final String value;

		MasteryListData(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}
}
