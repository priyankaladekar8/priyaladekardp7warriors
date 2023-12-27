package com.listlogical;

import java.util.ArrayList;

public class FrequencyArrayList {
	static void calFreq(ArrayList<String>list)
	{
		int count;
		for(int i=0; i<list.size(); i++)
		{
			count=1;
			if(list.get(i).equals("visitend"))
				continue;
			for(int j=i+1; j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					count++;
					list.set(j, "visited");
				}
			}
			System.out.println((list.get(i)+"---->"+count));
		}
		
	}
	static void findDeuplicate(ArrayList<String>list)
	{
		int count;
		for(int i=0; i<list.size();i++)
		{
			count=1;
			if(list.get(i).equals("visited"))
				continue;
			for(int j=i+1; j<list.size(); j++)
			{
			
			if(list.get(i).equals(list.get(j)))
			{
				count++;
				list.set(j, "visisted");
			}
		}
			if(count>1)
		System.out.println(list.get(i)+"---->"+count);
	}
	}
	static void findUnique(ArrayList<String>list)
	{
		int count;
		for(int i=0; i<list.size(); i++)
		{
			count=1;
			if(list.get(i).equals("Visited"))
				continue;
			for(int j=i+1 ;j<list.size(); j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					count++;
					list.set(j,"visited");
				}
			}
			if(count==1)
				System.out.println(list.get(i)+"--->"+count);
		}
		
	}
		
	public static void main(String args[]) {
		ArrayList<String>al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("c");
		al.add("D");
		al.add("A");
		al.add("B");
		al.add("c");
		
		//calFreq(al);
		//FindDuplicate(al);
		findUnique(al);
		
		
		
	}

}

