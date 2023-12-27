package com.comaprableassingment;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDetails {
	public static void main(String args[])
	{
		ArrayList <Employee>al=new ArrayList<>();
		{
			al.add( new Employee("Priyanka", "Devloper", 23) );
			al.add(new Employee("dipti" , "PO", 24));
			al.add(new Employee("shraddha ", " Manager", 30));
			al.add(new Employee("shital", "finance" ,25));
			
			for(Employee e: al)
			{
				System.out.println(e);
			}
			System.out.println("-----------------------");
			
			Collections.sort(al);
			for(Employee e: al)
			{
				System.out.println(e);
				
			}
			
		
		}
		
	}

}
