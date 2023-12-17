package com.sample.factory;

public abstract class Factory {
	
	//Bookを生成して登録するメソッド
	public final Book create(String isbnNumber) {
		
		//Bookの生成
		Book book = createBook(isbnNumber);
		
		//Bookの登録
		registerBook(book);
		
		return book;
	}
	
	//Bookを生成する抽象メソッド
	protected abstract Book createBook(String isbnNumber);
	
	//Bookを登録する抽象メソッド
	protected abstract void registerBook(Book book);

}
