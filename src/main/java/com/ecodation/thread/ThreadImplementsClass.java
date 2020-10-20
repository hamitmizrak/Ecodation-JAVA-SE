package com.ecodation.thread;

public class ThreadImplementsClass implements Runnable {

	public String threadAdi;

	public String getThreadAdi() {
		return threadAdi;
	}

	public void setThreadAdi(String threadAdi) {
		this.threadAdi = threadAdi;
	}

	public ThreadImplementsClass(String threadAdi) {
		this.threadAdi = threadAdi;
	}

	@Override
	public void run() {
		Long basla = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ".ci Thread Class");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//159 thread
//193 normal

		}
		Long bitis = System.currentTimeMillis();
		System.out.println("thread time:  " + (bitis - basla));
		System.out.println(threadAdi + "thread bitti.");
	}

}
