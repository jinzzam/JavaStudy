package com.youjin.polymorphism;

//참조변수와 인스턴스의 연결

//메서드 : 조상클래스의 메서드를 자손의 클래스에서 오버라이딩한 경우에도 참조변수의 타입에 관계없이 항상 실제 인스턴스의 메서드가 호출된다
//멤버변수 : 참조변수의 타입에 따라 달라진다!!!

public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}




//타입은 다르지만 참조변수 p와 c 모두 Child 인스턴스를 참조하고 있다.
//Parent class, Child class 는 서로 같은 멤버들을 정의하고 있다.
//메서드 method() : 참조변수의 타입에 관계없이 항상 실제 인스턴스의 타입인 Child 클래스에 정의된 메서드 호출.
//인스턴스 변수 x : 참조변수의 타입에 따라 달라짐.