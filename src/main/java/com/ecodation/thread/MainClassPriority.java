package com.ecodation.thread;

public class MainClassPriority {
	public static void main(String[] args) {
		ThreadExtendsClass t1 = new ThreadExtendsClass("1.thread");
		ThreadExtendsClass t2 = new ThreadExtendsClass("2.thread");
		ThreadExtendsClass t3 = new ThreadExtendsClass("3.thread");

		// t1.setPriority(Thread.MAX_PRIORITY);
		// t2.setPriority(Thread.MIN_PRIORITY);
		// t3.setPriority(Thread.NORM_PRIORITY);

		t1.setPriority(1);
		t2.setPriority(2);
		t3.setPriority(3);

		/*
		 * thread1.setPriority(Thread.MIN_PRIORITY); //file işlemlerinde
		 * thread3.setPriority(Thread.MAX_PRIORITY);
		 * thread2.setPriority(Thread.NORM_PRIORITY);
		 */

		t1.start();
		t2.start();
		t3.start();

	}
}
