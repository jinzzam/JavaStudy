package com.youjin.object;

public class ClassEx1 {

	public static void main(String[] args) throws Exception{
		Card c = new Card("HEART", 3);		//new 연산자로 객체 생성
		Card c2 = Card.class.newInstance();	//Class 객체를 통해서 객체 생성 (예외처리 필요)
		
		Class cObj = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}

}
