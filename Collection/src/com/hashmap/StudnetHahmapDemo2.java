package com.hashmap;

import java.util.HashMap;

public class StudnetHahmapDemo2 {
public static void main(String args[])
{
	
	HashMap<Integer ,Student>shm=new HashMap<>();
	shm.put(101,  new Student(101, "Anuj", 90));
	shm.put(107,  new Student(107, "vishal", 88));
    shm.put(103,  new Student(103, "sahil", 56));
    shm.put(104,  new Student(104, "Mira", 87));
    shm.put(104,  new Student(104, "mahul", 77));//replace the value
    shm.put(105,  new Student(105, "parul",50));

	}
}
