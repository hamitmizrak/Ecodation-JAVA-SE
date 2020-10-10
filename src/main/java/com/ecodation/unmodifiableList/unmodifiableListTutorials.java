package com.ecodation.unmodifiableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class unmodifiableListTutorials {
	public static void main(String[] args) {

		List<Integer> liste = new ArrayList<Integer>();
		liste.add(44);
		liste.add(23);
		liste.add(34);
		liste = Collections.unmodifiableList(liste);
		liste.add(21);

		for (Integer temp : liste) {
			System.out.println(temp);
		}
	}
}
