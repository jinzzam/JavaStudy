package com.youjin.polymorphism;

import java.util.Vector;

public class Buyer {	//고객
	int money = 1000;	//소유금액
	int bonusPoint = 0;	//보너스점수
//	Product[] item = new Product[10];
//	int i = 0;
	Vector item = new Vector();	//구입한 제품을 저장하는데 사용될 Vector 객체
	
	void buy (Product p) {	//다형성을 이용함
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
//		item[i++] = p;	//제품을 Product[] item에 저장
		item.add(p);	//구입한 제품을 Vector에 저장
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void refund(Product p) {	//제품 환불
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		}else {	//제거에 실패한 경우
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {	//구매한 물품에 대한 정보를 요약해서 보여줌
		int sum = 0;	//구입한 물품의 가격 합계
		String itemList = "";
		
/*		for(int i=0;i<item.length;i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}*/
		
		for(int i=0;i<item.size();i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}
