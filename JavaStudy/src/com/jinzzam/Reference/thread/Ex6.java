package com.youjin.thread;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은" + input + "입니다.");
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //1초 시간 지연
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
