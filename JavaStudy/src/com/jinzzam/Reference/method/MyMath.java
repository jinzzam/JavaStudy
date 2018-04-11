package com.youjin.method;

public class MyMath {
	long a, b;
	
	//no need parameters -> using instance parameter a, b
	long add() {return a + b;}	//a, b are instance type
	long sub() {return a - b;}	
	long mul() {return a * b;}
	long div() {return a / b;}
	
	//Regerdless of instance, only using parameter
	static long add(long a, long b) {return a + b;}
	static long sub(long a, long b) {return a - b;}
	static long mul(long a, long b) {return a * b;}
	static long div(long a, long b) {return a / b;}
}
