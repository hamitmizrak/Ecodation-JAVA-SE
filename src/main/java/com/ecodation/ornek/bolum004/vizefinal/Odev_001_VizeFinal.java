package com.ecodation.ornek.bolum004.vizefinal;

import java.util.Scanner;

public class Odev_001_VizeFinal {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		try {
			double vize, final4, sonuc;

			System.out.println("Lütfen vize notunu giriniz");
			vize = klavye.nextDouble();

			System.out.println("Lütfen final notunu giriniz");
			final4 = klavye.nextDouble();

			sonuc = Math.abs((vize * 40 / 100) + (final4 * 60 / 100));

			if (0 <= sonuc & sonuc <= 49) {
				System.out.println("notunuz:" + sonuc + " FF");
			} else if (50 <= sonuc & sonuc <= 59) {
				System.out.println("notunuz:" + sonuc + " CD");
			} else if (60 <= sonuc & sonuc <= 69) {
				System.out.println("notunuz:" + sonuc + " CC");
			} else if (70 <= sonuc & sonuc <= 79) {
				System.out.println("notunuz:" + sonuc + " BA");
			} else if (80 <= sonuc & sonuc <= 100) {
				System.out.println("notunuz:" + sonuc + " AA");
			} else {
				System.out.println("lütfen belirtilen aralıklarda vize final giriniz");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
