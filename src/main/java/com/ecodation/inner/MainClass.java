package com.ecodation.inner;

public class MainClass {

	public static void main(String[] args) {
		// Ulke ulke=new Ulke();
		// Sehir sehir=new Sehir();

		//1 tane class
		Ulke ulke = new Ulke();
		
		//2 tane class
		Ulke.Sehir sehir= new Ulke().new Sehir();
		sehir.getSehir();
		
		//3 tane
		Ulke.Sehir.Mahalle mahalleler=new Ulke().new Sehir().new Mahalle();
		mahalleler.mahalleMetot();

	}
}
