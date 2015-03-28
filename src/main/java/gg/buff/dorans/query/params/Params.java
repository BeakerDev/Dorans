package gg.buff.dorans.query.params;

import java.util.HashMap;
import java.util.Map;

public abstract class Params {
	private final Map<String, String> params = new HashMap<>();

	public Map<String, String> getParams() {
		return params;
	}
}
