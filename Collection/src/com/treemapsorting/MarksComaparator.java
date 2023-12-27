package com.treemapsorting;

import java.util.Comparator;

import com.hashmap.Student;

public class MarksComaparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return (int) (o2.getMarks()-o1.getMarks());
	}

}
