package gg.buff.dorans;

import com.google.gson.Gson;
import gg.buff.dorans.objects.Region;
import gg.buff.dorans.query.QueryManager;

public class Dorans {
	private final QueryManager query;
	private final Gson gson = new Gson();
	// API Objects
	private final SummonerApi summoner = new SummonerApi(this);
	private final ChampionApi champion = new ChampionApi(this);
	private final CurrentGameApi currentGame = new CurrentGameApi(this);
	private final FeaturedGamesApi featuredGames = new FeaturedGamesApi(this);
	private final GameApi game = new GameApi(this);
	private final LeagueApi league = new LeagueApi(this);
	private final StaticApi lolStatic = new StaticApi(this);
	private final StatusApi lolStatus = new StatusApi(this);
	private final MatchApi match = new MatchApi(this);
	private final MatchHistoryApi matchHistory = new MatchHistoryApi(this);
	private final StatsApi stats = new StatsApi(this);

	public Dorans() {
		query = new QueryManager();
	}

	public Dorans(String apiKey) {
		query = new QueryManager(apiKey);
	}

	public Dorans(Region region) {
		query = new QueryManager();
		query.setRegion(region);
	}

	public Dorans(String apiKey, Region region) {
		query = new QueryManager(apiKey);
		query.setRegion(region);
	}

	public SummonerApi summoner() {
		return summoner;
	}

	public ChampionApi champion() {
		return champion;
	}

	public CurrentGameApi currentGame() {
		return currentGame;
	}

	public FeaturedGamesApi featuredGames() {
		return featuredGames;
	}

	public GameApi game() {
		return game;
	}

	public LeagueApi league() {
		return league;
	}

	public StaticApi lolStatic() {
		return lolStatic;
	}

	public StatusApi lolStatus() {
		return lolStatus;
	}

	public MatchApi match() {
		return match;
	}

	public MatchHistoryApi matchHistory() {
		return matchHistory;
	}

	public StatsApi stats() {
		return stats;
	}

	public Region getRegion() {
		return query.getRegion();
	}

	public void setRegion(Region region) {
		query.setRegion(region);
	}

	protected QueryManager getQuery() {
		return query;
	}

	public Gson getGson() {
		return gson;
	}
}
