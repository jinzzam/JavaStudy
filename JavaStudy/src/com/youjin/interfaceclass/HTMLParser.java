package com.youjin.interfaceclass;

public class HTMLParser implements Parseable{
	public void parse(String filename) {
		System.out.println(filename + "- HTML parsing completed.");
	}
}
