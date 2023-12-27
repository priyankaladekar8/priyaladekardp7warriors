package com.labsession;

import java.util.ArrayList;
import java.util.Iterator;

public class EnvenPrint2 {
	public static void main(String args[])
	{
		ArrayList<Integer>E=new ArrayList<>();
		for(int i=0; i<50; i++)
		{
		    if(E.get(i)%2==0)
		    {
			System.out.println(E);
		    }
		}

		
		Iterator<Integer>itr=E.iterator();
		while(itr.hasNext())
		{
	
		  if(itr.next()%2==0)
		  {
			 System.out.println(itr.next()); 
		  }
		}
		
	}

}
