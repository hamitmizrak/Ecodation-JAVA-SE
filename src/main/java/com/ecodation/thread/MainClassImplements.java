package com.ecodation.thread;

public class MainClassImplements {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new ThreadImplementsClass("Ecodation"));
		t1.start();
		t1.join(); // bu thread bitmeden alta geçemezsin

		t1.isAlive(); // bu tread yaşıyoru mu
		t1.getName(); // adı
		t1.setName("yeni thread"); // thread adını değiştirmek

		System.out.println(t1.isAlive());
		System.out.println(t1.getName());
		System.out.println(t1.getId());
	}

}
