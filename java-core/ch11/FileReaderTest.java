package com.briup.ch11;

import java.io.FileReader;

public class FileReaderTest {
	public static void main(String[] args) {
		FileReader fr=null;
		try {
			fr=new FileReader("src/com/briup/ch11/testinput");
			int a=0;
			while((a=fr.read())!=-1){
				System.out.print((char)(a));
			}
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(fr!=null){fr.close();}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
