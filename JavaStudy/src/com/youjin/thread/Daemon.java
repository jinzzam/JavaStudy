package com.youjin.thread;

public class Daemon implements Runnable {
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new Daemon());	
		t.setDaemon(true); // 쓰레드를 데몬 쓰레드로 변경한다
		//이 부분이 없으면 쓰레드가 종료되지 않는다.
		//setDaemon메서드는 반드시 start()를 호출하기 전에 실행되어야한다.
		//그렇지 않으면 exception이 발생한다.
		t.start();

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(i);

			if (i == 3)
				autoSave = true;
		}
		System.out.println("프로그램을 종료합니다.");
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}

			if (autoSave) {
				autoSave();
			}
		}
	}

	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}
