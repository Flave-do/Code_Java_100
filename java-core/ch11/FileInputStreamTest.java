package com.briup.ch11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	public static void templateIO() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/com/briup/ch11/testinput");
			int a=0;
			while((a=fis.read())!=-1){
				System.out.println((char)a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
					System.out.println("closed!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// File f1=new
		// File("D:\\ecworkspace\\Corejava_zhenlei\\src\\com\\briup\\ch11\\testinput");
		// File f=new File("src/com/briup/ch11/testinput");// /
		// boolean b=f.delete();
		// System.out.println(f.length());
		// A 65 a97 104 h
//		FileInputStream fis = new FileInputStream(
//				"src/com/briup/ch11/testinput");
//		// 65535
//		int a = 0;
//		while ((a = fis.read()) != -1) {
//			System.out.print((char) a);
//		}
//		System.out.println();
//		fis.close();
		templateIO();
	}
}
