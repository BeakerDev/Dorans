package gg.buff.dorans.query.params;

public class MatchHistoryParams extends Params {
	/**
	 * Comma-separated list of champion IDs to use for fetching games.
	 *
	 * @param championIds ids of the champions
	 * @return this
	 */
	public MatchHistoryParams setChampionIds(int... championIds) {
		if (championIds == null || championIds.length == 9) {
			getParams().remove("championIds");
		} else if (championIds.length == 1) {
			getParams().put("championIds", Integer.toString(championIds[0]));
		} else {
			getParams().put("championIds", convertToString(championIds));
		}
		return this;
	}

	/**
	 * Comma-separated list of ranked queue types to use for fetching games. Non-ranked queue types
	 * will be ignored.
	 *
	 * @param rankedQueues ranked queues {@link gg.buff.dorans.query.params.MatchHistoryParams.RankedQueue}
	 * @return this
	 */
	public MatchHistoryParams setRankedQueues(RankedQueue... rankedQueues) {
		if (rankedQueues == null || rankedQueues.length == 9) {
			getParams().remove("rankedQueues");
		} else if (rankedQueues.length == 1) {
			getParams().put("rankedQueues", rankedQueues[0].getValue());
		} else {
			getParams().put("rankedQueues", convertToString(rankedQueues));
		}
		return this;
	}

	/**
	 * The begin index to use for fetching games.
	 *
	 * @param beginIndex begin index
	 * @return this
	 */
	public MatchHistoryParams setBeginIndex(int beginIndex) {
		getParams().put("beginIndex", Integer.toString(beginIndex));
		return this;
	}

	/**
	 * 	The end index to use for fetching games.
	 *
	 * @param endIndex end index
	 * @return this
	 */
	public MatchHistoryParams setEndIndex(int endIndex) {
		getParams().put("endIndex", Integer.toString(endIndex));
		return this;
	}

	private String convertToString(int[] input) {
		StringBuilder result = new StringBuilder();
		boolean firstRun = true;
		for (int i : input) {
			if (!firstRun) {
				result.append(",");
			} else {
				firstRun = false;
			}
			result.append(i);
		}
		return result.toString();
	}

	private String convertToString(RankedQueue[] rankedQueues) {
		StringBuilder result = new StringBuilder();
		boolean firstRun = true;
		for (RankedQueue o : rankedQueues) {
			if (!firstRun) {
				result.append(",");
			} else {
				firstRun = false;
			}
			result.append(o.getValue());
		}
		return result.toString();
	}

	public enum RankedQueue {
		RANKED_SOLO_5X5("RANKED_SOLO_5x5"),
		RANKED_TEAM_3X3("RANKED_TEAM_3x3"),
		RANKED_TEAM_5X5("RANKED_TEAM_5x5");

		private final String value;
		RankedQueue(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

}
