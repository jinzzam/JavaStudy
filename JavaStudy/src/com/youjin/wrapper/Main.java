package com.youjin.wrapper;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		int num1 = 10;
//		Integer num2 = 20;
//		
//		float f1 = 3.14f;
//		Float f2 = 2.31f;
//		
//		char c1 = 'A';
//		Character c2 = 'a';
//		
//		double d1 = 1.1;
//		Double d2 = 2.2;
		
//==============================================	
//		
//		int num = Integer.parseInt("1234");
//		System.out.println(num);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		
//===============================================
		Integer num;

		if(sc.next().equals("yes")) {
			num = sc.nextInt();
		}else {
			num = null;
		}
		
		if(num == null) {
			System.out.println("숫자를 입력받지 않았습니다.");
		}else {
			System.out.println("입력받은 숫자는 " + num + "입니다.");
		}
		
	}

}

//Wrapper class 를 사용하는 이유 3가지
//1. Generic 사용 가능
//2. Wrapper class 가 가지고 있는 메서드와 필드를 사용하기 위해서
//3. null상태를 가진다