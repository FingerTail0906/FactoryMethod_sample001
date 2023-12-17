package com.sample.novel;

import java.util.ArrayList;
import java.util.List;

import com.sample.factory.Book;
import com.sample.factory.Factory;

public class NovelFactory extends Factory{
	
	private List<String> isbnNumberList = new ArrayList();
	
	@Override
	protected Book createBook(String isbnNumber) {
		return new Novel(isbnNumber);
	}
	
	@Override
	protected void registerBook(Book book) {
		isbnNumberList.add(((Novel) book).getIsbnNumber());
	}
	
	public List<String> getIsbnNumberList(){
		return isbnNumberList;
	}
	

}
