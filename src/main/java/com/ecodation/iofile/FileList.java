package com.ecodation.iofile;

import java.io.File;

public class FileList {
	public static void main(String[] args) {
		String path = "C:\\2020_Ecodation Java SE\\file"; // C:\\2020_Ecodation Java SE\\file\\deneme.txt
		File file44 = new File(path);

		for (String dosyalar : file44.list()) {
			System.out.println(dosyalar);

			if (dosyalar.isEmpty()) {
				System.out.println("boş");
			}
		}

		for (File temp : file44.listFiles()) {
			if (temp.isDirectory()) {
				System.out.println("bu directordir" + temp.getName());
			} else if (temp.isFile()) {
				System.out.println("bu file " + file44.getAbsolutePath());
			}
		}

	}
}
