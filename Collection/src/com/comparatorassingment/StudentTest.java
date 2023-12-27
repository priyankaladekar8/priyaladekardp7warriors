package com.comparatorassingment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
	public static void main(String args[])
	{
		ArrayList<Student>al=new ArrayList<>();
		al.add(new Student(11,"priyanka", 25));
		al.add(new Student(12,"shital", 22));
		
		al.add(new Student(13,"vikash", 26));
		
		al.add(new Student(14,"akash", 23));
		
		al.add(new Student(15,"ashwin", 27));
		
		for(Student s: al)
		{
			System.out.println(s);
		}
		

	
		
		
		
		
		
		
	}

}
