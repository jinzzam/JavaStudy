package com.youjin.abstractclass;

public class UnitTest {

	public static void main(String[] args) {
//		Object[] group = new Object[4];		//이렇게 선언하면 14line에서 오류가 난다. //Object클래스에는 Move함수가 정의되어있지 않기 때문이다.
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
