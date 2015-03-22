package gg.buff.dorans.objects;

public enum Region {
    NA("NA1"),
    EUW("EUW1"),
    EUNE("EUN1"),
    KR("KR"),
    BR("BR1"),
    LAS("LA2"),
    LAN("LA1"),
    OCE("OC1"),
    TR("TR1"),
    RU("RU"),
    GLOBAL("");

    private final String platformId;

    private Region(String platformId) {
        this.platformId = platformId;
    }

    public String getPlatformId() {
        return platformId;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
