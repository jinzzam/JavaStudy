package com.youjin.polymorphism;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {

	public static void main(String[] args) {
		String expression = "x=100*(200+300)/2";
		StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);
		// StringTokenizer(String str, String delim, boolean returnDelims)
		// returnDelims의 값을 true로 하면 구분자도 토큰으로 간주된다

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken()); // nextToken : 다음 토큰을 반환
		}
	}

}
