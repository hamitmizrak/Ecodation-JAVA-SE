package com.ecodation.methods;

public class MethodsTutorials {

	public static void metotAdi() {
		System.out.println("Merhabalar ben metottan geldim");
	}

	// Overloadind
	public static void denemeMethod() {
		System.out.println("parametresiz :");
	}

	public static void denemeMethod(String str) {
		str = "Hamit Mızrak";
		System.out.println("Ad Soyad :" + str);
	}

	public static void denemeMethod(String str, int yas) {
		str = "Hamit Mızrak";
		yas = 34;
		System.out.println("Ad Soyad :" + str + " Yaş: " + yas);
	}

	public static String denemeVoidsiz() {
		System.out.println("voidsiz");

		String teknolojiler = "JSF";
		return teknolojiler;

	}

	@Deprecated
	public static void deneme44() {
		System.out.println("deneme44");

	}

	public static String denemeVoidsiz(int diploma) {
		// diploma = 4;
		String str6 = Integer.toString(diploma);

		return str6;

		// Vallahi Java By pass value

	}

	// overloading: sadece parametreleri farklı olmalı.
	public static void main(String[] args) {
		// metotAdi();
		// MethodsTutorials ecodation = new MethodsTutorials();
		// ecodation.metotAdi();

		// String kelime = "44";
		// denemeMethod();
		// denemeMethod(kelime);
		// denemeMethod(kelime, 34);

		// String str5 = denemeVoidsiz();
		// System.out.println(str5);

		String sonuc = denemeVoidsiz(88);
		System.out.println(sonuc);

		denemeVoidsiz();

		deneme44();

	}

}
