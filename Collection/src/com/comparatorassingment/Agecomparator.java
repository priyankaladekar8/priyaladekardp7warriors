package com.comparatorassingment;

import java.util.Comparator;

public class Agecomparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		return (int) (s1.getAge()-s2.getAge());
	}
	

}
