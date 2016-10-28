package com.Hafsa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LineCopy {
	
	public static void Line() throws IOException {
		BufferedReader bufferedReader=null;
		PrintWriter printWriter=null;
		try {
			bufferedReader=new BufferedReader(new FileReader("infile.txt"));
			printWriter=new PrintWriter(new FileWriter("lineout.txt"));
			
			String p;
			while ((p=bufferedReader.readLine())!=null)
				printWriter.println(p);
			
		} finally {
			if(bufferedReader!=null)
				bufferedReader.close();
			if(printWriter!=null)
				printWriter.close();
		}
		
	}

	public static void main(String[] args) throws IOException {
		Line();
	}

}
