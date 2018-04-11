package com.youjin.interfaceclass;

public class DropShip extends AirUnit implements Repairable{
	DropShip(){
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "DropShip";
	}
}
