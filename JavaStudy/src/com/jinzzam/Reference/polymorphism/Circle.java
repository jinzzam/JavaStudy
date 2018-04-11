package com.youjin.polymorphism;

public class Circle extends Shape {
	public Circle(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	public float getArea() {
		return getWidth() / 2 * getHeight() / 2 * 3.14f;
	}
}
