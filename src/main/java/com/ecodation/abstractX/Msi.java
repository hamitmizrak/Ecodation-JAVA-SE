package com.ecodation.abstractX;

public class Msi extends AbstractClass {
	private static final long serialVersionUID = 1703051305382088514L;

	public void deneme() {
		Msi msi = new Msi();
		msi.getAnakart();

	}

	@Override
	public void bilgisayarPerformans() {
		System.out.println("Msi methodum");

	}

	@Override
	public String bilgisayarMiktar(double fiyat) {
		fiyat = 17000;
		String strMsi = String.valueOf(fiyat);
		return strMsi;
	}
}
