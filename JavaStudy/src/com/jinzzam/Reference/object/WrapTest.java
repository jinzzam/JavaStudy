package com.youjin.object;

public class WrapTest {

	public static void main(String[] args) {
		DoubleWrapString dw1 = new DoubleWrapString(new WrapString("지디라고 아시오?"));
		DoubleWrapString dw2 = null;
		dw2 = dw1.clone();
		dw2.wstr.str = "오늘 밤은 삐딱하게";
		System.out.println(dw1.wstr.str);
		System.out.println(dw2.wstr.str);
	}

}
