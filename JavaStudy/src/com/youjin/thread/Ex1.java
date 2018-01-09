package com.youjin.thread;

public class Ex1 {

	public static void main(String[] args) {
		Ex1Thread t1 = new Ex1Thread();
		
		Runnable r = new Ex2Run();
		Thread t2 = new Thread(r);	//생성자 thread (runnable target)
		
		t1.start();
		t2.start();
	}

}
