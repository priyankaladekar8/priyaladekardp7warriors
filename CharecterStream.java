package com.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CharecterStream {
	public void writeData(File f)
	{
		try
		{
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f);
		fw.write("my name id Priyanka\n");
		fw.write("i am learning Full Stack ");
		System.out.println("Added..");
		fw.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void readData(File f) {
		try {
			if (f.exists()) {
				FileReader fr = new FileReader(f);

				int i = 0;

				while ((i = fr.read()) != -1) {
					System.out.println((char) i);
				}
				fr.close();
			} else {
				System.out.println("File does not exist..");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String args[]) {
		CharecterStream obj = new CharecterStream();

		File f1 = new File("\"D:\\DP7warriors\\MyFiles\\chario.txt");
		obj.writeData(f1);
		obj.readData(f1);

	}
}
