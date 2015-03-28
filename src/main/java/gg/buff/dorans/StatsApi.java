package gg.buff.dorans;

import gg.buff.dorans.annotations.RateLimitted;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.objects.generated.stats.PlayerStatsSummaryList;
import gg.buff.dorans.objects.generated.stats.RankedStats;
import gg.buff.dorans.query.params.StatsParams;

public class StatsApi extends CommonApi {
	protected StatsApi(Dorans parent) {
		super(parent, "v1.3");
	}

	/**
	 * Includes ranked stats for Twisted Treeline and Summoner's Rift.
	 *
	 * @param summonerId id of the summoner
	 * @param params     optional params for this method {@link StatsParams}
	 * @return raw json ranked stats object
	 * @throws DoransException
	 */
	@RateLimitted
	public String getRankedStatsRaw(int summonerId, StatsParams params) throws DoransException {
		return getParent().getQuery().query(new StringBuilder(getVersion()).append("/stats/by-summoner/").append(summonerId).append("/ranked").toString(), params.getParams());
	}

	/**
	 * Includes ranked stats for Twisted Treeline and Summoner's Rift.
	 *
	 * @param summonerId id of the summoner
	 * @param params     optional params for this method {@link StatsParams}
	 * @return ranked stats object as {@link RankedStats}
	 * @throws DoransException
	 */
	@RateLimitted
	public RankedStats getRankedStats(int summonerId, StatsParams params) throws DoransException {
		return getParent().getGson().fromJson(getRankedStatsRaw(summonerId, params), RankedStats.class);
	}

	/**
	 * One summary is returned per queue type.
	 *
	 * @param summonerId id of the summoner
	 * @param params     optional params for this method {@link StatsParams}
	 * @return raw json player stats summary list
	 * @throws DoransException
	 */
	@RateLimitted
	public String getSummaryStatsRaw(int summonerId, StatsParams params) throws DoransException {
		return getParent().getQuery().query(new StringBuilder(getVersion()).append("/stats/by-summoner/").append(summonerId).append("/summary").toString(), params.getParams());
	}

	/**
	 * One summary is returned per queue type.
	 *
	 * @param summonerId id of the summoner
	 * @param params     optional params for this method {@link StatsParams}
	 * @return player stats summary list as {@link PlayerStatsSummaryList}
	 * @throws DoransException
	 */
	@RateLimitted
	public PlayerStatsSummaryList getSummaryStats(int summonerId, StatsParams params) throws DoransException {
		return getParent().getGson().fromJson(getSummaryStatsRaw(summonerId, params), PlayerStatsSummaryList.class);
	}
}
