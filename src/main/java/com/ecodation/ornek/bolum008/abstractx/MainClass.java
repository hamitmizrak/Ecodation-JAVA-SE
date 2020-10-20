package com.ecodation.ornek.bolum008.abstractx;

public class MainClass {

	public static void main(String[] args) {

		// AbstractClass abstractClass = new AbstractClass("anaXYZ456", "sesMNK852",
		// "tvTYS85");
		AbstractClass abstractClass = new Lenovo(); // polymorphism
		abstractClass.bilgisayarPerformans(); // bilgisayarOzellikleri();

		String miktar = abstractClass.bilgisayarMiktar(3000);
		System.out.println(miktar);

	}
}
