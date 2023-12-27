package com.labsession;

import java.util.ArrayList;
//22 swap two elements in arrayList 
public class SwapTwoElements {
	private static final String Interge = null;

	public static void main(String args[]) {

		ArrayList<Integer> sw = new ArrayList<>();
		sw.add(56); //0
		sw.add(45);  //1
		sw.add(67);//2   90
		sw.add(78); //3
		sw.add(90); //4  67
		System.out.println(sw);
		
		int temp = sw.get(2);
		sw.set(2, sw.get(4));
		sw.set(4, temp);
		System.out.println("after swap");
		System.out.println(sw);
	}

}
