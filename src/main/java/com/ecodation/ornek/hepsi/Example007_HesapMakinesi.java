package com.ecodation.ornek.hepsi;

import java.util.Scanner;

public class Example007_HesapMakinesi {
	public static void main(String[] args) {
		hesapMakinesi();
	}

	public static void hesapMakinesi() {
		Scanner klavye = new Scanner(System.in);
		int sayi2, sayi3;
		System.out.println("1.sayıyı giriniz");
		sayi2 = klavye.nextInt();
		System.out.println("2.sayıyı giriniz.");
		sayi3 = klavye.nextInt();

		int top = topla(sayi2, sayi3);
		System.out.println("Toplamları: " + top);

		int cik = cikar(sayi2, sayi3);
		System.out.println("cikar: " + cik);

		int carp = carp(sayi2, sayi3);
		System.out.println("carpımları: " + carp);

		int bol = bolme(sayi2, sayi3);
		System.out.println("Bölüm: " + bol);

		int kalan = kalan(sayi2, sayi3);
		System.out.println("Kalanları: " + kalan);

	}

	public static int topla(int sayi, int sayi2) {
		return (sayi + sayi2);
	}

	public static int cikar(int sayi, int sayi2) {
		return (sayi - sayi2);
	}

	public static int carp(int sayi, int sayi2) {
		return (sayi * sayi2);
	}

	public static int bolme(int sayi, int sayi2) {
		return (sayi / sayi2);
	}

	public static int kalan(int sayi, int sayi2) {
		return (sayi % sayi2);
	}

}
