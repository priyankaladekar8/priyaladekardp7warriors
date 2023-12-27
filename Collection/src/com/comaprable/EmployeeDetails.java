package com.comaprable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDetails {
	public static void main(String args[])
	{
		ArrayList<Employee>emp=new ArrayList<>();
		emp.add(new Employee(11, "priyanka" ,35000.0f));
		emp.add(new Employee(12, "puja" ,46000.0f));
		emp.add(new Employee(13, "pratiksha" ,55000.0f));
		emp.add(new Employee(14, "dipti" ,64000.0f));
		emp.add(new Employee(15, "pallvi" ,67000.0f));
		emp.add(new Employee(16, "Shradha" ,84000.0f));
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}
		
		System.out.println("========================");
		
		Collections.sort(emp);
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}
		
		
	}

}
