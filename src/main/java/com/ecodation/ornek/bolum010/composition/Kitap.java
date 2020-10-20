package com.ecodation.ornek.bolum010.composition;

import java.io.Serializable;

public class Kitap implements Serializable {
	private static final long serialVersionUID = -8660908896619648661L;

	// Nesne değişkenleri
	private String kitapAdi;
	private String kitapTuru;
	private String basimYili;

	private Yazar yazar; // 1 tane

	public Kitap() {
		// TODO Auto-generated constructor stub
	}

	public Kitap(String kitapAdi, String kitapTuru, String basimYili) {
		super();
		this.kitapAdi = kitapAdi;
		this.kitapTuru = kitapTuru;
		this.basimYili = basimYili;
	}

	// Getter and Setter
	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getKitapTuru() {
		return kitapTuru;
	}

	public void setKitapTuru(String kitapTuru) {
		this.kitapTuru = kitapTuru;
	}

	public String getBasimYili() {
		return basimYili;
	}

	public void setBasimYili(String basimYili) {
		this.basimYili = basimYili;
	}

	public Yazar getYazar() {
		return yazar;
	}

	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}

	// toString
	@Override
	public String toString() {
		return "Kitap [kitapAdi=" + kitapAdi + ", kitapTuru=" + kitapTuru + ", basimYili=" + basimYili + "]";
	}

}
