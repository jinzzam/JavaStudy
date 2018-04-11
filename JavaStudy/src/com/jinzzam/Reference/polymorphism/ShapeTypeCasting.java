package com.youjin.polymorphism;

public class ShapeTypeCasting {

	public static void main(String[] args) {
		Shape r = new Rectangle(0, 0, 10, 20);
		Shape s = new Circle(0, 0, 9, 9);
		Circle c = (Circle) s;
		System.out.println(r.getArea());
		System.out.println(c.getArea());
	}

}
