package com.youjin.exception;

public class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	void eat(String food) throws Exception {
		if(food.equals("독")) {
			throw new EatPoisonException();
		}		
		System.out.println(food + "를 먹고 있어요. 냠냠냠");
	}
	
	void sleep(int time) {
		if(time >= 24) {
			throw new DeepSleepException();
		}
		System.out.println(time + "시간 자고 일어납니다.");
	}
}
