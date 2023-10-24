package com.sanjay.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Book>booksList = new ArrayList<>();
		booksList.add(new Book(100, "DSA"));
		booksList.add(new Book(1000, "HLD"));
		booksList.add(new Book(1200, "LLD"));
		booksList.add(new Book(300, "DevOps"));
		booksList.add(new Book(200, "Kubernetes"));
		Library lib = new Library(booksList);
		
		Iterator itr = lib.creatIterator();
		
		while(itr.hasNext()) {
			Book b1 = (Book) itr.next();
			System.out.println("Price: "+b1.getPrice()+"  BookName: "+b1.getBookName());
		}
		
	}

}
