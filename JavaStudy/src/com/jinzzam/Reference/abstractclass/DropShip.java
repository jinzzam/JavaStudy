package com.youjin.abstractclass;

public class DropShip extends Unit{
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void load() {
		System.out.println("선택된 대상 태우기");
	}
	
	void unload() {
		System.out.println("선택된 대상 내리기");
	}
}
