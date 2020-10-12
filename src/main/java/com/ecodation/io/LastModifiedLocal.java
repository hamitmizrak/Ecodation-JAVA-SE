package com.ecodation.io;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class LastModifiedLocal {

	public static void main(String[] args) {
		String path = "C:\\2020_Ecodation Java SE\\file\\deneme.txt";
		File file = new File(path);

		System.out.println("Değiştirilme zamanı:" + file.lastModified());

		Locale lokal = new Locale("tr", "TR");
		SimpleDateFormat sFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss zzzz", lokal);
		Date date = new Date(file.lastModified());
		String str = sFormat.format(date);
		System.out.println("dosya değişiklik " + str); // son değiştirdiğim tarih milisaniye şimdiki tarih-1970
		
		/*
		 * dosya değişiklik 12 Ekim 2020 14:26:06 Eastern European Time
		 */

	}
}
