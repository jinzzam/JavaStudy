package com.youjin.parameter;

public class Array {
	public static void main(String[] args) {
		int[] x = {10};
		System.out.println("main : " + x[0]);
		
		change(x);
		System.out.println("After change ");
		System.out.println("main : " + x[0]);
	}
	static void change(int[] x) {
		x[0] = 1000;
		System.out.println("change : " + x[0]);
	}
}
