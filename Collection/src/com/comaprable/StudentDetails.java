package com.comaprable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDetails {
	public static void main(String aegs[])
	{
		ArrayList<Student>slist=new ArrayList<>();
		slist.add(new Student(101,"Priyanka",78.5f));
		slist.add(new Student(102, "Dipti", 89.5f));
		slist.add(new Student(101,"Pratiksh",88.5f));
		slist.add(new Student(102, "suraj", 99.5f));
	    slist.add(new Student(101,"Puja",68.5f));
	   slist.add(new Student(102, "Divya", 89.5f));
	   for(Student s:slist)
	   {
		   System.out.println(s);
	   }
	   System.out.println("-----------------");
	   Collections.sort(slist);
	   for(Student s:slist)
	   {
		   System.out.println(s);
	   }

	}

}
