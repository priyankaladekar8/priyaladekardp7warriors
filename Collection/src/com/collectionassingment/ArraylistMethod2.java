package com.collectionassingment;

import java.util.ArrayList;

public class ArraylistMethod2 {
	public static void main(String args[]) {
	ArrayList<Integer>It=new ArrayList<>();
	It.add(34);
    It.add(78);
    It.add(45);
    It.add(64);
    System.out.println(It);
    
  //retainsAll
    ArrayList<Integer>It2=new ArrayList<>();
    It2.add(1);
    It2.add(2);
    It2.add(78);
    It2.add(4);
    System.out.println(It2);
    
    It.retainAll(It2);
    System.out.println(It);
    
    //removeAll method
    It.removeAll(It2);
    System.out.println(It);
    
    //add method
    It.add(2, 55);
    System.out.println("55:" +It);
    

    //setMethod
    It.set(3, 90);
    System.out.println("90: "+It); 
   
    
    //getMethod 
    It.get(2);
    System.out.println("2: "+It);
    
   
    
	
    

}
}
