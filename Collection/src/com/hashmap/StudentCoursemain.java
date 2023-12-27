package com.hashmap;
//4

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Map.Entry;

	public class StudentCoursemain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			HashMap<Student, Course> sc = new HashMap<>();
			
			sc.put(new Student(1,"Anuj",90),new Course(101,"Java",40000));
			sc.put(new Student(12,"Pralay",90),new Course(102,".net",35000));
			sc.put(new Student(20,"Shivam",90),new Course(103,"Java",40000));
			sc.put(new Student(122,"Suraj",90),new Course(105,".net",30000));
			sc.put(new Student(110,"Hrishikesh",90),new Course(101,"Java",40000));
			
			
			for (Map.Entry<Student, Course> e: sc.entrySet()) {
				System.out.println("key: "+e.getKey());
				System.out.println("Value: "+e.getValue());
				System.out.println("--------------------");
			}
		}

	}


