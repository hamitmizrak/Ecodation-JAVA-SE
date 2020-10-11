package com.ecodation.map;

import java.util.HashMap;
import java.util.Map;

public class MapList {

	public static void main(String[] args) {
		// H H L T
		Map<Integer, String> mapList = new HashMap<Integer, String>();
		mapList.put(1, "Köfte");
		mapList.put(2, "Adana");

		// Key
		for (int anahtar : mapList.keySet()) {
			System.out.print(anahtar + " -");
		}
		System.out.println("\n--------------");
		// Value
		for (String deger : mapList.values()) {
			System.out.print(deger + " ");
		}

		// key-value
		for (int anahtar : mapList.keySet()) {
			String sonuc = mapList.get(anahtar);
			System.out.println(sonuc);
		}

	}
}
