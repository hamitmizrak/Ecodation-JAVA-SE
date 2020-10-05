package com.ecodation.inheritances;

import java.io.Serializable;

public class AtaClass implements Serializable {
	private static final long serialVersionUID = 1834675886828945183L;

	// Ortak özellikler
	private String klavye = "";
	private String ekran = "";
	private String anakart = "";
	private String ekranKarti = "";
	private String sesKarti = "";

	// parametresiz constructor
	public AtaClass() {

	}

//parametreli constructor
	public AtaClass(String klavye, String ekran, String anakart, String ekranKarti, String sesKarti) {
		super();
		this.klavye = klavye;
		this.ekran = ekran;
		this.anakart = anakart;
		this.ekranKarti = ekranKarti;
		this.sesKarti = sesKarti;
	}

	// toString
	@Override
	public String toString() {
		return "AtaClass [klavye=" + klavye + ", ekran=" + ekran + ", anakart=" + anakart + ", ekranKarti=" + ekranKarti
				+ ",sesKarti=" + sesKarti + "]";
	}

	public void ataMethod() {
		System.out.println("Ata metodum");
	}

	// Getter setter
	public String getKlavye() {
		return klavye;
	}

	public void setKlavye(String klavye) {
		this.klavye = klavye;
	}

	public String getEkran() {
		return ekran;
	}

	public void setEkran(String ekran) {
		this.ekran = ekran;
	}

	public String getAnakart() {
		return anakart;
	}

	public void setAnakart(String anakart) {
		this.anakart = anakart;
	}

	public String getEkranKarti() {
		return ekranKarti;
	}

	public void setEkranKarti(String ekranKarti) {
		this.ekranKarti = ekranKarti;
	}

	public String getSesKarti() {
		return sesKarti;
	}

	public void setSesKarti(String sesKarti) {
		this.sesKarti = sesKarti;
	}

}
