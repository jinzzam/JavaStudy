package com.youjin.innerclass;

public class Main {

	public static void main(String[] args) {
		Outter o = new Outter();
		Outter.Inner i = o.new Inner();
		
		i.print();
		o.method();
	}

}
