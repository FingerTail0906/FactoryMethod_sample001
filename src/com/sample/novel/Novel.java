package com.sample.novel;

import com.sample.factory.Book;

public class Novel extends Book{
	
	private String isbnNumber;
	
	public Novel(String isbnNumber) {
		super();
		System.out.println(isbnNumber + "の小説を制作します。");
		this.isbnNumber = isbnNumber;
	}
	
	@Override
	public void read() {
		System.out.println(isbnNumber + "の小説を読みます。");
	}
	
	public String getIsbnNumber() {
		return this.isbnNumber;
	}

}
