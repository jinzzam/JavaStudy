package com.youjin.charsequence;

public class Main {

	public static void main(String[] args) {
//		String str = "동해물과 백두산이";
//		String str2 = str;
//		System.out.println(str == str2);
//		//str += "마르고 닳도록";			
//		//str = new String(str + "마르고 닳도록"); 과 같은 코드이다.
//		//String 은 값을 변경할 수 없는 불변 값이다.
//		System.out.println(str == str2);
		
//	==================================================
			
		StringBuffer str = new StringBuffer("동해물과 백두산이");
		StringBuffer str2 = str;
		System.out.println(str == str2);
		str.append(" 마르고 닳도록");
		System.out.println(str == str2);
			
	}

}

//String은 문자열을 너무 반복해서 바꾸는 경우에는 비효율적이다.
//문자열의 값이 계속해서 변해야한다면 StringBuffer (또는 StringBuilder)를 선택해야 한다.
