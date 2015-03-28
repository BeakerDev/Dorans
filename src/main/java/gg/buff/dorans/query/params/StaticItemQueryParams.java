package gg.buff.dorans.query.params;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

public class StaticItemQueryParams extends Params {
	/**
	 * Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale
	 * for the region is used.
	 *
	 * @param locale as a {@link java.lang.String}
	 * @return this
	 */
	public StaticItemQueryParams setLocale(String locale) {
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
	public StaticItemQueryParams setVersion(String version) {
		getParams().put("version", version);
		return this;
	}

	/**
	 * Tags to return additional data. Only id, name, plaintext, group, and description
	 * are returned by default if this parameter isn't specified. To return all additional
	 * data, use the tag 'all'.
	 *
	 * @param itemListData {@link gg.buff.dorans.query.params.StaticItemQueryParams.ItemListData}
	 * @return this
	 */
	public StaticItemQueryParams setItemListData(ItemListData... itemListData) {
		if (itemListData == null) {
			getParams().remove("itemListData");
		} else if (itemListData.length > 1) {
			getParams().put("itemListData", Joiner.on(",").join(convertToStringList(itemListData)));
		} else {
			getParams().put("itemListData", itemListData[0].toString().toLowerCase());
		}
		return this;
	}

	public String getVersion() {
		return getParams().get("version");
	}

	private List<String> convertToStringList(ItemListData[] itemListData) {
		List<String> result = new ArrayList<>();
		for (ItemListData o : itemListData) {
			if (o != null) {
				result.add(o.getValue());
			}
		}
		return result;
	}

	public enum ItemListData {
		ALL("all"),
		COLLOQ("colloq"),
		CONSUME_ON_FULL("consumeOnFull"),
		CONSUMED("consumed"),
		DEPTH("depth"),
		FROM("from"),
		GOLD("gold"),
		GROUPS("groups"),
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
		TAGS("tags"),
		TREE("tree");

		private final String value;

		ItemListData(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}
}
