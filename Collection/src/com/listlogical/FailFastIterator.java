package com.listlogical;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {
	public static void main(String args[])
	{
		ArrayList<String>al1=new ArrayList<>();
		al1.add("java");
		al1.add("python");
		al1.add("angular");
		al1.add("Spring");
		al1.add("html");
		//remove angular
		Iterator<String> itr=al1.iterator();
			while(itr.hasNext())
			{
				if(itr.next().equals("Angular"))
					//al1.remove("Angular");
					//ConcuurentModoficationError occur
					itr.remove();
				
			}
		System.out.println(al1);
	}

}
