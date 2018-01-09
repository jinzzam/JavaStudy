package com.youjin.thread;

public class Ex7_1 extends Thread{
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
