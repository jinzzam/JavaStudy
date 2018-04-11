package com.youjin.interfaceclass;

public class RepairbleTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		DropShip dropship = new DropShip();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine);		//Marine은 Repairable 인터페이스를 구현하지 않았으므로 수리할 수 없음.
	}
}
