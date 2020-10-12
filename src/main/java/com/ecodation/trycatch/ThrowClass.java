package com.ecodation.trycatch;

public class ThrowClass {

	public static void main(String[] args) {

		int sonuc = 5 / 0;
		throw new ArithmeticException("Sayıyı sıfıra bölemezsin.");
		// System.out.println();

	}
}
