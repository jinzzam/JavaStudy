package com.youjin.method;

public class Main {
	public static void main(String[] args) {
		MathCallMethod mcm = new MathCallMethod();
		long result1 = mcm.add(5L, 3L);
		long result2 = mcm.sub(5, 3);
		long result3 = mcm.multiply(2, 4);
		double result4 = mcm.divide(10, 3);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
