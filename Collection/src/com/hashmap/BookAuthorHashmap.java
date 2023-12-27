package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BookAuthorHashmap {
	
	public static void createMapCount(ArrayList<Book> bl)
	{
		HashMap<Author, Integer> h1= new HashMap<>();
		
		for(Book b:bl)
		{
			if(h1.containsKey(b.getAuthor()))
			{
				h1.put(b.getAuthor(), h1.get(b.getAuthor())+1);
			}
			else
			{
				h1.put(b.getAuthor(), 1);
				
			}
		
		}
		
		for(Map.Entry<Author, Integer> e: h1.entrySet())
		{
			System.out.println(e.getKey()+"--->"+e.getValue());
		}
		
	}
	
	// create Key: Author
	//        Value:ArrayList<Book> 
	
	public static void createMapBook(ArrayList<Book> bl)
	{
		HashMap<Author, ArrayList<Book>> h1= new HashMap<>();
		
		ArrayList<Book> books;
		
		for(Book b:bl)
		{
			if(h1.containsKey(b.getAuthor()))
			{
				books= h1.get(b.getAuthor());
			}
			else
			{
				books= new ArrayList<>();
			}
			
			books.add(b);
			h1.put(b.getAuthor(), books);
		
		}
		
		for(Map.Entry<Author, ArrayList<Book>> e: h1.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println("--------------------------------");
			for(Book b: e.getValue())
			{
				System.out.println("[id="+b.getBid()+", Name="+b.getBname()+",Price="+b.getPrice()+"]");
			}
			
			System.out.println("=======================================");
		}
		
	}
	
	
	// Key: Author
	// Value: Book Names
	
	
	public static void main(String[] args) {
		
		ArrayList<Book> b= new ArrayList<>();
		
		b.add(new Book(101,"Harry Potter", 1045, new Author(1, "JK Rowling")));
		b.add(new Book(102,"Hamlet", 980, new Author(2, "William Shakespeare")));
		b.add(new Book(103,"Fantastic Beasts", 786, new Author(1, "JK Rowling")));
		b.add(new Book(104,"The christmas pig", 630, new Author(1, "JK Rowling")));
		b.add(new Book(105,"Othello", 1230, new Author(2, "William Shakespeare")));
		b.add(new Book(106,"The clear blue sky", 565, new Author(3, "Narayan Murthy")));
		

		System.out.println("-----------------------------------");
		createMapCount(b);
		
		System.out.println("------------------------------------------");
		
		createMapBook(b);
	}

}
