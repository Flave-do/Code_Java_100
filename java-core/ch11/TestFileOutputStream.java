package com.briup.ch11;

import java.io.*;
public class TestFileOutputStream {
  public static void main(String[] args) {
	  int b = 0;
	  FileInputStream in = null;
	  FileOutputStream out = null;
	  try {
	    in = new FileInputStream("src/prepare/io/eg/TestFileOutputStream.java");
	    out = new FileOutputStream("src/prepare/io/eg/TestFileOutputStream.bak");
	    while((b=in.read())!=-1){
	      out.write(b);
	    }
	  } catch (FileNotFoundException e2) {
	    System.out.println("找不到指定文件"); System.exit(-1);
	  } catch (IOException e1) {
	    System.out.println("文件复制错误"); System.exit(-1);
	  }finally{
		  try {
			if(in!=null){
				in.close();
			}
			if(out!=null){
				out.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	  }
	  System.out.println("文件已复制");
  }
}
