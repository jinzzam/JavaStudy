package com.youjin.thread;

public class Ex8 {
	public static void main(String[] args) {
		Ex8_1 th1 = new Ex8_1();
		Ex8_2 th2 = new Ex8_2();
		
		th2.setPriority(7);
		
		System.out.println("th1 : " + th1.getPriority());
		System.out.println("th2 : " + th2.getPriority());
		
		th1.start();
		th2.start();
	}
}
