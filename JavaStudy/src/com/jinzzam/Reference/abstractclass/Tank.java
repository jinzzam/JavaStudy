package com.youjin.abstractclass;

public class Tank extends Unit{
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void changeMode() {
		/*공격모드 변환*/
		System.out.println("공격 모드 변환");
	}
}
