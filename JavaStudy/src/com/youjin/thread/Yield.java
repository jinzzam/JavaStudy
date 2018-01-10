package com.youjin.thread;

public class Yield {

	public static void main(String[] args) {
		Ex18 th1 = new Ex18("*");
		Ex18 th2 = new Ex18("**");
		Ex18 th3 = new Ex18("***");

		th1.start();
		th2.start();
		th3.start();

		try {
			Thread.sleep(1000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {

		}
	}

}
