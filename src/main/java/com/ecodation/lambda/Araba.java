package com.ecodation.lambda;

public class Araba implements Comparable<Araba> {

	private String arabaAdi;
	private int arabaModel;

	@Override
	public int compareTo(Araba o) {
		return this.arabaAdi.compareTo(o.getArabaAdi());
		// return this.arabaModel.compareTo(o.getArabaModel());
	}

	public Araba(String arabaAdi, int arabaModel) {
		this.arabaAdi = arabaAdi;
		this.arabaModel = arabaModel;
	}

	public String getArabaAdi() {
		return arabaAdi;
	}

	public void setArabaAdi(String arabaAdi) {
		this.arabaAdi = arabaAdi;
	}

	public int getArabaModel() {
		return arabaModel;
	}

	public void setArabaModel(int arabaModel) {
		this.arabaModel = arabaModel;
	}

	@Override
	public String toString() {
		return "Araba [arabaAdi=" + arabaAdi + ", arabaModel=" + arabaModel + "]";
	}

}
