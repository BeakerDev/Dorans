package gg.buff.dorans.query;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class QueryUtils {
	public static String standardizeSummonerName(String name) {
		return name.toLowerCase().replaceAll("\\s+", StringUtils.EMPTY);
	}

	public static List<String> standardizeSummonerName(List<String> names) {
		List<String> result = new ArrayList<>();
		for (String name : names) {
			result.add(standardizeSummonerName(name));
		}
		return result;
	}
}
