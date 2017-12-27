package com.youjin.input;


public class InputEx {
	public static void main(String[]arg) throws java.io.IOException {
		int input = 0;
		
		System.out.println("문장을 입력하세요 .");
		System.out.println("입력을 마치려면 x를 입력하세요.");
		do {
			input = System.in.read();
			System.out.print((char)input);
		}while(input!=-1 && input != 'x');
	}
}
