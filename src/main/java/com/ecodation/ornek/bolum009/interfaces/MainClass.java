package com.ecodation.ornek.bolum009.interfaces;

public class MainClass {
	public static void main(String[] args) {
		IEImza imza = new Universite();// polymorphism

		imza.mulakatSorulari();
		// imza.deneme(sonuc);
	}
}
