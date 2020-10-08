package com.ecodation.inner;

public class StaticOlmayanInnerClass {

	private double sayi = 5;

	class icClass1 {
		double ic1 = sayi;

		public void icMetot() {
			System.out.println(sayi);
		}

		class icClass2 {
			double ic2 = ic1;
		}
	}
}
