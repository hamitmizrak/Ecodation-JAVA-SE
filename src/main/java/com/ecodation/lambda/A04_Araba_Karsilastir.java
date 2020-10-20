package com.ecodation.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A04_Araba_Karsilastir {

	public static void main(String[] args) {
		Araba mercedes = new Araba("Mercedes", 2000);
		Araba bmw = new Araba("BMW", 2010);

		List<Araba> arabaList = new ArrayList<Araba>();
		arabaList.add(mercedes);
		arabaList.add(bmw);

		for (Object tmp : arabaList) {
			System.out.println(tmp);
		}
		Collections.sort(arabaList);
		System.out.println("\n+++++++++++");

		for (Object tmp : arabaList) {
			System.out.println(tmp);
		}

	}
}
