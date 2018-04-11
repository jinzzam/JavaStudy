package com.youjin.thread;

public class Ex2_1 extends Thread{
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
