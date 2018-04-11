package com.youjin.polymorphism;

public class Tv extends Product{
	Tv(){
		super(100); //조상 클래스의 생성자 product(int price)를 호출하여 Tv의 가격은 100만원으로 함
	}
	
	public String toString() {
		return "Tv";
	}
}
