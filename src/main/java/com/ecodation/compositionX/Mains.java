package com.ecodation.compositionX;

public class Mains {
	public static void main(String[] args) {
		Yazar yazar = new Yazar();
		yazar.getKitap();

		Kitap kitap = new Kitap();
		kitap.getYazar();

	}
}
