package com.youjin.thread3;

public class PollingPlace {
	public synchronized void vote(String name) {
		System.out.println("Enter : " + name);
		try {
			Thread.sleep(3000);
			System.out.println(name + "doing vote");
			Thread.sleep(3000);
			System.out.println(name + "complete vote");
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
