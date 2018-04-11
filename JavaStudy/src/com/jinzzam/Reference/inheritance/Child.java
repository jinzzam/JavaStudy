package com.youjin.inheritance;

public class Child extends Parent {
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

//결과 : x, this.x, super.x 모두 같은 변수를 의미하므로 모두 같은 10이 출력된다.

//super는 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조 변수이다.
//super 역시 static 메서드에서는 사용할 수 없고 인스턴트 메서드에서만 사용할 수 있다.