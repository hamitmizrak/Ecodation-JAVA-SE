package com.ecodation.examples;

import java.util.Random;
import java.util.Scanner;

public class Example002_Random_Methods {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi;
		System.out.println("Lütfen boyut eleman sayısını giriniz");
		sayi = klavye.nextInt();
		int[] dizi = new int[sayi];

		// Random
		// Math.random()
		Random random = new Random();
		int karisik = random.nextInt(5) + 1;

		for (int i = 0; i < dizi.length; i++) {
			karisik = random.nextInt(5) + 1;
			dizi[i] = karisik;
		}

		// forEach
		for (int temp : dizi) {
			System.out.print(temp);
		}

		/*
		 * for (int i = 0; i < dizi.length; i++) { dizi[0] dizi }
		 */

		System.out.println("\n\rilk sayi:" + dizi[0] + " son sayı:" + dizi[dizi.length - 1] + " toplamları="
				+ (dizi[0] + dizi[dizi.length - 1]));
		int x = (dizi[0] + dizi[dizi.length - 1]);
		karsilastir(x);
	}

	public static void karsilastir(int sayi) {

		if (sayi < 10) {
			System.out.println("sayi:" + sayi + " 10 'dan küçük");
		} else {
			System.out.println("sayi 10 büyük");
		}
	}

}
