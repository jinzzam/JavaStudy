package com.youjin.abstractclass;

public class PlayerTest {

	public static void main(String[] args) {
		CDPlayer cd = new CDPlayer();
		cd.play(0);
		cd.play(cd.nextTrack());
		cd.play(cd.currTrack());
		cd.pause(cd.currTrack());
		cd.pause(0);
	}
}


//왜 pause가 제대로 안될까 ㅠㅠ
