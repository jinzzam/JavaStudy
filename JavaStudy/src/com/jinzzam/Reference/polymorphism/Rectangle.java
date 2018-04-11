package com.youjin.polymorphism;

public class Rectangle extends Shape {
	public Rectangle(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	public float getArea() {
		return getWidth() * getHeight();
	}
}
