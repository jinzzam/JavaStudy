package com.youjin.interfaceclass;

public class A2 {
	void methodA() {
		I2 i = InstanceManager.getInstance();	//인스턴스를 직접 생성하지 않고 getInstance()라는 메서드를 통해 제공받는다
		i.methodB();
		System.out.println(i.toString());
	}
}

//이렇게 하면 나중에 다른 클래스의 인스턴스로 변경되어도 A클래스의 변경 없이 getInstance()만 변경하면 된다는 장점이 있다.