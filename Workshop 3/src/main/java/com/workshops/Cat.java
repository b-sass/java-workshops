package com.workshops;

public class Cat {
	private String name;
	private int age;

	public Cat() {
		setAge(0);
		setName("");
	}

	public Cat(int age, String name) {
		setAge(age);
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = Math.max(0, age);
	}

	public void makeSpeak() {
		System.out.println("Meow");
	}

	public boolean isAdult() {
		return getAge() > 1;
	}
}
