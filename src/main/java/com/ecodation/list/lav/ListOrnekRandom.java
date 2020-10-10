package com.ecodation.list.lav;

import java.util.ArrayList;
import java.util.Random;

public class ListOrnekRandom {

	public static void main(String[] args) {
		// ornek2();
		int buyuk = enBuyuk();
		System.out.println("\nen büyük sayı: " + buyuk);

		int[] dizi = new int[buyuk];
		for (int temp : dizi) {
			System.out.println(temp);
		}

	}

	/*
	 * 5 tane random sayısı girilsin eklesin Ekranda göstersin silsin
	 */
	public static int randomMethods() {
		Random random = new Random();
		int sayi = random.nextInt(5) + 1;
		return sayi;

	}

	public static Integer enBuyuk() {
		java.util.List<Integer> list = new ArrayList<Integer>();
		randomMethods();

		for (int i = 0; i < 5; i++) {
			list.add(randomMethods());
		}

		ListOrnek forDonguler2 = new ListOrnek();
		forDonguler2.forEachMetot2(list);

		int enBuyuk = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > enBuyuk) {
				enBuyuk = list.get(i);
				// System.out.println(enBuyuk);

			}
		}

		return enBuyuk;
	}

	public static void ornek2() {
		java.util.List<Integer> list = new ArrayList<Integer>();
		randomMethods();

		for (int i = 0; i < 5; i++) {
			list.add(randomMethods());
		}
		ListOrnek forDonguler = new ListOrnek();
		forDonguler.forEachMetot2(list);

		list.clear();
		forDonguler.forEachMetot2(list);
		System.out.println("\nekran sildim");
	}
}
