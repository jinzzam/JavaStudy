package com.youjin.innerclass;

public class Outter {
	public int i;
	public class Inner{
		void print() {
			System.out.println("Inner class");
		}
	}
	
	public void method() {
		System.out.println("Outter method");
	}
}
