package com.briup.ch11;

import java.io.*;
public class TestFileWriter {
  public static void main(String[] args) {
    FileWriter fw = null;
    try {
      fw = new FileWriter("src/prepare/io/eg/filewriter.dat");
      for(int c=0;c<=50000;c++){
        fw.write(c);
      }
      fw.flush();
      System.out.println("文件写入完成");
    } catch (IOException e1) {
    	e1.printStackTrace();
      System.out.println("文件写入失败");
      System.exit(-1);
    }finally{
    	try {
			if(fw!=null){
				fw.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
  }
}
