package com.stack;
//child class of vector
import java.util.Stack;

public class StackDemo {
	public static void main(String args[])
	{
		Stack<String>names=new Stack<>();
		names.push("harshada");
		names.push("Priyanka");
		System.out.println(names.push("Shahid"));
		
		names.push("Anuj");
		names.push("Gouri");
	
	System.out.println(names);
	System.out.println(names.pop());
	System.out.println(names);
}
}


