package com.youjin.thread;

public class Ex1 {

	public static void main(String[] args) {
		Ex1Thread t1 = new Ex1Thread();	//Thread를 상속받은 클래스의 인스턴스를 생성
		
		Runnable r = new Ex2Run();	//Runnable을 구현한 클래스의 인스턴스를 생성
		Thread t2 = new Thread(r);	//생성자 thread (runnable target)
		
		t1.start();
		t2.start();
	}

}
