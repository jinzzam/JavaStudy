package com.youjin.thread2;
public class ThreadA extends Thread{
	private Data<Integer> data;
	
	public ThreadA(Data<Integer> data) {
		this.data = data;
	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			data.setData(data.getData()+i);
			System.out.println("A : " + data.getData());
		}
	}
	
}
