package com.mock;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private Department department;
	public Employee(int id, String name, float salary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department=department;
	}
	public Employee(int i, String string, float f) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setDepartment(Department department)
	{
		this.department=department;
	}
	public Department getDepartment()
	{
		return department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "Depatment"+department;
	}
	
	

}
