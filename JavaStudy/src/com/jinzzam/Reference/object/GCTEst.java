package com.youjin.object;

public class GCTEst {
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		TestClass tc2 = tc;
		
		tc = new TestClass();
		System.gc();
	}
}

class TestClass{
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.hashCode()+"의 메모리가 해제됨!");
	}
}