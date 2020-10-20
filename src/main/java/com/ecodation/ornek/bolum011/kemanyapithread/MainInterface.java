package com.ecodation.ornek.bolum011.kemanyapithread;

public class MainInterface {
	public static void main(String[] args) throws InterruptedException {

		Thread yay = new Thread(new ViolinImplements("yay"));
		Thread on = new Thread(new ViolinImplements("onPanel"));
		Thread yan = new Thread(new ViolinImplements("yanPanel"));
		Thread arka = new Thread(new ViolinImplements("arkaPanel"));
		Thread kopru = new Thread(new ViolinImplements("kopru"));
		Thread diger = new Thread(new ViolinImplements("diger"));

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
