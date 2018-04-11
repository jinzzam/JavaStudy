package com.youjin.interfaceclass;

public class Jin implements Person{
	public void run() {
		System.out.println("달려라 하니!!");
	}
	
	public void sleep() {
		System.out.println("쿨쿨 자는중zzZ");
	}
	
	public void eat() {
		System.out.println("와구와구 먹는다");
	}
	
	public static void main(String[] args) {
		Jin youjin = new Jin();
		System.out.println("나는 지금...?");
		youjin.eatChicken();
		youjin.eat();
		youjin.sleep();
		youjin.run();
	}
}
