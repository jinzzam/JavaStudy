package com.youjin.interfaceclass;

public class Fighter extends Unit implements Fightable{
	public void move(int x, int y) {}		//접근제어자가 public인 것에 주목하자
	public void attack(Unit u) {}
}

//오버라이딩할 때는 조상의 메서드보다 넓은 범위의 접근 제어자를 지정해야 한다.
//Movable 인터페이스에서 public abstract void move(int x, int y)로 선언되어있기 때문에
//이를 구현하는 Fighter 클래스에서는 접근 제어자를 반드시 public으로 해야 한다.
