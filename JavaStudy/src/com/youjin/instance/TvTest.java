package com.youjin.instance;

public class TvTest {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		t.channelUp();
		t.channelUp();
		t.channelUp();
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");
	}

}
