package com.youjin.object;

public class Main {
	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		if(myclass instanceof Object) {
			System.out.println("Object를 상속받음.");
		}
	}
}
