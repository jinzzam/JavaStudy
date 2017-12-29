package com.youjin.polymorphism;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe; // car = (Car)fe; 에서 형변환 생략 //업캐스팅
//		car.water(); //Car타입의 참조변수로는 water()함수를 호출할 수 없다.
		fe2 = (FireEngine) car; // 자손타입 <- 조상타입
		fe2.water();
	}

}
