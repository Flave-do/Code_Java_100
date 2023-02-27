package com.briup.ch11;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyByBin {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("src/com/briup/ch11/FileCopyByBin.java");
			fos=new FileOutputStream("src/com/briup/ch11/fileCopy");
			int a=0;
			//1029 100 29 71
			byte[] bs=new byte[100];
			while((a=fis.read(bs))!=-1){
//				System.out.println(a);
//				fos.write(bs);
				fos.write(bs,0,a);//29+71无用垃圾字节
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(fos!=null){fos.close();}
				if(fis!=null){fis.close();}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}








