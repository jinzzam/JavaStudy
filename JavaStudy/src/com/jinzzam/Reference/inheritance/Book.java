package com.youjin.inheritance;

public class Book {
	protected String name;
	protected String publisher;
	protected int page;

	// Book 클래스의 필드들을 protected로 선언하여 자손 클래스에서 사용 가능하게 만들어줬다.

	public Book(String name, String publisher, int page) {
		this.name = name;
		this.publisher = publisher;
		this.page = page;
	}

	public Book() {
		this.name = null;
		this.publisher = null;
		this.page = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String toString() {
		return "Book [name=" + name + ", publisher=" + publisher + ", page=" + page + "]";
	}

}
