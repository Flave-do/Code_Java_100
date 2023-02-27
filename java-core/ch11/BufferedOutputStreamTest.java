package com.briup.ch11;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamTest {
	public static void main(String[] args) {
		BufferedOutputStream bos=null;
		try {
			bos=new BufferedOutputStream(new FileOutputStream("src/yy"));
			bos.write(65);
			bos.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(bos!=null){
					bos.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
