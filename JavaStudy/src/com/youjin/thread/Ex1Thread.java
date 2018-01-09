package com.youjin.thread;

public class Ex1Thread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName()); 		//조상인 thread의 getName()호출한것임
		}
	}
}
