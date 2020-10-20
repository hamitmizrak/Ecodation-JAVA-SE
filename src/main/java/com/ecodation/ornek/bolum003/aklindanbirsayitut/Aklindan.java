package com.ecodation.ornek.bolum003.aklindanbirsayitut;

import java.util.Scanner;

public class Aklindan {
	public void akil() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Aklınızdan 1 ile 100 arasında bir sayı tutun\n");
		System.out.println("Tuttuğunuz sayıyı giriniz...");
		int sayi, sayi2;
		sayi = klavye.nextInt();
		System.out.println("şimdi bu adımları yapın\n");
		System.out.println("tuttuğunuz sayıyı 2 ile çarpın");
		System.out.println("sonuca 22 ile toplayın");
		System.out.println("sonucu 2 ile bölelim");
		System.out.println("Şimdi aklından ilk tuttuğun sayıyı, sonuctan çıkarın\n");
		System.out.println("sonucu görmek için klavyeden herhangi bir sayı giriniz");
		// klavye.nextLine();
		sayi2 = Math.abs(klavye.nextInt());
		while (sayi2 >= 0) {
			int sonuc = (((sayi * 2) + 22) / 2) - sayi;
			System.out.println("sonucunuz: " + sonuc);
			break;
		}
	}
}
