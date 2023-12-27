package com.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethodsDemo {

		public static void main(String args[])
		{
			TreeMap<Integer, String> tmap=new TreeMap<>();
			tmap.put(3, "java");
			tmap.put(1, "html");
			tmap.put(8, "c");
			tmap.put(8, "c++");
			tmap.put(6,  "python");
			tmap.put(4, "Angular");
			//tmap.put(null,  "hi")//null pinter exception
			
			
			//methods
			//Sorted map
			System.out.println("First key:"+tmap.firstKey());
			System.out.println("lst key:"+tmap.lastKey());
			
			SortedMap<Integer , String> s1=tmap.subMap(3, 6);//3 included //6 excluded
			System.out.println(s1);
			
			SortedMap<Integer, String>s2=tmap.headMap(3);//entries before 3 and 3 is excluded
			System.out.println(s2);
			
			SortedMap<Integer, String>s3=tmap.tailMap(3);//entries after 3 and 3 is included
			System.out.println(s3);
		
}
}
