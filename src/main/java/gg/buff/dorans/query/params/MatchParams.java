package gg.buff.dorans.query.params;

public class MatchParams extends Params {
	/**
	 * Flag indicating whether or not to include match timeline data
	 *
	 * @param includeTimeline include timeline
	 * @return this
	 */
	public MatchParams setIncludeTimeline(boolean includeTimeline) {
		getParams().put("includeTimeline", Boolean.toString(includeTimeline).toLowerCase());
		return this;
	}

	public boolean getIncludeTimeline() {
		return getParams().get("includeTimeline").equals("true");
	}
}
