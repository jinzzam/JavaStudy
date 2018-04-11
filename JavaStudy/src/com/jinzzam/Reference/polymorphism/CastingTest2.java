package com.youjin.polymorphism;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
//		fe = (FireEngine)car;  
		//다운캐스팅으로 문제없어보이겠지만 
		//car가 참조하고 있는 인스턴스가 Car타입의 인스턴스라는 것이 문제  
		//그래서 실행하면 오류가 남
		fe.drive();
		car2 = fe;
		car.drive();
	}

}
