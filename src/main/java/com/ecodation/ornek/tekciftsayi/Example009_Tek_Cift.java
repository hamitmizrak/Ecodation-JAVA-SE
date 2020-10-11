package com.ecodation.ornek.tekciftsayi;

import java.util.Scanner;

public class Example009_Tek_Cift {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi2, sayiciTek = 0, sayiciCift = 0;
		System.out.println("1.sayıyı giriniz");
		sayi2 = klavye.nextInt();

		int[] dizi = new int[sayi2];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = i;
		}

		for (int temp : dizi) {
			System.out.print(temp);
		}

		System.out.println("\n");
		for (int i = 0; i < sayi2; i++) {
			if (dizi[i] % 2 == 0) {
				System.out.println("sayi çifttir");
				sayiciCift++;
				System.out.println(dizi[i]);
			} else {
				System.out.println("sayi tek sayidir");
				sayiciTek++;
				System.out.println(dizi[i]);
			}
		}

		System.out.println("Tek sayı:" + sayiciTek);
		System.out.println("Çift sayı:" + sayiciCift);

	}
}
