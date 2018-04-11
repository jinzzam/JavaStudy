package com.youjin.polymorphism;

import java.util.Scanner;

public class ShapeTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape s;
		if(sc.nextInt() % 2 ==0) {
			s = new Rectangle(0, 0, 10, 20);
		}else {
			s = new Circle(0, 0, 9, 9);
		}
		System.out.println(s.getArea());
	}

}
