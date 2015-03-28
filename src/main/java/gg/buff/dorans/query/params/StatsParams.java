package gg.buff.dorans.query.params;

public class StatsParams extends Params {
	public StatsParams setSeason(Season season) {
		getParams().put("season", season.getValue());
		return this;
	}

	public enum Season {
		SEASON_2015("SEASON2015"),
		SEASON_2014("SEASON2014"),
		SEASON_3("SEASON3");

		private final String value;

		Season(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static Season getCurrent() {
			return SEASON_2015;
		}
	}
}
