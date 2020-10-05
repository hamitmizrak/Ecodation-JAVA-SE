package com.ecodation.innerclass;

public class MainClass {

	public static void main(String[] args) {

		DisClass dis = new DisClass();
		System.out.println(dis.getName());

		DisClass.icClass ic = dis.new icClass();
		ic.deneme();
	}
}
