package com.hashset;

import java.util.HashSet;

public class ItemsHashSet {
	public static void main(String args[])
	{
		HashSet<Items>hs=new HashSet<>();
		
		hs.add(new Items( 1, "Sugar" , 34));
		hs.add(new Items( 2, "Floar" , 120));
		hs.add(new Items( 3, "Chocolate" , 50));
		hs.add(new Items( 4, "ghee" , 245));
		hs.add(new Items( 5, "coldDrink" , 25));
		hs.add(new Items( 1, "Sugar" , 34));
		hs.add(new Items( 7, "Chips" , 75));
		
		for(Items i: hs)
		{
			System.out.println(i);
		}
	
	}

}
