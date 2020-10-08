package com.ecodation.inner;

public class AnonymousInnerClass {
	public static void main(String[] args) {

		IAnonymousClass anonymous = new IAnonymousClass() {

			@Override
			public void kapiKapat() {
				System.out.println("Kapi kapat ");

			}

			@Override
			public void kapiAc() {
				System.out.println("Kapi aç");

			}
		};

		anonymous.kapiAc();
		anonymous.kapiKapat();

	}

	public interface IAnonymousClass {
		void kapiAc();

		void kapiKapat();
	}

}
