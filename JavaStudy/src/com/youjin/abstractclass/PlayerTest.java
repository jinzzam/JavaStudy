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

//cd.pause(0);의 결과가 재생중으로 나오는 것은 정상임
//앞서서 pause를 호출했을 때 pause의 상태를 고쳐놨기 때문