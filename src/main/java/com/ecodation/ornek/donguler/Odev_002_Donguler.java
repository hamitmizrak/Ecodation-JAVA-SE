package com.ecodation.ornek.donguler;

public class Odev_002_Donguler {

	public static void main(String[] args) {
		// 1 ...10 sayıların tplamını veren algoritma
		// 2 bölnebilen sayıların toplamı

		int temp = 0;
		int sonuc = 0;
		for (int i = 0; i <= 10; i = i + 2) {
			sonuc += i;
		}
		System.out.println("cevap:" + sonuc);
	}
}
