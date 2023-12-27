package com.comaprableassingment;
//1 wap to sort the elements of list that contains stating objects .print Arraylist collicetions.sort(list method print arraylist

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Booklist {
public static void main(String args[])
{
	List <String> list=new ArrayList<>();
	list.add("TheSecrete");
	list.add("HerryPotter");
	list.add("life");
	list.add("Ramayan");
	for(String s: list)
	{
		System.out.println(s);
	}
	System.out.println("---------------------------");
	Collections.sort(list);
	for(String s: list)
	{
		System.out.println(s);
	}		
}
}
