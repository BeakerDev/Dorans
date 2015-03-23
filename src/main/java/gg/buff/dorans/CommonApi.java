package gg.buff.dorans;

public abstract class CommonApi {
	private final Dorans parent;
	private final String version;

	protected CommonApi(Dorans parent, String version) {
		this.parent = parent;
		this.version = version;
	}

	protected Dorans getParent() {
		return parent;
	}

	public String getVersion() {
		return version;
	}
}
