package com.youjin.instance;

public class Tv {
	String color; // ����
	boolean power; // �������� on/off
	int channel; // ä��

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
