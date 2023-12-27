package com.mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.hashmap.Student;

public class StudentDetatils {
	public static void main(String args[])
	{
		ArrayList<Student>al= new ArrayList<>();
		al.add(new Student(101, "priya", 89));
		al.add(new Student (102, "puja", 76));
		al.add(new Student(103, "mina", 67));
		al.add(new Student(104, "vikash", 45));
		al.add(new Student(105, "shital", 55));
		
	    for(Student s: al)
	    {
	    	System.out.println(s);
	    }
	    System.out.println("-------------------------");
	    
	  
	    
	   System.out.println("-------------------------");
	    
	    Iterator <Student>itr=al.iterator();
	    while(itr.hasNext())
		{
              System.out.println(itr.next());
		}
	    System.out.println("--------------------------");
	    
	    ListIterator<Student>litr=al.listIterator();
	    while(litr.hasNext())
	    {
	    	System.out.println(litr.next());
	    }
	    System.out.println("---------------------");
	    
	    
	    ListIterator<Student>litr1=al.listIterator(al.size());
	    
	    while(litr1.hasPrevious())
	    {
	    	System.out.println(litr1.previous());
	    }
	 
	   
	    		
	}

}
