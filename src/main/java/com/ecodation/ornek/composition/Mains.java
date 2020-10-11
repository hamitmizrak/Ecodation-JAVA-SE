package com.ecodation.ornek.composition;

public class Mains {
	public static void main(String[] args) {
		Yazar yazar = new Yazar();
		yazar.getKitap();

		Kitap kitap = new Kitap();
		kitap.getYazar();

	}
}
