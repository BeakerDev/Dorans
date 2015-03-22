package gg.buff.dorans;

import com.google.gson.reflect.TypeToken;
import gg.buff.dorans.exceptions.DoransException;
import gg.buff.dorans.exceptions.InvalidParameterException;
import gg.buff.dorans.objects.generated.summoner.Summoner;
import gg.buff.dorans.query.QueryUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SummonerApi {
	private static final String VERSION = "v1.4";
	private final Dorans parent;

	private final Type typeMapStringSummoner = new TypeToken<Map<String, Summoner>>() {
	}.getType();

	public SummonerApi(Dorans parent) {
		this.parent = parent;
	}

	public String getSummonersByNameRaw(List<String> summoners) throws DoransException {
		List<String> standardizedSummonders = QueryUtils.standardizeSummonerName(summoners);

		String summonerList;
		if (standardizedSummonders.size() == 0) {
			throw new InvalidParameterException("Zero summoners is not allowed");
		} else if (standardizedSummonders.size() == 1) {
			summonerList = standardizedSummonders.get(0);
		} else if (standardizedSummonders.size() > 40) {
			throw new InvalidParameterException("Method limited to 40 summoner names per query");
		} else {
			summonerList = StringUtils.join(standardizedSummonders, ",");
		}

		return parent.getQuery().query(new StringBuilder().append(VERSION).append("/summoner/by-name/").append(summonerList).toString());
	}

	public Map<String, Summoner> getSummonersByName(List<String> summoners) throws DoransException {
		return parent.getGson().fromJson(getSummonersByNameRaw(summoners), typeMapStringSummoner);
	}

	public String getSummonerByNameRaw(String summoner) throws DoransException {
		return getSummonersByNameRaw(Collections.singletonList(summoner));
	}

	public Summoner getSummonerByName(String summoner) throws DoransException {
		Map<String, Summoner> result = getSummonersByName(Collections.singletonList(summoner));
		return result.entrySet().iterator().next().getValue();
	}
}
