package com.collectionassingment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateDemo {
	public static void main(String args[]) {
		ArrayList<Float> al = new ArrayList<>();

		al.add(23.5f);
		al.add(55.6f);
		al.add(45.3f);
		al.add(23.6f);
		System.out.println(al);
		System.out.println("====================");

		// by normal for loop
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("==================");

		// by enhance for loop
		for (float f : al) {
			System.out.println(f);
		}
		System.out.println("=======================");

		// iterate forward
		Iterator<Float> itr = al.iterator();
		while (itr.hasNext())
			;
		{
			System.out.println(itr.next());
		}
		System.out.println("====================");

		// by ListIerator backward

		ListIterator<Float> litr = al.listIterator(al.size());
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}

}
