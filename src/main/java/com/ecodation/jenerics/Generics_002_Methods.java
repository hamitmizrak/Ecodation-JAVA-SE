package com.ecodation.jenerics;

public class Generics_002_Methods {

	public static <T> void deneme(T t) {

		System.out.println(t);
	}

	public <A> void multi(A a1, A a2, A a3) {
		System.out.println((double) (a1) + (double) (a2) + (double) (a3));
	}

	public static void main(String[] args) {
		deneme("merhabalar Güzel insanlar");

		Generics_002_Methods j2 = new Generics_002_Methods();
		j2.multi(5.5, 4.4, 3.3);

	}

}
