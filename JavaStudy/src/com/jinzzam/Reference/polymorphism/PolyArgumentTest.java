package com.youjin.polymorphism;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());	//b.buy(product p);
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}
}
