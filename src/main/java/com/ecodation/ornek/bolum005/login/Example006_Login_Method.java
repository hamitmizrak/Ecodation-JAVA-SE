package com.ecodation.ornek.bolum005.login;

import java.util.Scanner;

public class Example006_Login_Method {

	public static boolean login() {
		Scanner klavye = new Scanner(System.in);
		String kullaniciAdi, sifre;
		// kullanıcı:admin şifre:123456
		String name, password;
		name = "admin";
		password = "123456";

		int count = 4;
		while (count > 0) {
			System.out.println("Lütfen kullanici adını giriniz");
			kullaniciAdi = klavye.nextLine();
			System.out.println("Lütfen şifre giriniz");
			sifre = klavye.nextLine();
			if (kullaniciAdi.equals(name) && sifre.equals(password)) {
				System.out.println("Şifreniz doğru admin sayfasına yönlendiriliyorsunuz ...");
				return true;
			} else {
				System.out.println("\n");
				System.out.println("kullanıcı adı veya şifreniz yanlış");
				count--;
				System.out.println("kalan hakkınız: " + count);
				if (count <= 0) {
					System.out.println("Kartınız bloke oldu");
					System.exit(0);
				}
				// return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		boolean sonuc = login();
		System.out.println(sonuc);

		if (sonuc) {
			System.out.println();
		}
	}
}
