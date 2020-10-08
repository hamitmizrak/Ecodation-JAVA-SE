package com.ecodation.enums;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * switch (2) { case 1: System.out.println(Aylar.mayis); break;
		 * 
		 * case 2: System.out.println(Gunler.cuma); break;
		 * 
		 * default: System.out.println("farklı bir alan giriniz"); break; }
		 */

		Aylar aylar = Aylar.subat;
		System.out.println(aylar.getKey());
		System.out.println(aylar.ordinal());

		/*
		 * 
		 * System.out.println(Aylar.haziran.getKey());
		 * System.out.println(Aylar.haziran.ordinal());
		 * 
		 */
	}

}
