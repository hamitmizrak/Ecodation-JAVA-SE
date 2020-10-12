package com.ecodation.trycatch;

import java.io.IOException;

public class ThrowsClass {

	public static void deneme() throws IOException, ArithmeticException, NullPointerException {
		int x = 4 / 0;
		System.out.println(x);

	}

	public static void main(String[] args) {

		try {
			deneme();
		} catch (ArithmeticException | NullPointerException | IOException e) {
			e.printStackTrace();
		}
	}
}
