package com.youjin.thread;

public class Main {
	public static void main(String []args) {
		Thread threadA = new ThreadA();
		Thread threadB = new ThreadB();
		threadA.start();
		threadB.start();
		for (int i = 0; i < 10000; i++) {
			System.out.print("M");
		}
	}
}
