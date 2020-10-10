package com.ecodation.compositionX;

import java.io.Serializable;
import java.util.List;

public class Yazar implements Serializable {
	private static final long serialVersionUID = 1L;

	// nesne değişkeni
	private String yazarAdi;
	private String yazarSoyadi;
	private String yas;

	private List<Kitap> kitap; //

	public Yazar() {
		// TODO Auto-generated constructor stub
	}

	public Yazar(String yazarAdi, String yazarSoyadi, String yas) {
		super();
		this.yazarAdi = yazarAdi;
		this.yazarSoyadi = yazarSoyadi;
		this.yas = yas;
	}

	// getter and setter
	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public String getYazarSoyadi() {
		return yazarSoyadi;
	}

	public void setYazarSoyadi(String yazarSoyadi) {
		this.yazarSoyadi = yazarSoyadi;
	}

	public String getYas() {
		return yas;
	}

	public void setYas(String yas) {
		this.yas = yas;
	}

	public List<Kitap> getKitap() {
		return kitap;
	}

	public void setKitap(List<Kitap> kitap) {
		this.kitap = kitap;
	}

	// toString
	@Override
	public String toString() {
		return "Yazar [yazarAdi=" + yazarAdi + ", yazarSoyadi=" + yazarSoyadi + ", yas=" + yas + "]";
	}

}
