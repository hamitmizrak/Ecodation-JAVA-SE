package com.ecodation.trycatch;

public class TryCatch {

	public static void mail() {
		System.out.println("mail gönderildi.");
	}

	public static void main(String[] args) {

		try {
			int x = 5;
			int y = 0;
			int sonuc = x / y;
			System.out.println(sonuc);

		} catch (ArithmeticException ar) {
			System.err.println("sıfıra böldünüz.");
			// System.out.println(ar.getLocalizedMessage());
			// System.out.println(ar.getMessage());
			// System.out.println(ar.getStackTrace());
			// ar.printStackTrace();
			// mail();
			throw (ar);

		} catch (Exception e) {
			System.out.println("Genel istisnalar");
		}

		System.out.println("devam ediyor......");

	}
}
