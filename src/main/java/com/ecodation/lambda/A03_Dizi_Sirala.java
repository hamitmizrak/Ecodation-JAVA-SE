package com.ecodation.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A03_Dizi_Sirala {

	public static void main(String[] args) {
		int[] dizi = { 21, 44, 96, 30, 78 };
		System.out.println("Statik dizi sıralama");
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
		System.out.println("\n-----------");

		Arrays.sort(dizi);

		for (int temp : dizi) {
			System.out.print(temp + " ");
		}

		System.out.println("\n-----------");
		System.out.println("Dinamik dizi sıralama");
		List<Integer> listDizi = new ArrayList<Integer>();
		listDizi.add(90);
		listDizi.add(99);
		listDizi.add(93);
		listDizi.add(96);

		for (int tempDinamik : listDizi) {
			System.out.print(tempDinamik + " ");
		}

		System.out.println("\n++++++++++++++");
		Collections.sort(listDizi);

		for (int tempDinamik : listDizi) {
			System.out.print(tempDinamik + " ");
		}

	}
}
