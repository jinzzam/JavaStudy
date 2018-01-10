package com.youjin.thread;

public class Ex13 extends Thread {
	public void run() {
		int i = 10;

		while (i != 0 && !isInterrupted()) {
			System.out.println(i--);
			for (long x = 0; x < 2500000000L; x++)
				; // 시간 지연
		}

		System.out.println("카운트가 종료되었습니다.");
	}
}
