package com.hashmap;
//4
import java.util.Objects;

public class Student1 {
	private int id;
	private String name;
	private double marks;
	public Student1(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	

   
   
   
   @Override
	public int hashCode() {
		return Objects.hash(id,name,marks);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null) 
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Student s = (Student)obj;
		if(this.id!=s.getId())
			return false;
		if(!this.name.equals(s.getName()))
			return false;
		if(this.marks!=s.getMarks())
			return false;
		
		return true;
		}
	
}




