package com.youjin.initialization;

public class Product {
	static int count = 0;
	int serialNo;
	
	{
		count++;
		serialNo = count;
	}
	
	public Product() {} //기본생성자, 생략가능
}
