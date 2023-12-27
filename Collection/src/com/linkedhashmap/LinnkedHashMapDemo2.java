package com.linkedhashmap;

	import java.util.LinkedHashMap;
	import java.util.Map;

	public class LinnkedHashMapDemo2{
		public static void main(String args[])
		{
			
			//Accesses order maintains
			
			LinkedHashMap<String, Double>lhm=new LinkedHashMap<>(16, 0.75f, true);
			lhm.put("suraj" , 89.0);
			lhm.put("priyanka", 90.0);
			lhm.put("pralay", 67.0);
			lhm.put("Pratiksha", 56.0);
			lhm.put("shivam", 76.0);
			lhm.put("harshada", 55.0);
			for(Map.Entry<String, Double> e: lhm.entrySet())
			{
				System.out.println(e.getKey() +" "+ e.getValue());
			}
			System.out.println("marks of pralay "+ lhm.get("pralay"));
			System.out.println("marks of shivam "+lhm.get("Shivam"));
				
		}

	}

