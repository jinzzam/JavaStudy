package com.youjin.anonymous;

public class PersonTest {

	public static void main(String[] args) {
		
		//익명 클래스
		Person youjin = new Person() {
			@Override
			public void run() {
				System.out.println("헛둘헛둘 뛰자");
			}

			@Override
			public void sleep() {
				System.out.println("잘자");
			}

			@Override
			public void eat() {
				System.out.println("냠냠냠냠");
			}
		
		};
		youjin.run();
		youjin.eatChicken();
		Person.breath();

	}
}

//익명 클래스 = 상속 + 내부클래스

//단 한 번 밖에 쓰이지 않을 클래스를 여러 개 만들기보다
//익명 클래스 문법을 이용하자
//익명 클래스는 재활용이 불가능하며 코드가 조금 지저분해진다
