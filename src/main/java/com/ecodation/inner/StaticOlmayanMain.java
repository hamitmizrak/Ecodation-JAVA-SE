package com.ecodation.inner;

public class StaticOlmayanMain {
	public static void main(String[] args) {
		StaticOlmayanInnerClass.icClass1 ic = new StaticOlmayanInnerClass().new icClass1();
		StaticOlmayanInnerClass.icClass1.icClass2 ic2 = new StaticOlmayanInnerClass().new icClass1().new icClass2();
	}
}
