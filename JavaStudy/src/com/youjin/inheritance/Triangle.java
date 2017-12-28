package com.youjin.inheritance;

public class Triangle {
	Point[] p = new Point[3];	//array to store three Point instance

	Triangle(Point[] p) {
		this.p = p;
	}

	Triangle(Point p1, Point p2, Point p3) {
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
	}

}
