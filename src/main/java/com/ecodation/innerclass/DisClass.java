package com.ecodation.innerclass;

public class DisClass {

	private String name = "";
	private String surname = "";

	static int deger = 25;
	int deger2 = 50;
	private int deger3;

	public DisClass() {
	}

	public DisClass(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	// iç class
	class icClass {

		public void deneme() {
			System.out.println(deger2);
		}

		private int age;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	}
}
