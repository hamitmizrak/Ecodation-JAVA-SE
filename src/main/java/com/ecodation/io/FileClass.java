package com.ecodation.io;

import java.io.File;
import java.net.MalformedURLException;

public class FileClass {

	public static void main(String[] args) {
		String path = "C:\\2020_Ecodation Java SE\\file\\deneme.txt";
		File file34 = new File(path);

		System.out.println("çalışabiliyor musun ? " + file34.canExecute());
		System.out.println("okunabilinir mi ? " + file34.canRead());
		System.out.println("yazabiliyor musun ? " + file34.canWrite());
		System.out.println("-----------------");
		System.out.println("tam yolu: " + file34.getAbsoluteFile());
		System.out.println("adı: " + file34.getName());
		System.out.println("parent: " + file34.getParent());
		System.out.println("---------------------");
		System.out.println("Directory mi :" + file34.isDirectory());
		System.out.println("file mi: " + file34.isFile());
		boolean dizinMi = file34.isFile();
		if (dizinMi) {
			System.out.println("Evet bu dizindir");
		} else {
			System.out.println("değildir.");
		}

		System.out.println("gizli mi: " + file34.isHidden());
		System.out.println("total space: " + file34.getTotalSpace());
		System.out.println("modified: " + file34.lastModified()); // 1602501536009

		System.out.println("----------------------------");
		System.out.println("length: " + file34.length());
		try {
			System.out.println(file34.toURL());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(file34.separator);

	}

}
