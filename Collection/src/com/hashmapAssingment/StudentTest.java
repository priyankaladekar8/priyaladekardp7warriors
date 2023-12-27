package com.hashmapAssingment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentTest {
	public static void main(String args[]) {
		HashMap<Student, Integer> sm = new HashMap<>();
		sm.put(new Student(1, "priya", "java"), 80);
		sm.put(new Student(2, "Shradha", "python"), 36);
		sm.put(new Student(3, "riya", "html"),47);
		sm.put(new Student(4, "tina", "css"),56);
		sm.put(new Student(5, "mina", "javScripta"),25);
		sm.put(new Student(6, "puja", ".net"), 90);
		System.out.println(sm);
		System.out.println("-----------------------------");

		ArrayList<Student> pass = new ArrayList<>();
		ArrayList<Student> fail = new ArrayList<>();

		for (Entry<Student, Integer> keys : sm.entrySet()) {
			if (keys.getValue() > 50)
				
				pass.add(keys.getKey());
			
			else {
				
				fail.add(keys.getKey());
				
			}
		}
		for (Student s : pass) {
			System.out.println("-----Pass Student-----");
			System.out.println(s);
		}

	}

}
