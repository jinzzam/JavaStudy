package com.youjin.thread;

public class ThreadA extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.print("A");
		}
	}

}
