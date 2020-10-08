package com.ecodation.abstractX;

import java.io.Serializable;

abstract public class AbstractClass implements Serializable {
	private static final long serialVersionUID = -3747139864708105118L;
	// Nesne değişkenleri
	private String anakart;
	private String sesKart;
	private String tvKart;
	private String usb;

	public AbstractClass() {
		anakart = "anakart modeli yazmadınız";
		sesKart = "seskart modeli yazmadınız";
		tvKart = "tvkart modeli yazmadınız";
	}

	public AbstractClass(String anakart, String sesKart, String tvKart, String usb) {
		// super();
		this.anakart = anakart;
		this.sesKart = sesKart;
		this.tvKart = tvKart;
		this.usb = usb;
	}

	// Normal metot
	public void bilgisayarOzellikleri() {
		System.out.println(
				"ana kartınız:" + getAnakart() + " \nses kartınız:" + getSesKart() + "\ntv kartınız: " + getTvKart());
	}

	// abstract metot
	abstract public void bilgisayarPerformans();

	public abstract String bilgisayarMiktar(double fiyat);

	// toString
	@Override
	public String toString() {
		return "AbstractClass [anakart=" + anakart + ", sesKart=" + sesKart + ", tvKart=" + tvKart + ", usb=" + usb
				+ "]";
	}

	// Getter setter
	public String getAnakart() {
		return anakart;
	}

	public void setAnakart(String anakart) {
		this.anakart = anakart;
	}

	public String getSesKart() {
		return sesKart;
	}

	public void setSesKart(String sesKart) {
		this.sesKart = sesKart;
	}

	public String getTvKart() {
		return tvKart;
	}

	public void setTvKart(String tvKart) {
		this.tvKart = tvKart;
	}

	public String getUsb() {
		return usb;
	}

	public void setUsb(String usb) {
		this.usb = usb;
	}

}
