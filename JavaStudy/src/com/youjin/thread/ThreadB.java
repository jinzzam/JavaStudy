package com.youjin.thread;

public class ThreadB extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.print("B");
		}
	}

}
