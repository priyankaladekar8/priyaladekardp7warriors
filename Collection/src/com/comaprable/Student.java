 package com.comaprable;

import java.util.ArrayList;
 public  class Student implements Comparable<Student > {
	private int id;
	private String name;
	private float marks;
	public Student()
	{
		
	}
	public Student(int id, String name, float marks) {
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public int compareTo(Student s)
	{
		if(this.getMarks()==s.getMarks())
			return 0;
		else
			if(this.getMarks()<s.getMarks())
				return -1;
			else
				return 1;
	}
	public int compareTo1(Student s) {
		// TODO Auto-generated method stub
		return 0;
	}
	
 }
	