package com.youjin.abstractclass;

public class CDPlayer extends Player{
	
	int currentTrack; 	//이 클래스에 추가로 정의된 멤버. 현재 재생 중인 트랙
	
	void play(int currentPos) {
		/*조상의 추상메서드를 구현*/
		System.out.println("CDPLAYER " + currentPos + "번 재생중");
	}
	
	void stop(int currentPos) {
		/*조상의 추상메서드를 구현*/
		System.out.println("CDPLAYER " + currentPos + "번 멈춤.");
	}
	
	public CDPlayer() {
		this.currentTrack = currentPos;
	}
	
	int nextTrack() {
		System.out.println("다음 트랙은" + ++this.currentTrack + "번 입니다.");
		return currentPos;
	}
	
	int preTrack() {
		System.out.println("이전 트랙은 " + --this.currentTrack + "번 입니다.");
		return currentTrack;
	}
	
	int currTrack() {
		System.out.println("현재 트랙은 " + this.currentTrack + "번 입니다.");
		return currentTrack;
	}
}
