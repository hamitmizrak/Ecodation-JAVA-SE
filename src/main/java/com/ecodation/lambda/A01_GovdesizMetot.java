package com.ecodation.lambda;

interface IDeneme {
	public String ecodation();
}

public class A01_GovdesizMetot {

	public static void main(String[] args) {
		// Normal anonim interface classım
		IDeneme dene2 = new IDeneme() {

			@Override
			public String ecodation() {
				return "Anonymous inner class";
			}
		};
		System.out.println(dene2.ecodation());

		//////////////////////////////////////////////////

		IDeneme dene3 = () -> {
			return "kısa ve sade";
		};
		System.out.println(dene3.ecodation());

	}

}
