package com.youjin.thread;

public class Ex2Run implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()); 	
			//현재 실행중인 thread의 인스턴스를 반환하는 동시에 thread클래스의 메서드인 getName을 실행
		}
	}
}
