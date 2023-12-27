package com.hashmap;

import java.util.Objects;
//3
public class Student {
	private int id;
	private String name;
	private double marks;
	private String course;
	
	public Student(int i, String string, int j)
	{
		
	}
	public Student(int id, String name, double marks, String course) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course=course;
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
	public void setCouse(String course)
	{
		this.course=course;
	}
	public String getCourse()
	{
		return course;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}
	public int hashCode()
	{
		return Objects.hash(id, name, marks);
	
}
}