package com.ecodation.ornek.hepsi;

import java.util.Scanner;

public class Example001_Console_Dizi_Boyut {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int satir, sutun;
		String sembol;
		System.out.println("lütfen sembol giriniz");
		sembol = klavye.nextLine();

		System.out.println("lütfen satır için sayı giriniz.");
		satir = klavye.nextInt();

		System.out.println("lütfen sutun için sayı giriniz.");
		sutun = klavye.nextInt();
		System.out.println(" girdiğiniz satır:" + satir + " girdiğiniz sutun: " + sutun);

		int[][] matrix = new int[satir][sutun];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] = Integer.valueOf(sembol));
			}
			System.out.println();
		}
	}

}
