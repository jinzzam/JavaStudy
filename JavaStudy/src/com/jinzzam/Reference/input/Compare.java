package com.youjin.input;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//문자를 입력받을 수 있게 준비
	     String[] aa = new String[5];
	     int i = 0/*반복문에 필요*/, score = 0/*문제의 점수*/;
	     String answer/*사용자가 입력한 답*/, bb = " "/*배열이 if문에 안들어가서 만듬*/;
	        System.out.printf("타자 연습 1.0.\n-단어를 정확하게 입력하고 엔터 키를 누르세요.\n\n");
	        //설명
	        
	        aa[0] = "앙";
	        aa[1] = "마나님";
	        aa[2] = "아니";
	        aa[3] = "미리";
	        aa[4] = "만남";
	        
	        for (i = 0; i < 5; i++) {
	        	//i가 4가 될 때까지 밑의걸 반복하고 반복후엔 i를 1 늘리기
	        	System.out.printf("%s ==>", aa[i]);
	        	bb = aa[i];
	        	//aa의 값을 bb로 옮겨줌(여기서 문제가 생겼나...)
	        	answer = s.next();
	            if (answer.compareTo(bb) == 0) {
	            	//만약 답이랑 bb(aa)가 같다면...
	            	score++;
	            	System.out.println(score);
	            	//점수를 올리고
	            } else if (answer.compareTo(bb) != 0) {
	            	//만약 답이랑 bb(aa)가 다르다면...
	            	score--;
	            	//점수를 내린다
	            	System.out.println(score);
	            }
	        }
	        System.out.printf("\n당신의 점수는:" + score);
	        //오류...왜난걸까...
	        //하아
	}
}