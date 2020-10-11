package com.ecodation.ornek.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListOrnek {
	/*
	 * Kullanıcıdan 5 tane sayı girilsin. List eklensin Ekranda göster (forEach
	 * Foriterative Iterator) en son sayıyı kaldıralım. Iterator
	 * 
	 * 5 tane random sayısı girilsin eklesin Ekranda göstersin silsin
	 * 
	 * 
	 * enbüyüğü bulsun bunu bir metota göndesin o metodun static dizi boyutuna
	 * eklensin.
	 */

	public static void main(String[] args) {
		user();
	}

	public static void user() {
		Scanner klavye = new Scanner(System.in);
		int sayi;
		java.util.List<Integer> list;
		list = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Lütfen " + (i + 1) + ".ci sayıyı giriniz");
			sayi = klavye.nextInt();
			list.add(sayi);

		}
		System.out.println("ForEach döngüsü");
		forEachMetot(list);

		System.out.println("\nİterative for");
		forIterative(list);

		System.out.println("\niterator for");
		list.remove(list.get(list.size() - 1));
		forIterator(list);

		/*
		 * int sayi1, sayi2, sayi3, sayi4, sayi5;
		 * System.out.println("Lütfen 1 sayı giriniz."); sayi1 = klavye.nextInt();
		 * System.out.println("Lütfen 2.sayı giriniz."); sayi2 = klavye.nextInt();
		 * System.out.println("Lütfen 3.sayı giriniz."); sayi3 = klavye.nextInt();
		 * System.out.println("Lütfen 4.sayı giriniz."); sayi4 = klavye.nextInt();
		 * System.out.println("Lütfen 5.sayı giriniz."); sayi5 = klavye.nextInt();
		 */

	}

	public void forEachMetot2(List<Integer> list) {
		for (int temp : list) {
			System.out.print(temp);
		}
	}

	public static void forEachMetot(List<Integer> list) {
		for (int temp : list) {
			System.out.print(temp);
		}
	}

	public static void forIterative(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}

	public static void forIterator(List<Integer> list) {
		Iterator ite = list.iterator();
		while (ite.hasNext()) {
			System.out.print(ite.next());
		}
	}
}
