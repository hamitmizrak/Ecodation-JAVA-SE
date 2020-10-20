package com.ecodation.ornek.bolum005.asal;

import java.util.Scanner;

public class Example016_Asal {

	public static void main(String[] args) {
		// Scanner klavye = new Scanner(System.in);
		// System.out.println("Sayı giriniz");
		// int sayi;
		// sayi = klavye.nextInt();
		// isAsal(sayi);
		asalSayilar();

	}

	public static void isAsal(int sayi) {
// 2 -3 -4 -5 -6 -7 -8 -9

		int[] dizi = new int[sayi];

		for (int i = 2; i < sayi; i++) {

			if (sayi % i == 0) {
				System.out.println(sayi + ",asal değildir");
				// return false;
				System.exit(0);
			} else {
				System.out.println(sayi + "sayı asaldır");
				// return true;
				System.exit(0);
				for (int j = 0; j < dizi.length; j++) {
					dizi[j] = i;
				}

			}

			for (int temp : dizi) {
				System.out.println();
			}

		}

	}

	public static void asalSayilar() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Üst asal sayı limiti giriniz");
		int sayi;
		sayi = klavye.nextInt();
		int asal = 0;

		if (sayi < 2) {
			System.out.println("Asal değildir");
		}

		for (int i = 2; i < sayi; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					asal = 1;
				}
			}
			if (asal == 0) {
				System.out.print(i + " - ");
			} else {
				asal = 0;
			}

		}

	}

}
