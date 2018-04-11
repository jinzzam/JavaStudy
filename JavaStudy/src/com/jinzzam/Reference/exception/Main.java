package com.youjin.exception;

public class Main {
	public static void main(String[] args) {
		Person p = new Person("youjin");	
			try {
				p.eat("밥");
				p.eat("독");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			p.sleep(25);
	}
}

//eat만 문법적으로 강제되고 sleep은 강제되지 않는다.
//eat은 무조건 try catch 문 사용이 강제
//sleep은 써도 되고 안써도 됨 //특정 상황에서 예외가 발생하는 건 쌤쌤

//문법적으로 강제시키고 싶지 않다면 DeepSleepException 클래스에서 상속받은 
//RuntimeException을 상속받아 사용하면 된다.
//RuntimeException 계열은 Unchecked Exception으로 분류되어서 문법적으로 강제로 체크시키지 않는다.

//문법적으로 강제시키고 싶다면 Exception을 상속받으면 된다.
//Exception 계열은 Checked Exception으로 분류되어서 문법적으로 반드시 예외처리를 해주어야한다.