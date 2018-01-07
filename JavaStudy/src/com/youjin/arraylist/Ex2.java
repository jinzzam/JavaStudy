package com.youjin.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		final int LIMIT = 10; // 자르고자 하는 글자의 개수
		String source = "012345352342345kjdfnksndkdfsgsdd$%^$^()";
		int length = source.length();

		List list = new ArrayList(length / LIMIT + 10);

		for(int i=0;i<length;i+=LIMIT) {
			if(i+LIMIT < length)
				list.add(source.substring(i, i+LIMIT));
			else
				list.add(source.substring(i));
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
