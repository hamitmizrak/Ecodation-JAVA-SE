package com.ecodation.ornek.bolum010.list;

import java.util.ArrayList;
import java.util.List;

public class ListsubListOrnegi {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hamit");
		list.add("Mızrak");
		list.add("Ecodation");
		list.add("Java SE");
		list.add("Java EE");

		// istediğimiz String arasındaki
		System.out.println(list.subList(0, 5)); // 0<=x<1

	}
}
