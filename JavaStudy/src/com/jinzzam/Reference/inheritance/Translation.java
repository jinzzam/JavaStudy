package com.youjin.inheritance;

public class Translation extends Book {
	private String translator;

	public Translation(String name, String publisher, int page) {
		super(name, publisher, page); // 부모클래스의 생성자 호출
		// Book에는 디폴트 생성자가 없다.
		// Translation도 마찬가지로 없다.
		// 반드시 Book의 생성자를 super라는 이름으로 호출해야한다.
	}

	public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public String toString() {
		return "Translation [translator=" + translator + "]";
	}
}
