package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentCourseHashMapLogic2 {
	public static void courseNameMap(HashMap<Student, String>hm)
	{
		HashMap<String ,ArrayList<String>> h1= new HashMap<>();
		ArrayList<String> name; 
		for(Map.Entry<Student, String> e: hm.entrySet())
		{
			String Course=e.getValue();
			if(h1.containsKey(Course))
			{
				name= h1.get(Course);
				//name.add(e.getKey().getName());
				//h1.put(Course,  names);
			}
			else
			{
				name= new ArrayList<>();
				//name.add(e.getKey().getName());
				//h1.put(Course,  names);
			}
			 name= new ArrayList<>();
			 h1.put(Course ,  name);
			
		}
		////////////////////////////////////
		for(Map.Entry<String, ArrayList<String>> e: h1.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println("------------------");
			for(String s: e.getValue())
			{
				System.out.println(s);
			}
			System.out.println("---------------");
		}
	}
	public static void main(String args[])
	{
		HashMap< Student, String>shm= new HashMap<>( 12, 0.8f);
		shm.put(new Student( 101, "Anuj ", 90), "java");
		shm.put(new Student( 107, "Vishal ", 87), "python");
		shm.put(new Student( 103, " sahil", 56), "java");
		shm.put(new Student( 104, "mira ", 87), ".net");
		shm.put(new Student( 105, "parul ", 50), "python");
		shm.put(new Student( 108, "amit ", 55), "java");
		for(Map.Entry<Student, String>e: shm.entrySet())
		{
			System.out.println("Id:"+e.getKey());
			System.out.println("Details:"+e.getValue());
			System.out.println("-------------------------");
		}
		System.out.println("----------------");
		//createCountMap(shm);
		courseNameMap(shm);
		

		

		
	}

}
