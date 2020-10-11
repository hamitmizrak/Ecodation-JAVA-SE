package com.ecodation.ornek.interfaces;

public class Universite implements IEImza {

	@Override
	public void mulakatSorulari() {
		System.out.println("üniversite mülakat");

	}

	@Override
	public void cv() {
		System.out.println("üniversite cv");

	}

	@Override
	public void sirketSitesi(String url) {
		System.out.println("üniversite sayfası");

	}

	@Override
	public int sonuc() {
		System.out.println("üniversite sonuç");
		return 0;
	}

	@Override
	public int maas(double maas) {
		System.out.println("üniversite maaş");
		return 0;
	}

}
