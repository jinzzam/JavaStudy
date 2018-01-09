package com.youjin.thread2;

public class Data<E> {
	private E data;

	public Data(E data) {
		super();
		this.data = data;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

}
