package com.youjin.object;

public class DoubleWrapString implements Cloneable {
	WrapString wstr;

	public DoubleWrapString(WrapString wstr) {
		this.wstr = wstr;
	}

	@Override
	public DoubleWrapString clone() {
		try {
//			return (DoubleWrapString)super.clone(); //이렇게 하면 얕은 복사가 일어난다
//			결과는 두 문장 모두 "삐딱하게"가 나온다.

			DoubleWrapString copy = (DoubleWrapString) super.clone();
			copy.wstr = new WrapString(this.wstr.str);
			return copy;
			//이렇게 하면 깊은 복사가 일어난다.
			//내가 의도하는대로 결과는..
			//지디라고 아시오?
			//오늘 밤은 삐딱하게
			
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		return null;
	}
}

//위의 방법 - 얕은 복사
//dw1의 wstr == dw2의 wstr
//그래서 dw2를 바꿔도 dw1이 같이 바뀌는 것


//그 아리의 방법 - 깊은 복사
//아예 각각의 래퍼런스를 가지게끔 만듦