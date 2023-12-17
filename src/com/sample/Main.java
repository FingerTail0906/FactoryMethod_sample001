package com.sample;

import com.sample.factory.Book;
import com.sample.factory.Factory;
import com.sample.novel.NovelFactory;

public class Main {
	
	public static void main(String[] args) {
		
		//Factoryインスタンスの作成
		Factory factory = new NovelFactory();
		
		//Bookを制作する
		Book book001 = factory.create("001a");
		Book book002 = factory.create("002a");
		Book book003 = factory.create("003a");
		
		System.out.println();
		
		//Bookを読む
		book001.read();
		book002.read();
		book003.read();
		
	}

}
