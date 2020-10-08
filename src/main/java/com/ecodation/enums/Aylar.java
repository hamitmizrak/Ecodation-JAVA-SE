package com.ecodation.enums;

public enum Aylar {
	ocak(10, "OCAK"), subat(20, "ŞUBAT"), mart(30, "MART"), nisan(40, "NİSAN"), mayis(50, "MAYIS"),
	haziran(60, "HAZİRAN");

	// Nesne değişkenleri
	private int key;
	private String value;

	// private conctructor
	private Aylar(int key, String value) {
		this.key = key;
		this.value = value;
	}

	// Getter and setter
	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

}
