package com.youjin.interfaceclass;

public interface Person {
	public final static int eye = 2;
	public static int mouth = 1;
	public int hand = 2;
	int foot = 2;
	//인터페이스에서 필드는 무조건 public final static 이 된다.
	//그러므로 그냥 자료형만 적어주면 됨
	
	
	public abstract void run();
	public void sleep();
	void eat();
	//메소드 역시 일반적으로 public abstract 가 된다.
	//세 개의 메소드 모두 public abstract이다.
	
	static void breath() {
		System.out.println("후하후하 숨쉬는중");
	}
	
	default void eatChicken() {
		System.out.println("치킨 냠냠");
	}
	//예외적으로 본체를 가질 수 있는 메서드들이다.
	//static과 default.
	//default는 인터페이스에서만 사용할 수 있는 문법이다.
}


//인터페이스 역시 abstract와 같이 무조건 상속해서 사용해야하고
//인스턴스 생성 불가능하고 메서드들을 오버라이딩 해야함
