package com.youjin.interfaceclass;

public class A {
	void autoPlay(I i) {
		i.play();
	}
}

//A클래스를 작성하는데 B클래스가 관련되지 않았다.
//매개변수를 통해 인터페이스를 동적으로 제공받을 수 있다.