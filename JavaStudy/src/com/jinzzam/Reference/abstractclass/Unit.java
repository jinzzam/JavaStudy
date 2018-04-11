package com.youjin.abstractclass;

abstract public class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		/*현재위치에 정지*/
		System.out.println("현재 위치에 정지.");
	}
}
