package com.ecodation.ornek.interfaces;

import java.io.Serializable;

public class IsGorusmesi implements IEImza, Serializable {
	private static final long serialVersionUID = 8036782813545024595L;

	@Override
	public void mulakatSorulari() {
		System.out.println("iş mülakat");

	}

	@Override
	public void cv() {
		System.out.println("iş cv");

	}

	@Override
	public void sirketSitesi(String url) {
		System.out.println("iş sayfası");

	}

	@Override
	public int sonuc() {
		System.out.println("iş sonuç");
		return 0;
	}

	@Override
	public int maas(double maas) {
		System.out.println("iş maaş");
		return 0;
	}

}
