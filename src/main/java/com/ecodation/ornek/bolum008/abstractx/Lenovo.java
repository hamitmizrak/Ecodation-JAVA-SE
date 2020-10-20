package com.ecodation.ornek.bolum008.abstractx;

public class Lenovo extends AbstractClass {
	private static final long serialVersionUID = -2652367152084478081L;

	@Override
	public void bilgisayarPerformans() {
		System.out.println("Lenovo metodu");

	}

	@Override
	public String bilgisayarMiktar(double fiyat) {
		// fiyat = 6000;
		String strLenovo = String.valueOf(fiyat);
		return strLenovo;
	}

}
