package com.collectionassingment;
	import java.util.ArrayList;
	import java.util.List;

	public class NonGenericArrayList2 {

	public static void main(String args[])
			{
				List L1=new ArrayList<>();
				L1.add(5);
				L1.add("Priyanka");
				L1.add(78.7f);
				L1.add('B');
				System.out.println(L1);
				
				for(int i=0; i<L1.size(); i++)
				{
					System.out.println(L1.get(i));
					int data=(int)L1.get(i)+10;
					L1.set(i, data);
				}
				
	}
	}

		

		





