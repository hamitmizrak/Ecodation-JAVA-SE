package com.ecodation.interfaces;

public interface IEImza {
	// Nesne değişkeni
	public int toplam = 5;

	public void mulakatSorulari();

	public void cv();

	public void sirketSitesi(String url);

	public int sonuc();

	public int maas(double maas);

	// Gövdeli metotlar
	public static void deneme() {
		System.out.println("Gövdeli metot static");
	}

	public default void deneme(int sonuc) {
		System.out.println("Gövdeli metot static");
	}

}
