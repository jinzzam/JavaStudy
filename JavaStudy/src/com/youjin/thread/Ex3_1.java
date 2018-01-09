package com.youjin.thread;

public class Ex3_1 {
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
