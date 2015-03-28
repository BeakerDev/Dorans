package gg.buff.dorans.query.params;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

public class StaticRuneParams extends Params {
	/**
	 * Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale
	 * for the region is used.
	 *
	 * @param locale as a {@link String}
	 * @return this
	 */
	public StaticRuneParams setLocale(String locale) {
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
	 * @param version as a {@link String}
	 * @return this
	 */
	public StaticRuneParams setVersion(String version) {
		getParams().put("version", version);
		return this;
	}

	public String getVersion() {
		return getParams().get("version");
	}

	/**
	 * Tags to return additional data. Only type, version, data, id, name, rune, and description
	 * are returned by default if this parameter isn't specified. To return all additional data,
	 * use the tag 'all'.
	 *
	 * @param runeListData {@link StaticRuneParams.RuneListData}
	 * @return this
	 */
	public StaticRuneParams setRuneListData(RuneListData... runeListData) {
		if (runeListData == null) {
			getParams().remove("runeListData");
		} else if (runeListData.length > 1) {
			getParams().put("runeListData", Joiner.on(",").join(convertToStringList(runeListData)));
		} else {
			getParams().put("runeListData", runeListData[0].toString().toLowerCase());
		}
		return this;
	}

	private List<String> convertToStringList(RuneListData[] itemListData) {
		List<String> result = new ArrayList<>();
		for (RuneListData o : itemListData) {
			if (o != null) {
				result.add(o.getValue());
			}
		}
		return result;
	}

	public enum RuneListData {
		ALL("all"),
		BASIC("basic"),
		COLLOQ("colloq"),
		CONSUME_ON_FULL("consumeOnFull"),
		CONSUMED("consumed"),
		DEPTH("depth"),
		FROM("from"),
		GOLD("gold"),
		HIDE_FROM_ALL("hideFromAll"),
		IMAGE("image"),
		IN_STORE("inStore"),
		INTO("into"),
		MAPS("maps"),
		REQUIRED_CHAMPION("requiredChampion"),
		SANITIZED_DESCRIPTION("sanitizedDescription"),
		SPECIAL_RECIPE("specialRecipe"),
		STACKS("stacks"),
		STATS("stats"),
		TAGS("tags");

		private final String value;

		RuneListData(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}
}
