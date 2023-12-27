package com.assingments;
public class Student{
	private int id;
	private String name;
	private double marks;
	private String course;
	private long feesPaid;
	public Student() {
		
	}
	public Student(int id, String name, double marks, String course, long feesPaid) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
		this.feesPaid = feesPaid;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public long getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(long feesPaid) {
		this.feesPaid = feesPaid;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", course=" + course + ", feesPaid="
				+ feesPaid + "]";
	}
	
	
}