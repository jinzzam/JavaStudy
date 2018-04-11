package com.youjin.thread;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) throws Exception {
		Ex7_1 th1 = new Ex7_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은" + input + "입니다.");
	}

}

//입력과 출력은 각각 다른 쓰레드로 나누어 처리했기 때문에
//사용자가 입력을 마치지 않았어도 화면에 숫자가 출력됨