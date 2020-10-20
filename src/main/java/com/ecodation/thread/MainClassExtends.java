package com.ecodation.thread;

public class MainClassExtends {

	public static void main(String[] args) throws InterruptedException {
		ThreadExtendsClass t1 = new ThreadExtendsClass("1.thread");
		ThreadExtendsClass t2 = new ThreadExtendsClass("2.thread");
		ThreadExtendsClass t3 = new ThreadExtendsClass("3.thread");

		t1.start();
		t2.start();
		t3.start();

		System.out.println("thread adi: " + t1.getName());
		t1.setName("Ecodation");
		System.out.println("thread adi: " + t1.getName());

		if (t1.isAlive()) {
			System.out.println(t1.getName() + " adlı thread çalışıyor.");
		}

		t1.join();
		t2.join();
		t3.join();

		/*
		 * System.out.println("\nNormal iterative for"); Long basla =
		 * System.currentTimeMillis(); for (int i = 0; i < 5000; i++) {
		 * System.out.println("üst: " + i); }
		 * 
		 * for (int i = 0; i < 5000; i++) { System.out.println("alt:" + i); }
		 * 
		 * Long bitis = System.currentTimeMillis(); System.out.println("iterative time "
		 * + (bitis - basla));
		 */

	}
}
