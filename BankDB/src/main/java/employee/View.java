package com.kaelin.employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class View {
//	public void writeOutputStreamContentsE(String contents) {
//		OutputStream os = null;
//		File file = new File("Eoutput.txt");
//		try {
//			os = new FileOutputStream(file, true);
//			os.write(contents.getBytes());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(os != null) {
//			try {
//				os.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//
//	}
	
	public String readInputStreamContents() {
		InputStream is = null;
		File file = new File("input.txt");
		StringBuilder s = new StringBuilder();
		try {
			is = new FileInputStream(file);
			int b = 0;
			while((b=is.read())!= -1) {
				char c =(char) b;
				s.append(c);
			}
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s.toString();
	}
	
	
	
}
