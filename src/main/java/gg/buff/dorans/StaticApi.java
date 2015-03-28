package gg.buff.dorans;

import com.google.gson.reflect.TypeToken;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.objects.generated.lol_static.Champion;
import gg.buff.dorans.objects.generated.lol_static.ChampionList;
import gg.buff.dorans.objects.generated.lol_static.Item;
import gg.buff.dorans.objects.generated.lol_static.ItemList;
import gg.buff.dorans.objects.generated.lol_static.LanguageStrings;
import gg.buff.dorans.objects.generated.lol_static.MapData;
import gg.buff.dorans.objects.generated.lol_static.Mastery;
import gg.buff.dorans.objects.generated.lol_static.MasteryList;
import gg.buff.dorans.objects.generated.lol_static.Realm;
import gg.buff.dorans.objects.generated.lol_static.Rune;
import gg.buff.dorans.objects.generated.lol_static.RuneList;
import gg.buff.dorans.objects.generated.lol_static.SummonerSpell;
import gg.buff.dorans.objects.generated.lol_static.SummonerSpellList;
import gg.buff.dorans.query.params.StaticChampionQueryParams;
import gg.buff.dorans.query.params.StaticItemQueryParams;
import gg.buff.dorans.query.params.StaticLanguageStringsParams;
import gg.buff.dorans.query.params.StaticMapParams;
import gg.buff.dorans.query.params.StaticMasteryParams;
import gg.buff.dorans.query.params.StaticRuneParams;
import gg.buff.dorans.query.params.StaticSummonerSpellsParams;

import java.lang.reflect.Type;
import java.util.List;

public class StaticApi extends CommonApi {
	private final Type typeListString = new TypeToken<List<String>>() {
	}.getType();

	protected StaticApi(Dorans parent) {
		super(parent, "v1.2");
	}

	/**
	 * Method to get the all the champions
	 *
	 * @param params optional parameters for the method {@link StaticChampionQueryParams}
	 * @return raw json list of all the champions
	 * @throws DoransException
	 */
	public String getChampionsRaw(StaticChampionQueryParams params) throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/champion").toString(), params.getParams());
	}

	/**
	 * Method to get the all the champions
	 *
	 * @param params optional parameters for the method {@link StaticChampionQueryParams}
	 * @return all of champions as a {@link ChampionList}
	 * @throws DoransException
	 */
	public ChampionList getChampions(StaticChampionQueryParams params) throws DoransException {
		return getParent().getGson().fromJson(getChampionsRaw(params), ChampionList.class);
	}

	/**
	 * Method to get the a champion
	 *
	 * @param championId id of the champion to retrieve
	 * @param params     optional parameters for the method {@link StaticChampionQueryParams}
	 * @return raw json champion object
	 * @throws DoransException
	 */
	public String getChampionRaw(int championId, StaticChampionQueryParams params) throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/champion/").append(championId).toString(), params.getParams());
	}

	/**
	 * Method to get the a champion
	 *
	 * @param championId id of the champion to retrieve
	 * @param params     optional parameters for the method {@link StaticChampionQueryParams}
	 * @return champion information as a {@link Champion}
	 * @throws DoransException
	 */
	public Champion getChampion(int championId, StaticChampionQueryParams params) throws DoransException {
		return getParent().getGson().fromJson(getChampionRaw(championId, params), Champion.class);
	}

	/**
	 * Methoid to get all the Items
	 *
	 * @param params optional parameters for the method {@link StaticItemQueryParams}
	 * @return raw json list of all the items
	 * @throws DoransException
	 */
	public String getItemsRaw(StaticItemQueryParams params) throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/item").toString(), params.getParams());
	}

	/**
	 * Methoid to get all the Items
	 *
	 * @param params optional parameters for the method {@link StaticItemQueryParams}
	 * @return list of all the items as a {@link ItemList}
	 * @throws DoransException
	 */
	public ItemList getItems(StaticItemQueryParams params) throws DoransException {
		return getParent().getGson().fromJson(getItemsRaw(params), ItemList.class);
	}

	/**
	 * Method to get an item
	 *
	 * @param itemId id of the champion to retrieve
	 * @param params optional parameters for the method {@link StaticItemQueryParams}
	 * @return raw json item object
	 * @throws DoransException
	 */
	public String getItemRaw(int itemId, StaticItemQueryParams params) throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/items/").append(itemId).toString(), params.getParams());
	}

	/**
	 * Method to get an item
	 *
	 * @param itemId id of the champion to retrieve
	 * @param params optional parameters for the method {@link StaticItemQueryParams}
	 * @return item object as a {@link Item}
	 * @throws DoransException
	 */
	public Item getItem(int itemId, StaticItemQueryParams params) throws DoransException {
		return getParent().getGson().fromJson(getItemRaw(itemId, params), Item.class);
	}

	/**
	 * Method to get the Language Strings
	 *
	 * @return raw json language strings object
	 * @throws DoransException
	 */
	public String getLanguageStringsRaw(StaticLanguageStringsParams params) throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/language-strings").toString(), params.getParams());
	}

	/**
	 * Method to get the Language Strings
	 *
	 * @param params optional parameters for the method {@link StaticLanguageStringsParams}
	 * @return language strings object as a {@link LanguageStrings}
	 * @throws DoransException
	 */
	public LanguageStrings getLanguageStrings(StaticLanguageStringsParams params) throws DoransException {
		return getParent().getGson().fromJson(getLanguageStringsRaw(params), LanguageStrings.class);
	}

	/**
	 * Method to get the languages
	 *
	 * @return raw json list of languages
	 * @throws DoransException
	 */
	public String getLanguagesRaw() throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/languages").toString());
	}

	/**
	 * Method to get the languages
	 *
	 * @return list of languages as a {@link List} of {@link String}
	 * @throws DoransException
	 */
	public List<String> getLanguages() throws DoransException {
		return getParent().getGson().fromJson(getLanguagesRaw(), typeListString);
	}

	/**
	 * Method to get the Maps
	 *
	 * @param params optional parameters for the method {@link StaticMapParams}
	 * @return raw json map data object
	 * @throws DoransException
	 */
	public String getMapsRaw(StaticMapParams params) throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/map").toString(), params.getParams());
	}

	/**
	 * Method to get the Maps
	 *
	 * @param params optional parameters for the method {@link StaticMapParams}
	 * @return map data as a {@link MapData}
	 * @throws DoransException
	 */
	public MapData getMaps(StaticMapParams params) throws DoransException {
		return getParent().getGson().fromJson(getMapsRaw(params), MapData.class);
	}

	/**
	 * Method to get the Masteries
	 *
	 * @param params optional parameters for the method {@link StaticMasteryParams}
	 * @return raw jason mastery list
	 * @throws DoransException
	 */
	public String getMasteriesRaw(StaticMasteryParams params) throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/mastery").toString(), params.getParams());
	}

	/**
	 * Method to get the Masteries
	 *
	 * @param params optional parameters for the method {@link StaticMasteryParams}
	 * @return mastery list as a {@link MasteryList}
	 * @throws DoransException
	 */
	public MasteryList getMasteries(StaticMasteryParams params) throws DoransException {
		return getParent().getGson().fromJson(getMasteriesRaw(params), MasteryList.class);
	}

	/**
	 * Method to get a Mastery
	 *
	 * @param masteryId id of the Mastery to get
	 * @param params    optional parameters for the method {@link StaticMasteryParams}
	 * @return raw json mastery object
	 * @throws DoransException
	 */
	public String getMasteryRaw(int masteryId, StaticMasteryParams params) throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/mastery/").append(masteryId).toString(), params.getParams());
	}

	/**
	 * Method to get a Mastery
	 *
	 * @param masteryId id of the Mastery to get
	 * @param params    optional parameters for the method {@link StaticMasteryParams}
	 * @return mastery object as a {@link Mastery}
	 * @throws DoransException
	 */
	public Mastery getMastery(int masteryId, StaticMasteryParams params) throws DoransException {
		return getParent().getGson().fromJson(getMasteryRaw(masteryId, params), Mastery.class);
	}

	/**
	 * Method to get the realm of the region
	 *
	 * @return raw json realm object
	 * @throws DoransException
	 */
	public String getRealmRaw() throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/realm").toString());
	}

	/**
	 * Method to get the realm of the region
	 *
	 * @return realm object as a {@link Realm}
	 * @throws DoransException
	 */
	public Realm getRealm() throws DoransException {
		return getParent().getGson().fromJson(getRealmRaw(), Realm.class);
	}

	/**
	 * Method to get the Runes
	 *
	 * @param params optional parameters for the method {@link StaticRuneParams}
	 * @return raw json list of runes
	 * @throws DoransException
	 */
	public String getRunesRaw(StaticRuneParams params) throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/rune").toString(), params.getParams());
	}

	/**
	 * Method to get the Runes
	 *
	 * @param params optional parameters for the method {@link StaticRuneParams}
	 * @return list of runes object {@link RuneList}
	 * @throws DoransException
	 */
	public RuneList getRunes(StaticRuneParams params) throws DoransException {
		return getParent().getGson().fromJson(getRunesRaw(params), RuneList.class);
	}

	/**
	 * Method to get a Rune
	 *
	 * @param runeId id of the rune
	 * @param params optional parameters for the method {@link StaticRuneParams}
	 * @return raw json rune object
	 * @throws DoransException
	 */
	public String getRuneRaw(int runeId, StaticRuneParams params) throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/rune/").append(runeId).toString(), params.getParams());
	}

	/**
	 * Method to get a Rune
	 *
	 * @param runeId id of the rune
	 * @param params optional parameters for the method {@link StaticRuneParams}
	 * @return rune object as {@link Rune}
	 * @throws DoransException
	 */
	public Rune getRune(int runeId, StaticRuneParams params) throws DoransException {
		return getParent().getGson().fromJson(getRuneRaw(runeId, params), Rune.class);
	}

	/**
	 * Method to get the Summoner Spells
	 *
	 * @param params optional parameters for the method {@link StaticSummonerSpellsParams}
	 * @return raw json list of summoner spells
	 * @throws DoransException
	 */
	public String getSummonerSpellsRaw(StaticSummonerSpellsParams params) throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/summoner-spell").toString(), params.getParams());
	}

	/**
	 * Method to get the Summoner Spells
	 *
	 * @param params optional parameters for the method {@link StaticSummonerSpellsParams}
	 * @return summoner spells list object as {@link SummonerSpellList}
	 * @throws DoransException
	 */
	public SummonerSpellList getSummonerSpells(StaticSummonerSpellsParams params) throws DoransException {
		return getParent().getGson().fromJson(getSummonerSpellsRaw(params), SummonerSpellList.class);
	}

	/**
	 * Method to get a Summoner Spell
	 *
	 * @param summonerSpellId id of the summoner spell
	 * @param params          optional parameters for the method {@link StaticSummonerSpellsParams}
	 * @return raw json summoner spell object
	 * @throws DoransException
	 */
	public String getSummonerSpellRaw(int summonerSpellId, StaticSummonerSpellsParams params) throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/summoner-spell/").append(summonerSpellId).toString(), params.getParams());
	}

	/**
	 * Method to get a Summoner Spell
	 *
	 * @param summonerSpellId id of the summoner spell
	 * @param params          optional parameters for the method {@link StaticSummonerSpellsParams}
	 * @return summoner spell object as {@link SummonerSpell}
	 * @throws DoransException
	 */
	public SummonerSpell getSummonerSpell(int summonerSpellId, StaticSummonerSpellsParams params) throws DoransException {
		return getParent().getGson().fromJson(getSummonerSpellRaw(summonerSpellId, params), SummonerSpell.class);
	}

	/**
	 * Gets the League of Legends versions available on the API
	 *
	 * @return raw json list of versions
	 * @throws DoransException
	 */
	public String getVersionsRaw() throws DoransException {
		return getParent().getQuery().staticQuery(new StringBuilder(getVersion()).append("/versions").toString());
	}

	/**
	 * Gets the League of Legends version available on the API
	 *
	 * @return list of version as a {@link List} of {@link String}
	 * @throws DoransException
	 */
	public List<String> getVersions() throws DoransException {
		return getParent().getGson().fromJson(getVersionsRaw(), typeListString);
	}
}
