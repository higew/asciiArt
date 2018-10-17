package jp.meyerb.asciiart.alphabets;

public abstract class DefaultAlphabet {
	private int h;
	private int w;
	private String[] datas;
	
	public DefaultAlphabet(int h, int w, String[] datas) {
		this.h = h;
		this.w = w;
		this.datas = datas;
	}

	public int getH() {
		return this.h;
	}

	public int getW() {
		return this.w;
	}

	public String[] getDatas() {
		return this.datas;
	}
}