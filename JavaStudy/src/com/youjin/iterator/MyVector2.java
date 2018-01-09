package com.youjin.iterator;

import java.util.Iterator;

public class MyVector2 extends MyVector implements Iterator {
	int cursor = 0;
	int lastRet = -1;
	
	public MyVector2(int capacity) {
		super(capacity);
	}
	
	public MyVector2() {
		this(10);
	}
	
	public String toString() {
		String tmp = "";
		Iterator it = iterator();
	
		for(int i=0; it.hasNext();i++) {
			if(i!=0) tmp+=", ";
			tmp += it.next();
		}
		return "[" + tmp + "]";
	}
	
	public Iterator iterator() {
		cursor = 0;		//cursor와 lastRet을 초기화
		lastRet = -1;
		return this;
	}
	
	public boolean hasNext() {
		return cursor != size();
	}

	public Object next() {
		Object next = get(cursor);
		lastRet = cursor++;
		return next;
	}
	
	public void remove() {
		//더이상 삭제할 것이 없으면 예외 발생
		if(lastRet == -1) {
			throw new IllegalStateException();
		}else {
			remove(lastRet);
			cursor--;
			lastRet = -1;
		}
	}
}
