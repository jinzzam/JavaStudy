package com.youjin.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;
		try {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			e.printStackTrace(System.out);
		} finally {
			System.out.println("try문이 끝났습니다.");
		}
		System.out.println("프로그램의 마지막");
	}
}
