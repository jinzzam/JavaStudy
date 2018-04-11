package com.youjin.thread;

public class Ex8_1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
			for (int x = 0; x < 100000; x++)
				;
		}
	}
}
