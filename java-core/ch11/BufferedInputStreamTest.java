package com.briup.ch11;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		//try-with resource
		try{
//			fis=new FileInputStream("src/xx");
//			bis=new BufferedInputStream(fis);
			bis=new BufferedInputStream(new FileInputStream("src/xx"));
			int a=0;
			while((a=bis.read())!=-1){
				System.out.print((char)a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
