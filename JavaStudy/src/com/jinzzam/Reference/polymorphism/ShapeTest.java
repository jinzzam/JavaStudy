package com.youjin.polymorphism;

public class ShapeTest {

	public static void main(String[] args) {
		Shape r = new Rectangle(0, 0, 10, 20);
		Shape c = new Circle(0, 0, 9, 9);
		System.out.println(r.getArea());
		System.out.println(c.getArea());
	}

}
