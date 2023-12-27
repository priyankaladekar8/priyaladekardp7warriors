package com.hashmapAssingment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DaysofMoth {
	public static void main(String args[])
	{
		HashMap<String , Integer>shm=new HashMap<>();
		shm.put("jan", 30);
		shm.put("feb", 30);
		shm.put("apr", 31);
		shm.put("may", 30);
		shm.put("sep", 31);
		
		HashMap<Integer, Integer>shm1=new HashMap();
		for(Map.Entry<String, Integer>e: shm.entrySet())
		{
		    if(shm.containsKey(e.getValue()))
		    {
		    	shm1.put(e.getValue(),shm.get(e.getValue()+1));
		    }
		    else
		    {
		    	shm1.put(e.getValue(), 1);
		    }
		      
		}
		
	}
	
}


