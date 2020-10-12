package com.ecodation.iofile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterTryWitchResources {

	// static String path = "C:\\2020_Ecodation Java SE\\file\\deneme.txt";
	// static String path = "C:\\2020_Ecodation Java SE\\file\\javase.txt";

	public static void fileCreateDeneme() {
		PathClass path = new PathClass();
		path.setPath("C:\\2020_Ecodation Java SE\\file\\javase44.txt");
		try {
			File file = new File(path.getPath());
			if (file.exists()) {
				System.out.println("Dosya zaten var");
				System.out.println(file.getName());
			} else {
				System.out.println("dosyanız oluşturuldu.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void fileWriterDeneme() {
		PathClass path = new PathClass();
		path.setPath("C:\\2020_Ecodation Java SE\\file\\javase44.txt");
		try (BufferedWriter bW = new BufferedWriter(new FileWriter(path.getPath()))) {
			bW.write("try with resource 444444");
		} catch (Exception e) {
			System.out.println("Yazarken hata geldi.");
		}
	}

	public static void fileReaderDeneme() {
		PathClass path = new PathClass();
		path.setPath("C:\\2020_Ecodation Java SE\\file\\javase.txt");
		try (BufferedReader bR = new BufferedReader(new FileReader(path.getPath()))) {
			String okudum = "", satirlar = "";
			while ((satirlar = bR.readLine()) != null) {
				okudum += satirlar;
			}
			System.out.println(okudum);

		} catch (Exception e) {
			System.out.println("Okuma tamamlanmadı.");
		}
	}

	public static void main(String[] args) {

		fileCreateDeneme();
		fileWriterDeneme();
		fileReaderDeneme();
	}
}
