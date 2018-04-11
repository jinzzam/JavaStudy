package com.youjin.object;

public class People {
	String name;
	int age;
	String phone;
	
	public People(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
}
