package com.youjin.instance;

public class Tv {
	String color; // 색상
	boolean power; // 전원상태 on/off
	int channel; // 채널

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}
