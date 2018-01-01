package com.youjin.object;

public class HashCodeTest {
	public static void main(String[] args) {
		WrapString wstr1 = new WrapString("피카피카");
		WrapString wstr2 = new WrapString("피카피카");
		WrapString wstr3 = wstr1;
		System.out.println(wstr1.hashCode());
		System.out.println(wstr2.hashCode());
		System.out.println(wstr3.hashCode());
		
		//wstr1과 wstr3은 같은 값이 나온다.
		//서로 같은 인스턴스이기 때문이다.
	}
}
//해시값을 이용한 색인 등을 사용할 때 이용