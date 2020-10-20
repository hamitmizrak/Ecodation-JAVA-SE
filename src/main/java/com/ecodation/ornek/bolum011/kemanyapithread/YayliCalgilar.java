package com.ecodation.ornek.bolum011.kemanyapithread;

import java.io.Serializable;

public abstract class YayliCalgilar implements Serializable {
	private static final long serialVersionUID = -8793265559806160107L;

	private String yayliCalgi;

	public YayliCalgilar() {

	}

	public YayliCalgilar(String yaylicailgiAdi) {
		super();
		this.yayliCalgi = yaylicailgiAdi;
	}

	public String getYaylicailgiAdi() {
		return yayliCalgi;
	}

	public void setYaylicailgiAdi(String yaylicailgiAdi) {
		this.yayliCalgi = yaylicailgiAdi;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
