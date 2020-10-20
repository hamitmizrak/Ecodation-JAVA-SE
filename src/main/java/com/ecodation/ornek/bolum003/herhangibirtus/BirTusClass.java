package com.ecodation.ornek.bolum003.herhangibirtus;

import java.util.Scanner;

public class BirTusClass {

	public static void birTus() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen herhangi bir tuşa basınız");
		klavye.hasNextLine();
		System.out.println("Devam ediyor.");
	}

	public static void main(String[] args) {
		birTus();
	}
}
