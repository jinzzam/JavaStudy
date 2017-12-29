package com.youjin.inheritance;

public class Child2 extends Parent{
	int x = 20;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

//x = 이 클래스 변수 x
//this.x = 자손 클래스에 선언된 변수 x
//super.x = 조상 클래스로부터 상속받은 멤버변수 x