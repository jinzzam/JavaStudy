package com.youjin.exception;

import java.io.File;
import java.util.Scanner;

public class ExceptionEx15 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String str;
		str = sc.nextLine();
		//command line 에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
		File f = createFile(str);
		System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
	}

	@SuppressWarnings("finally")
	static File createFile(String fileName) {
		try {
			if(fileName == null || fileName.equals(""))
				throw new Exception("파일이름이 유효하지 않습니다.");
		}catch(Exception e) {
			//fileName이 부적절한 경우, 파일 이름을 '제목없음.txt'로 한다.
			fileName = "제목없음.txt";
		}finally {
			File f = new File(fileName);	//File 클래스의 객체 생성
			createNewFile(f);				//새로 생성한 객체를 이용해서 새 파일 생성
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch(Exception e) { }
	}
}
