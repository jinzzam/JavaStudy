package com.youjin.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList(2000000);
		LinkedList l1 = new LinkedList();

		System.out.println("순차적으로 추가하기");
		System.out.println("ArrayList : " + add1(a1));
		System.out.println("LinkedList : " + add1(l1));
		System.out.println();

		System.out.println("중간에 추가하기");
		System.out.println("ArrayList : " + add2(a1));
		System.out.println("LinkedList : " + add2(l1));
		System.out.println();

		System.out.println("중간에서 삭제하기");
		System.out.println("ArrayList : " + remove2(a1));
		System.out.println("LinkedList : " + remove2(l1));
		System.out.println();

		System.out.println("순차적으로 삭제하기");
		System.out.println("ArrayList : " + remove1(a1));
		System.out.println("LinkedList : " + remove1(l1));
		System.out.println();

	}

	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			list.add(i + "");
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			list.add(500, "X");
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for (int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}

}
