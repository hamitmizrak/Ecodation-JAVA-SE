package com.ecodation.list.lav;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_001_list {

	/*
	 * list.size(); list.get(i); list.add(); list.remove(); list.clear();
	 * list.contains();
	 * 
	 */
	public static void listOrnegi() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(44);
		list.add(34);
		list.add(41);
		list.remove(2);

		boolean b1 = list.contains(44);
		System.out.println(b1);

		// forEach
		for (int temp : list) {
			System.out.print(temp + " ");
		}

		System.out.println();
		list.clear();
		// for iterative
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");

		}
		System.out.println();

		// iterator
		Iterator ite = list.iterator();
		while (ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}

	}

	public static void main(String[] args) {
		listOrnegi();
	}
}
