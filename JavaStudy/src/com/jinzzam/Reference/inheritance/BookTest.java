package com.youjin.inheritance;

public class BookTest {

	public static void main(String[] args) {
		Book b = new Book();
		
		b.setName("박유진");
		b.setPublisher("꼬부기");
		b.setPage(1000);
		System.out.println(b.toString());
		Translation t = new Translation(b.getName(), b.getPublisher(), b.getPage());
		t.setTranslator("피카츄");
		System.out.println(t.toString());
	}

}
