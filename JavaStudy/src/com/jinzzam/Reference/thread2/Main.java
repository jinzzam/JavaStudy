package com.youjin.thread2;

public class Main {

	public static void main(String[] args) {
		Data<Integer> data = new Data<>(0);
		Thread threadA = new ThreadA(data);
		Thread threadB = new ThreadB(data);
		threadA.start();
		threadB.start();
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(data.getData());
	}

}
