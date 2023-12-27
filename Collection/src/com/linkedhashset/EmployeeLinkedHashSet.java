package com.linkedhashset;

import java.util.LinkedHashSet;

import com.comaprable.Employee;



public class EmployeeLinkedHashSet {
	public static void main(String args[])
	{
		LinkedHashSet<Employee>hs=new LinkedHashSet<>();
		hs.add(new Employee(101, "suraj" , 9000f));
		hs.add(new Employee(102, "pratik", 78000f));
		hs.add(new Employee(103, "pratik", 98000f));
		hs.add(new Employee(104, "vivek", 98000f));
		
		//Overriding equals and HashCode
		for(Employee e:hs)
		{
			System.out.println(e);
		}
	}
}
	


