package com.youjin.thread;

public class Ex14 extends Thread {
	public void run() {
		int i = 10;

		while (i != 0 && !isInterrupted()) {
			System.out.println(i--);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				interrupt();
			}
		}

		System.out.println("카운트가 종료되었습니다.");
	}
}
