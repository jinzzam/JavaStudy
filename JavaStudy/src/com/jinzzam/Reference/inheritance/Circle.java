package com.youjin.inheritance;

public class Circle {
	Point center;
	int r;	//radius

	Circle() {
		this(new Point(0, 0), 100);
	}

	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
}
