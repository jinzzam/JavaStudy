package com.youjin.thread;

public class Ex8_2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
			for (int x = 0; x < 1000000; x++)
				;
		}
	}
}
