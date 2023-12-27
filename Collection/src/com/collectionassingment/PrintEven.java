package com.collectionassingment;

import java.util.ArrayList;

public class PrintEven {
	public static void main(String args[])
	{
		ArrayList<Integer>al=new ArrayList<>();
		
		for(int i=0; i<=50; i++)
		{
			al.add(i);
			{
				if(al.get(i)%2==0)
				{
					System.out.println(al.get(i) );
				}
			}
		}
		System.out.println(al);
		
	}

}
