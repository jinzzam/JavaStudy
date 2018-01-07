package com.youjin.arraylist;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);

		v.trimToSize(); // 빈 공간을 없앤다. (용량과 크기가 같아진다.)
		System.out.println("After Time To Size()");
		print(v);

		v.ensureCapacity(6);
		System.out.println("After ensureCapacity()"); // 용량을 6으로 늘려줌
		print(v);

		v.setSize(7);
		System.out.println("After setSize()"); // size를 7로 바꿈
		print(v);

		v.clear();
		System.out.println("After clear()"); // 벡터값 다 삭제하고 size도 0으로 만들고 용량은 그대로
		print(v);
	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
	}
}
