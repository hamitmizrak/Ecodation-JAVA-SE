package com.ecodation.dongu;

public class Donguler {

	public static void main(String[] args) {
		// for
		for (int i = 0; i <= 5; i = i + 6) {
			System.out.print(i);
		}
		System.out.println();

		// While
		int k = 0;
		while (k <= 3) {
			System.out.println(k);
			k++;
		}

		// do while
		int y = 0;
		do {
			System.out.println("Ne olursa olsun çalışacak");
			y++;
		} while (y <= -1);

	}
}
