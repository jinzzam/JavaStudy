package com.youjin.polymorphism;

public class Buyer {	//고객
	int money = 1000;	//소유금액
	int bonusPoint = 0;	//보너스점수
	Product[] item = new Product[10];
	int i = 0;
	
	void buy (Product p) {	//다형성을 이용함
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;	//제품을 Product[] item에 저장
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {	//구매한 물품에 대한 정보를 요약해서 보여줌
		int sum = 0;	//구입한 물품의 가격 합계
		String itemList = "";
		
		for(int i=0;i<item.length;i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}
