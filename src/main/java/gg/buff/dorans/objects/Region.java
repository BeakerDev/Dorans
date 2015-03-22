package gg.buff.dorans.objects;

public enum Region {
    NA("NA1", "https://na.api.pvp.net/"),
    EUW("EUW1", "https://euw.api.pvp.net/"),
    EUNE("EUN1", "https://eune.api.pvp.net/"),
    KR("KR", "https://kr.api.pvp.net/"),
    BR("BR1", "https://br.api.pvp.net/"),
    LAS("LA2", "https://las.api.pvp.net/"),
    LAN("LA1", "https://lan.api.pvp.net/"),
    OCE("OC1", "https://oce.api.pvp.net/"),
    TR("TR1", "https://tr.api.pvp.net/"),
    RU("RU", "https://ru.api.pvp.net/"),
    GLOBAL("", "https://global.api.pvp.net/");

    private final String platformId;
	private final String endpoint;
	private final String observerUrl;
	private final String resourceUrl;

    private Region(String platformId, String endpoint) {
        this.platformId = platformId;
	    this.endpoint = endpoint;
	    this.observerUrl = endpoint + "observer-mode/rest/";
	    this.resourceUrl = endpoint + "api/lol/";
    }

    public String getPlatformId() {
        return platformId;
    }

	public String getEndpoint() {
		return endpoint;
	}

	public String getObserverUrl() {
		return observerUrl;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	@Override
    public String toString() {
        return name().toLowerCase();
    }
}
