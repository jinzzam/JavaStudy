package com.youjin.input;


public class InputEx {
	public static void main(String[]arg) throws java.io.IOException {
		int input = 0;
		
		System.out.println("������ �Է��ϼ��� .");
		System.out.println("�Է��� ��ġ���� x�� �Է��ϼ���.");
		do {
			input = System.in.read();
			System.out.print((char)input);
		}while(input!=-1 && input != 'x');
	}
}
