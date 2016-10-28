package com.Hafsa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class CopyByte {
	
	public static void Copy() throws IOException {
		FileInputStream inputStream=null;
		FileOutputStream outputStream=null;
		try {
			inputStream=new FileInputStream("infile.txt");
			outputStream=new FileOutputStream("outfile.txt");
			int c;
			
			while((c=inputStream.read())!=-1)
				outputStream.write(c);
			
			
		} finally {
			if(inputStream!=null)
				inputStream.close();
			if(outputStream!=null)
				outputStream.close();
		}
	}

	public static void main(String[] args) throws IOException {
		Copy();
	}

}
