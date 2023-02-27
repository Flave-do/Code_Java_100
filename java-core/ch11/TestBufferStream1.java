package com.briup.ch11;

import java.io.*;

public class TestBufferStream1 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		try {
			fis = new FileInputStream(
					"src/prepare/io/eg/TestBufferStream1.java");
			 bis = new BufferedInputStream(fis);
			int c = 0;
			// System.out.println(bis.read());
			// System.out.println(bis.read());
			bis.mark(100);
			for (int i = 0; i <= 10 && (c = bis.read()) != -1; i++) {
				System.out.print((char) c + " ");
			}
			System.out.println();
			bis.reset();
			for (int i = 0; i <= 10 && (c = bis.read()) != -1; i++) {
				System.out.print((char) c + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(bis!=null){
					bis.close();
				}
				if(fis!=null){
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}