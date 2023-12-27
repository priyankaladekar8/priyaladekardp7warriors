package com.collectionassingment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CarShowRoom {
	public static void main(String args[])
	{
		ArrayList<Car>clist=new ArrayList<>();
		clist.add(new Car(101, 1000000, "red",(new Engine(11, "manual"))));
		clist.add(new Car(102, 2000000, "blue",(new Engine(11, "automatic"))));
		clist.add(new Car(103, 3000000, "orange",(new Engine(11, "manual"))));
		clist.add(new Car(104, 4000000, "white",(new Engine(11, "automatic"))));
		
		ArrayList<Car>auto=new ArrayList<>();
		
		ArrayList<Car>manual=new ArrayList<>();
		
		for(Car c:clist)
		{
			if( c.getEngine().getEnginetype().equals("automatic"))
			{
				auto.add(c);
				System.out.println(c);
			}
			else
				manual.add(c);
			    System.out.println(c);
		}
		
		for(Car c: clist)
		{
			System.out.println(c);
		}
		System.out.println("-------------------------------");
		
		
		for(Car c2: manual)
		{
			System.out.println(c2);
		}
		
		
		
		//check price
		for(int i=0; i<clist.size(); i++)
		{
			if(clist.get(i).getPrice()>1000000)
			{
				double dis=clist.get(i).getPrice()-6000;
				System.out.println("After discount: "+dis);
	
				
			}
			
			
			
		}
		//for(int i=0; i<clist.size(); i++)
		//{
		//	if(clist.get(i).getEngine().getEnginetype().equals("manual"))
		//	{
		//		clist.remove(i);
		//	}
		//	System.out.println(clist);
		//}
		Collections.sort(clist);
		for(Car c:clist)
		{
			System.out.println(c);
		}
		

		Iterator<Car>itr=clist.iterator();
		while(itr. hasNext())
		{
			if(itr.next().getEngine().getEnginetype().equals("manual"));
			{
				itr.remove();
			}
		}
		
		for(Car c: clist)
		{
			System.out.println(c);
		}
	
		
	}

}
