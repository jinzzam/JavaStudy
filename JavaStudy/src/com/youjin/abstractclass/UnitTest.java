package com.youjin.abstractclass;

public class UnitTest {

	public static void main(String[] args) {
		Unit[] group = new Unit[4];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new DropShip();
		group[3] = new Marine();
		
		for(int i=0;i<group.length;i++) {
			group[i].move(300, 200);
			System.out.println(i + "번째 : " + group[i].x + ", " + group[i].y);
		}
	}

}
