package com.ecodation.list.lav;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListTekrar {

	public static void main(String[] args) {
		// L A V
		List<Double> liste = new ArrayList<Double>();
		liste.add(34.44);
		liste.add(41.0);

		for (double temp : liste) {
			System.out.println(temp + " ");
		}
		/*
		 * Iterator ite = liste.iterator(); while (ite.hasNext()) {
		 * System.out.println(ite.next()); }
		 */

		// liste.add(); liste.remove(); liste.clear(); liste.size(); liste.get();
		System.out.println();
		Vector<Integer> v2 = new Vector<Integer>(7, 12); // 7 +12 +12+12
		v2.add(10);
		v2.add(20);

		for (int temp : v2) {
			System.out.println(temp + " ");
		}

	}
}
