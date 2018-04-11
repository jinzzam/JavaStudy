package com.youjin.abstractclass;

abstract public class Player {
	boolean pause;
	int currentPos;
	
	Player(){	//추상클래스도 생성자가 있어야 한다.
		pause = false;
		currentPos = 0;
	}
	
	abstract void play(int pos);
	abstract void stop(int pos);
	
	void play() {
		play(currentPos);	//추상메서드 사용
	}
	
	void stop() {
		stop(currentPos);
	}
	
	void pause(int pos) {
		if(pause) {	//pause가 true일 때(정지상태) pause가 호출되면
			pause = false;	//상태를 false (재생)으로 바꾸고
			play(pos);	//play
		}else {
			pause = true;
			stop(pos);
		}
	}
	
}
