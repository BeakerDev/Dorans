package gg.buff.dorans.query.params;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

public class StaticSummonerSpellsParams extends Params {
	/**
	 * Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale
	 * for the region is used.
	 *
	 * @param locale as a {@link String}
	 * @return this
	 */
	public StaticSummonerSpellsParams setLocale(String locale) {
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
	public StaticSummonerSpellsParams setVersion(String version) {
		getParams().put("version", version);
		return this;
	}

	public String getVersion() {
		return getParams().get("version");
	}

	/**
	 * If specified as true, the returned data map will use the spells' IDs as the keys.
	 * If not specified or specified as false, the returned data map will use the spells'
	 * keys instead.
	 *
	 * @param dataByID as a {@link java.lang.Boolean}
	 * @return this
	 */
	public StaticSummonerSpellsParams setDataByID(boolean dataByID) {
		getParams().put("dataById", Boolean.toString(dataByID).toLowerCase());
		return this;
	}

	public boolean getDataById() {
		return getParams().get("dataById").equals("true");
	}

	/**
	 * Tags to return additional data. Only type, version, data, id, key, name, description,
	 * and summonerLevel are returned by default if this parameter isn't specified. To return
	 * all additional data, use the tag 'all'.
	 *
	 * @param spellData {@link StaticSummonerSpellsParams.SpellData}
	 * @return this
	 */
	public StaticSummonerSpellsParams setSpellData(SpellData... spellData) {
		if (spellData == null) {
			getParams().remove("spellData");
		} else if (spellData.length > 1) {
			getParams().put("spellData", Joiner.on(",").join(convertToStringList(spellData)));
		} else {
			getParams().put("spellData", spellData[0].toString().toLowerCase());
		}
		return this;
	}

	private List<String> convertToStringList(SpellData[] itemListData) {
		List<String> result = new ArrayList<>();
		for (SpellData o : itemListData) {
			if (o != null) {
				result.add(o.getValue());
			}
		}
		return result;
	}

	public enum SpellData {
		ALL("all"),
		COOLDOWN("cooldown"),
		COOLDOWN_BURN("cooldownBurn"),
		COST("cost"),
		COST_BURN("costBurn"),
		COST_TYPE("costType"),
		EFFECT("effect"),
		EFFECT_BURN("effectBurn"),
		IMAGE("image"),
		KEY("key"),
		LEVEL_TIP("leveltip"),
		MAX_RANK("maxrank"),
		MODES("modes"),
		RANGE("range"),
		RANGE_BURN("rangeBurn"),
		RESOURCE("resource"),
		SANITIZED_DESCRIPTION("sanitizedDescription"),
		SANITIZED_TOOLTIP("sanitizedTooltip"),
		TOOLTIP("tooltip"),
		VARS("vars");

		private final String value;

		SpellData(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}
}
