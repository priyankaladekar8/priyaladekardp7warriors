package com.mock;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDepartmentHashMap {
	public static void main(String ags[])
	{
		HashMap<Employee, Department>ed=new HashMap<>();
		ed.put(new Employee (11, "priya", 200000.0f),new Department(101, "finacedpartement"));
		ed.put(new Employee(12, "shital", 23000.0f), new Department(102, "hrdepartment"));
		ed.put(new Employee (13, "akash", 200000.0f),new Department(103, "finacedpartement"));
		ed.put(new Employee(14, "vikash", 23000.0f), new Department(104, "bankdepartment"));
		ed.put(new Employee (15, "puja", 200000.0f),new Department(105, "finacedpartement"));
		ed.put(new Employee(16, "ashu", 23000.0f), new Department(106, "hrdepartment"));
		
		
		
		
	}

}
