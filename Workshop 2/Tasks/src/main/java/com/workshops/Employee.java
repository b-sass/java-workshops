package com.workshops;

public class Employee {
	String id;
	String name;
	int age;
	double salary;

	public Employee(String id, String name, int age, double salary) {
		setId(id);
		setName(name);
		setAge(age);
		setSalary(salary);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		String out = "ID: %s, Name: %s, Age: %d, Salary: %f\n";
		return String.format(out, this.id, this.name, this.age, this.salary);
	}
}
