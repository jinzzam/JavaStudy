package com.youjin.object;

public class EqualTest {
	public static void main(String[] args) {
		WrapString wstr1 = new WrapString("피카츄");
		WrapString wstr2 = new WrapString("피카츄");
		System.out.println(wstr1 == wstr2);
		//wstr1 과 wstr2는 서로 다른 객체를 가르키고 있으므로 false
		System.out.println(wstr1.equals(wstr2));
		//일반적으로 equals()는 ==와 같은 역할을 함
		
		//WrapString class 에서 equals()를 오버라이딩 한 후에는 내 의도대로
		//false
		//true
		//가 순서대로 출력됨
	}
}
