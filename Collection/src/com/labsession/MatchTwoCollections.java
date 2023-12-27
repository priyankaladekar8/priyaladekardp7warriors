package com.labsession;

import java.util.ArrayList;

//19  wap to match two collection
public class MatchTwoCollections {
	
	public static void main(String args[])
	{
		ArrayList<String>al=new ArrayList<>();
		al.add("sbi");
		al.add("Hdfc");
		al.add("icici");
		al.add("badoda");
		al.add("maharastra");
		System.out.println(al);
		
		ArrayList<String>al2=new ArrayList<>();
		al2.add("sbi");
		al2.add("Hdfc");
		al2.add("icici");
		al2.add("badoda");
		al2.add("maharastra");
		System.out.println(al2);
		
		if(al.size()==al2.size())
		 {
			boolean status=al.containsAll(al2);
			if(status==true)
			{
				System.out.println("collection is same");
			}
			else
			{
				System.out.println("collection is not same");
			}
		}
		
	}
}


