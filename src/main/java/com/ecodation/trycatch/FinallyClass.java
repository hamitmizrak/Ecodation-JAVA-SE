package com.ecodation.trycatch;

public class FinallyClass {

	public static void main(String[] args) {
		try {
			int a = 4 / 0;
			System.out.println(a);

		} catch (Exception e) {
			// e.printStackTrace();
			// System.out.println("Hata oluştu: !!!! "+e);
			throw (e); // buradan sonra sadece finally çalışacak 4 ile 6 toplanmayacak.
		} finally {
			System.out.println("Burası kesin çalışacak");
			// connection.close();
		}
		System.out.println("toplam: " + (4 + 6));
	}
}
