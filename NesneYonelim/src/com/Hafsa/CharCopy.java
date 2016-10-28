package com.Hafsa;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharCopy {
	
	public static void Char() throws IOException
	{
		FileReader fileReader=null;
		FileWriter fileWriter=null;
		try {
			fileReader=new FileReader("infile.txt");
			fileWriter=new FileWriter("charout.txt");
			
			int c;
			while((c=fileReader.read())!=-1)
				fileWriter.write(c);
			
		} finally {
			if(fileReader!=null)
				fileReader.close();
			if(fileWriter!=null)
				fileWriter.close();
		}
	}

	public static void main(String[] args) throws IOException{
			Char();
	}

}
