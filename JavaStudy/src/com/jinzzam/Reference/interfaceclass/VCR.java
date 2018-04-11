package com.youjin.interfaceclass;

public class VCR {
	protected int counter;
	
	public void play() {
		System.out.println("Tape 재생");
	}
	
	public void stop() {
		System.out.println("멈춤");
	}
	
	public void reset() {
		counter = 0;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void setCounter(int c) {
		counter = c;
	}
}
