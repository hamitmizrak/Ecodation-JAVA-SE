package com.ecodation.ornek.hepsi;

public class Example011_Radar {

	public static void main(String[] args) {
		/*
		 * 
		 * 0<=hiz<=59 Hızınız+ Hızlanın 60<= hiz<=70 Normal 71<=hiz<=80 hizli (288 TL)
		 * hiz>=81 hizli (1200TL
		 * 
		 */

		int hiz = 81;

		if (0 <= hiz && hiz <= 59) {
			System.out.println("hızınız:" + hiz + " Lütfen Biraz hızlanın");
		} else if (60 <= hiz && hiz <= 70) {
			System.out.println("hızınız:" + hiz + " Normal");
		} else if (71 <= hiz && hiz <= 80) {
			System.out.println("hızınız:" + hiz + " 288 TL para cezası");
		} else if (81 <= hiz) {
			System.out.println("hızınız:" + hiz + " 1200 TL para cezası");
		}
	}
}
