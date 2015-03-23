package gg.buff.dorans;

public abstract class CommonApi {
	private final Dorans parent;

	protected CommonApi(Dorans parent) {
		this.parent = parent;
	}

	protected Dorans getParent() {
		return parent;
	}
}
