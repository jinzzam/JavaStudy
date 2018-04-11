package com.youjin.method;

public class MyMathTest {
	public static void main(String[] args) {
		//call class method
		System.out.println(MyMath.add(200L, 100L));
		System.out.println(MyMath.sub(200L, 100L));
		System.out.println(MyMath.mul(200L, 100L));
		System.out.println(MyMath.div(200L, 100L));
		
		MyMath mm = new MyMath();
		mm.a = 200L;
		mm.b = 100L;
		//only can call instance method after make object
		System.out.println(mm.add());
		System.out.println(mm.sub());
		System.out.println(mm.mul());
		System.out.println(mm.div());
	}

}
