package gg.buff.dorans;

import gg.buff.dorans.annotations.RateLimitted;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.objects.generated.match.MatchDetail;
import gg.buff.dorans.query.params.MatchParams;

import java.util.Map;

public class MatchApi extends CommonApi {
	private final static MatchParams INCLUDE_TIMELINE = new MatchParams();

	static {
		INCLUDE_TIMELINE.setIncludeTimeline(true);
	}

	protected MatchApi(Dorans parent) {
		super(parent, "v2.2");
	}

	/**
	 * Method to get a Match
	 *
	 * @param matchId id of the match
	 * @return raw json match object
	 * @throws DoransException
	 */
	@RateLimitted
	public String getMatchRaw(long matchId) throws DoransException {
		return getMatchRaw(matchId, false);
	}

	/**
	 * Method to get a Match
	 *
	 * @param matchId         id of the match
	 * @param includeTimeline Flag indicating whether or not to include match timeline data
	 * @return raw json match object
	 * @throws DoransException
	 */
	@RateLimitted
	public String getMatchRaw(long matchId, boolean includeTimeline) throws DoransException {
		Map<String, String> params = null;
		if (includeTimeline) {
			params = INCLUDE_TIMELINE.getParams();
		}
		return getParent().getQuery().query(new StringBuilder(getVersion()).append("/match/").append(matchId).toString(), params);
	}

	/**
	 * Method to get a Match
	 *
	 * @param matchId id of the match
	 * @return match object as {@link MatchDetail}
	 * @throws DoransException
	 */
	@RateLimitted
	public MatchDetail getMatch(long matchId) throws DoransException {
		return getMatch(matchId, false);
	}

	/**
	 * Method to get a Match
	 *
	 * @param matchId         id of the match
	 * @param includeTimeline Flag indicating whether or not to include match timeline data
	 * @return match object as {@link MatchDetail}
	 * @throws DoransException
	 */
	@RateLimitted
	public MatchDetail getMatch(long matchId, boolean includeTimeline) throws DoransException {
		return getParent().getGson().fromJson(getMatchRaw(matchId, includeTimeline), MatchDetail.class);
	}
}
