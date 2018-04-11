package com.youjin.polymorphism;

public class CastingTest2modify {

	public static void main(String[] args) {
		Car car = new FireEngine();		//조상<-자손
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;  
		fe.drive();
		car2 = fe;
		car.drive();
	}
}
