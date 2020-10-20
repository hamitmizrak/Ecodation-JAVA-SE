package com.ecodation.thread;

public class ThreadMethod {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(i);
				}
				System.out.println();

			}
		});

		t1.start();

	}
}
