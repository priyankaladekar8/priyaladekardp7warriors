package com.files;

import java.io.File;
import java.io.IOException;

public class FileProperties {
	public static void main(String args[])throws IOException
	
	{
	   File f1=new File("D:\\DP7warriors\\MyFiles\\first.text"); //create a folder and coppy this
	   f1.createNewFile();
	   
	   //File f1=new File("D:\\DP7warriors\\MyFiles"); //give me directories
	   if(f1.exists())
	   {
		   if(f1.isFile())
		   {
			   System.out.println("path:"+f1.getAbsolutePath());
			   System.out.println("Length:"+f1.length());
			   System.out.println("File Name:"+f1.getName());
			   System.out.println("Write:"+f1.canWrite());
		   }
		   else
		   {
			   System.out.println("Unknown");
		   }
	   }
	}

}
