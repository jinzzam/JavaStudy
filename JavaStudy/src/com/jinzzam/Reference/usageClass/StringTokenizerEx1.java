package com.youjin.usageClass;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source, ",");

		while (st.hasMoreTokens()) {	//토큰이 남아있는지 알려줌
			System.out.println(st.nextToken());
		}
	}
}
