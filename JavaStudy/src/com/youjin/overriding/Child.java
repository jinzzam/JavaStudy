package com.youjin.overriding;

public class Child extends Parent {
	void ParentMethod() {}	//오버라이딩
	void ParentMethod(int i) {}	//오버로딩
	
	void ChildMethod() {}
	void ChildMethod(int d) {} //오버라이딩
//	void ChildMethod() {}	//에러 !! 중복 정의되었음
}


//오버로딩 (overloading) : 기본에 없는 새로운 메서드를 정의하는 것 (new)
//오버라이딩(overriding) : 상속받은 메서드의 내용을 변경하는 것 (change, modify)