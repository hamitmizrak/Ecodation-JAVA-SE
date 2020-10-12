package com.ecodation.iofile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
//bW = new BufferedWriter(new FileWriter("C:\\2020_Ecodation Java SE\\file\\deneme.txt"))
	public static void main(String[] args) {
		BufferedWriter bW = null;
		FileWriter fW = null;
		String path = "C:\\2020_Ecodation Java SE\\file\\deneme.txt";

		try {
			fW = new FileWriter(path);
			bW = new BufferedWriter(fW);
			bW.write("deneme444444444");
			int x = 5 / 0;
			System.out.println(x);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (bW != null) {
					bW.close();
					System.out.println("Dosya başarılı bir şekilde ekledi");
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
