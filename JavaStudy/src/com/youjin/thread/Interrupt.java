package com.youjin.thread;

import javax.swing.JOptionPane;

public class Interrupt {

	public static void main(String[] args) {
		Ex14 th1 = new Ex14();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		th1.interrupt();
		System.out.println("th1.isInterrupted() : " + th1.isInterrupted());
	}

}
