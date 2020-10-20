package com.ecodation.thread;

public class Synchronized_Wait_Notify {
	public static void main(String[] args) throws InterruptedException {
		Object o2 = new Object();
		Integer i2 = new Integer(5);
		int i5;
		synchronized (o2) {
			o2.wait(); // bekle uyuma moduna geçiyor.
			o2.notify(); // artık kalkabilirsin
			o2.notifyAll(); // bütün yatanları kaldır.

			i2.wait();
			i2.notify();

			// i5.wait(); kullanamazsın

		}
		// o2.wait( );
		// o2.notify();
		// o2.notifyAll();
	}
}
