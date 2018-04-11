package com.youjin.anonymous;

public interface Person {
	int foot = 2;
	int hand = 2;
	int mouth = 1;
	int eye = 2;
	
	public void run();
	public void sleep();
	public void eat();
	
	static void breath() {
		System.out.println("숨쉬는중");
	}
	
	default void eatChicken() {
		System.out.println("치킨 냠냐미");
	}
}
