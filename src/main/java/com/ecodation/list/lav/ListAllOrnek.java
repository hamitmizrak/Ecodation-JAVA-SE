package com.ecodation.list.lav;

import java.util.ArrayList;
import java.util.List;

public class ListAllOrnek {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		String database = "dsfsdfsdf sdfsdfsfd";
		String[] dizi = kelime.split();
		list.add("Malatya");
		list.add("Elazığ");
		list.add("Nevşehir");

		List<String> list2 = new ArrayList<String>();
		list2.add("Melekbaba");
		list2.add("Taştepe");
		list2.add("Çöşnük");
		list2.add("Ecodation");

		System.out.println("-------------------");
		list.addAll(list2);
		for (String list21 : list) {
			System.out.println(list21);
		}
	}

}
