package com.youjin.thread3;

public class Main {

	public static void main(String[] args) {
		PollingPlace p = new PollingPlace();
		new Person(p, "youjin").start();
		new Person(p, "taejung").start();
		new Person(p, "jungbum").start();
		

	}

}
