package gg.buff.dorans.query.params;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

public class StaticChampionQueryParams extends Params {
	/**
	 * Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale
	 * for the region is used.
	 *
	 * @param locale as a {@link java.lang.String}
	 * @return this
	 */
	public StaticChampionQueryParams setLocale(String locale) {
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
	public StaticChampionQueryParams setVersion(String version) {
		getParams().put("version", version);
		return this;
	}

	public String getVersion() {
		return getParams().get("version");
	}

	/**
	 * If specified as true, the returned data map will use the champions' IDs as the keys.
	 * If not specified or specified as false, the returned data map will use the champions'
	 * keys instead.
	 *
	 * @param dataByID as a {@link java.lang.Boolean}
	 * @return this
	 */
	public StaticChampionQueryParams setDataByID(boolean dataByID) {
		getParams().put("dataById", Boolean.toString(dataByID).toLowerCase());
		return this;
	}

	public boolean getDataById() {
		return getParams().get("dataById").equals("true");
	}

	/**
	 * Tags to return additional data. Only id, key, name, and title are returned by default if
	 * this parameter isn't specified. To return all additional data, use the tag 'all'.
	 *
	 * @param champData {@link gg.buff.dorans.query.params.StaticChampionQueryParams.ChampData}
	 * @return this
	 */
	public StaticChampionQueryParams setChampData(ChampData... champData) {
		if (champData == null) {
			getParams().remove("champData");
		} else if (champData.length > 1) {
			getParams().put("champData", Joiner.on(",").join(convertToStringList(champData)));
		} else {
			getParams().put("champData", champData[0].toString().toLowerCase());
		}
		return this;
	}

	private List<String> convertToStringList(ChampData[] champData) {
		List<String> result = new ArrayList<>();
		for (ChampData o : champData) {
			if (o != null) {
				result.add(o.getValue());
			}
		}
		return result;
	}

	public enum ChampData {
		ALL("all"),
		ALLY_TIPS("allytips"),
		ALT_IMAGES("altimages"),
		BLURB("blurb"),
		ENEMY_TIPS("enemytips"),
		IMAGE("image"),
		INFO("info"),
		LORE("lore"),
		PARTYPE("partype"),
		PASSIVE("passive"),
		RECOMMENDED("recommended"),
		SKINS("skins"),
		SPELLS("spells"),
		STATS("stats"),
		TAGS("tags");

		private final String value;

		ChampData(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}
}
