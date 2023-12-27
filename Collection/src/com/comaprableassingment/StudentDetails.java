package com.comaprableassingment;

import java.util.ArrayList;
import java.util.Collections;

import com.comaprable.Student;

public class StudentDetails {
	public static void main(String args[])
	{
		ArrayList<Integer>slist=new ArrayList<>();
		slist.add(78);
		slist.add(89);
		slist.add(88);
		slist.add(99);
	    slist.add(68);
	   slist.add( 89);
	 
	   for(Integer I:slist)
	   {
		   System.out.println(I);
	   }
	   System.out.println("-----------------");
	   
	   Collections.sort(slist);
	   for(Integer I:slist)
	   {
		   System.out.println(I);
	   }

	}

	}


