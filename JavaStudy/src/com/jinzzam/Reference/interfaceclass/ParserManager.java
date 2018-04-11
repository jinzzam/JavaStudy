package com.youjin.interfaceclass;

public class ParserManager {

	// 리턴타입이 parseable interface임.
	// 리턴타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것.
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {	//equals()함수는 object클래스에 정의되어 있으므로 쓰면 자동 오버라이딩된다. 괄호안의 내용과 같은지 확인해주는 기능임.
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
			// return new HTMLParser();
		}
	}
}
