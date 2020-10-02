package com.ecodation.examples;

import java.util.Scanner;

public class Example010_Ideal {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		String cinsiyet;
		double boy, erkekIdeal, bayanIdeal, agirlik, vucutKitle, vucutYuzey;

		System.out.println("Cinsiyetiniz E/B");
		cinsiyet = klavye.nextLine();

		System.out.println("boyunuz");
		boy = klavye.nextDouble();

		System.out.println("ağırlığınız");
		agirlik = klavye.nextDouble();

		if (cinsiyet.equals("e") || cinsiyet.equals("E")) {
			// Erkekler için ideal kilo hesaplama formülü ise bu şekildedir. 50 + 2,3 X (
			// (Boy(cm)/2,54) – 60)

			erkekIdeal = Math.abs(50 + 2.3 * ((boy / 2.54) - 60));
			System.out.println("Erkek ideal kilo:" + erkekIdeal);
			System.out.println("Fazlalığınız:" + (agirlik - erkekIdeal));
		} else if (cinsiyet.equals("b") || cinsiyet.equals("B")) {
			// Kadınlar için ideal kilo hesaplama formülü yandaki gibidir. 45,5 + 2,3 x (
			// (Boy(cm)/2,54) – 60)
			bayanIdeal = Math.abs(45.5 + 2.3 * ((boy / 2.54) - 60));
			System.out.println("Bayan ideal kilo:" + bayanIdeal);
			System.out.println("Fazlalığınız:" + (agirlik - bayanIdeal));

		}

		/*
		 * 
		 * Vücut Kitle İndeksi (BMI): BMI = Ağırlık (kg) / Boy (m) 2
		 * 
		 * Vücut Yüzey Alanı (DuBois ve DuBois Formülü): BSA = 0.007184 x Yükseklik
		 * (cm) 0.725 x ağırlık (kg) 425
		 * 
		 * 
		 */
		vucutKitle = agirlik / boy;
		System.out.println("Vücut Kitle:" + vucutKitle);

	}
}
