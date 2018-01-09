package com.youjin.thread3;

public class Person extends Thread{
	PollingPlace p;
	String name;
	public Person(PollingPlace p, String name) {
		super();
		this.p = p;
		this.name = name;
	}
	@Override
	public void run() {
		p.vote(name);
	}
	
}
