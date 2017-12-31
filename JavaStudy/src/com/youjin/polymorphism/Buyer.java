package com.youjin.polymorphism;

public class Buyer {	//고객
	int money = 1000;	//소유금액
	int bonusPoint = 0;	//보너스점수
	
	void buy (Product p) {	//다형성을 이용함
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}
