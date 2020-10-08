package com.ecodation.enums;

import java.util.Scanner;

public class Tutorials {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		/*
		 * 1-5 kucuk 6-10 orta 11-15 büyük 16-20 daha büyük
		 */
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = klavye.nextInt();
		// klavye.nextInt();

		if (1 <= sayi && sayi <= 5) {
			System.out.println(Oran.kucuk);

		} else if (6 <= sayi && sayi <= 10) {
			System.out.println(Oran.orta);
		} else if (11 <= sayi && sayi <= 15) {
			System.out.println(Oran.buyuk);
		} else if (16 <= sayi && sayi <= 20) {
			System.out.println(Oran.dahaBuyuk);
		}

	}
}
