package com.briup.ch11;

import java.io.*;
public class TestBufferStream2 {
  public static void main(String[] args) {
    try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					"C:\\test.txt"));
      BufferedReader br = new BufferedReader(
             new FileReader("C:\\test.txt"));
      String s = null;
      for(int i=1;i<=100;i++){
        s = String.valueOf(Math.random());
        bw.write(s);
        bw.newLine();
      }
      bw.flush();
      while((s=br.readLine())!=null){
        System.out.println(s);
      }
      bw.close(); 
      br.close();
    } catch (IOException e) { e.printStackTrace();}
  }
}