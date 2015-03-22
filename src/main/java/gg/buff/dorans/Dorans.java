package gg.buff.dorans;

import com.google.gson.Gson;
import gg.buff.dorans.objects.Region;
import gg.buff.dorans.query.QueryManager;

public class Dorans {
	private final QueryManager query;
	private final Gson gson = new Gson();

	private final SummonerApi summoner = new SummonerApi(this);

	public Dorans() {
		query =  new QueryManager();
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

	protected QueryManager getQuery() {
		return query;
	}

	public Gson getGson() {
		return gson;
	}
}
