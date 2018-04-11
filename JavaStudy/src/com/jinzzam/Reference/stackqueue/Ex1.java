package com.youjin.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex1 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); // Queue인터페이스의 구현제인 LinkedList를 사용

		st.push("0"); // push : 스택에 객체를 저장
		st.push("1");
		st.push("2");

		q.offer("0"); // offer : 큐에 객체를 저장
		q.offer("1");
		q.offer("2");

		System.out.println("=Stack=");
		while (!st.empty()) {
			System.out.println(st.pop()); // pop : 스택 맨 위에 저장된 객체를 꺼냄
		}

		System.out.println("=Queue=");
		while (!q.isEmpty()) {
			System.out.println(q.poll()); // poll : 큐에서 객체를 꺼내서 반환
		}
	}

}
