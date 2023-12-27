package com.comaprableassingment;

//3 wap to create a class employee with (name ,designation, age).
//now create  and add employee object elements to araylist print arraylist

//4 now midify  Employee class so that it implements comparable interfaces compareTo
//method sorting should be done based based ont id int which use< ,> and == techniqe

public class Employee implements Comparable<Employee>{
	
	private String name;
	private String designation ;
	private int age;

	public Employee(String name, String designation, int age) {
		super();
		this.name = name;
		this.designation = designation;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", age=" + age + "]";
	}


	@Override
//3
	public int compareTo(Employee e) {
		if(this.getAge()==e.getAge())
			return 0;
		else if(this.getAge()<e.getAge())
			return -1;
		else
			return 1;
	
	}
	//public int CompareTo(Employee e)
	//{
	//	if(this.getAge()<e.getAge())
	//		return 1;
	//	else 
	//		return -1;
		
	//}
	//public int CompareTo1(Employee e)
	//{
	//	if(this.getAge()> e.getAge())
	//		return 1;
	//	else 
	//		return -1;
	//}
	

}
