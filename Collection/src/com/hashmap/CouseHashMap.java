package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CouseHashMap {
	public static void main(String args[]) {
	

	HashMap<Student ,Course>shm=new HashMap<>();
	Course c1=new Course(101,  "java", 55000);
	Course c2=new Course(102,  "python", 45000);
	
    shm.put  (new Student(11, "sahil", 56),c2);
    shm.put (new Student(12, "Mira", 87),c1);
    shm.put( new Student(13, "mahul", 77),c1);//replace the value
    shm.put( new Student(14, "parul",50) ,c2);

    for(Map.Entry<Student, Course>e: shm.entrySet())
    {
    	System.out.println("Id:" +e.getKey());
    	System.out.println("Details:"+e.getValue());
    	System.out.println("--------------");
    }
    
	}
}
