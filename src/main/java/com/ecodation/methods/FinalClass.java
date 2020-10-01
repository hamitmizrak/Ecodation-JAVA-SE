package com.ecodation.methods;

//Kalıtım yoluyla bunu alamazsın
public final class FinalClass {

	public static void main(String[] args) {
		// Değişkeni değiştiremezsin.
		final double pi = 3.14;
		// pi = 3.44;
		// System.out.println(pi);
		// denemeMethod();

		MethodsTutorials.denemeVoidsiz();
		MethodsTutorials.deneme44();

	}

	// Override edemezsin
	public static final void denemeMethod() {
		System.out.println("deneme methods");
	}
}
