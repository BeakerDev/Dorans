package gg.buff.dorans;

import gg.buff.dorans.annotations.RateLimitted;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.objects.generated.match_history.PlayerHistory;
import gg.buff.dorans.query.params.MatchHistoryParams;

public class MatchHistoryApi extends CommonApi {
	protected MatchHistoryApi(Dorans parent) {
		super(parent, "v2.2");
	}

	/**
	 * Method to get a Players Match history.
	 * <br />
	 * The maximum range for begin and end index is 15. If the range is more than 15, the end
	 * index will be modified to enforce the 15 game limit. If only one of the index parameters
	 * is specified, the other will be computed accordingly.
	 *
	 * @param summonerId id of the summoner
	 * @param params optional parameters for this method {@link MatchHistoryParams}
	 * @return raw json player history object
	 * @throws DoransException
	 */
	@RateLimitted
	public String getMatchHistoryRaw(long summonerId, MatchHistoryParams params) throws DoransException {
		return getParent().getQuery().query(new StringBuilder(getVersion()).append("/matchhistory/").append(summonerId).toString(), params.getParams());
	}

	/**
	 * Method to get a Players Match history.
	 * <br />
	 * The maximum range for begin and end index is 15. If the range is more than 15, the end
	 * index will be modified to enforce the 15 game limit. If only one of the index parameters
	 * is specified, the other will be computed accordingly.
	 *
	 * @param summonerId id of the summoner
	 * @param params optional parameters for this method {@link MatchHistoryParams}
	 * @return player history object as {@link PlayerHistory}
	 * @throws DoransException
	 */
	@RateLimitted
	public PlayerHistory getMatchHistory(long summonerId, MatchHistoryParams params) throws DoransException {
		return getParent().getGson().fromJson(getMatchHistoryRaw(summonerId, params), PlayerHistory.class);
	}
}
