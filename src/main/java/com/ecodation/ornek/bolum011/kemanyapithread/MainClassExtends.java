package com.ecodation.ornek.bolum011.kemanyapithread;

public class MainClassExtends {

	public static void main(String[] args) throws InterruptedException {

		ViolinExtends yay = new ViolinExtends("yay");

		ViolinExtends on = new ViolinExtends("onPanel");

		ViolinExtends yan = new ViolinExtends("yanPanel");

		ViolinExtends arka = new ViolinExtends("arkaPanel");

		ViolinExtends kopru = new ViolinExtends("kopru");

		ViolinExtends diger = new ViolinExtends("diger");
		// System.out.print("yay:");
		// System.out.print("ön panel:");

		yay.start();
		System.out.print("yay:");
		yay.join();

		on.start();
		System.out.print("ön panel:");
		on.join();
		yan.start();
		System.out.print("yan panel:");
		yan.join();
		arka.start();
		System.out.print("arka panel:");
		arka.join();

		kopru.start();
		System.out.print("köprü:");
		kopru.join();

		diger.start();
		System.out.print("diğer:");
		diger.join();

	}

}
