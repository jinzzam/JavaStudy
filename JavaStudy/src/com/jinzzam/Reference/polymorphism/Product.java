package com.youjin.polymorphism;

public class Product {
	int price;
	int bonusPoint;
	
	Product (int price){
		this.price = price;
		bonusPoint = (int) (price/10.0);
	}
}
