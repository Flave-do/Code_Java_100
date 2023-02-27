package com.briup.ch11;

import java.io.*;

public class TestFileInputStream {
	public static void main(String[] args) {
		int b = 0;
		FileInputStream in = null;
		try {
			in = new FileInputStream(
					"src/prepare/io/eg/TestFileInputStream.java");
		} catch (FileNotFoundException e) {
			System.out.println("�Ҳ���ָ���ļ�");
			System.exit(-1);
		}

		try {
			long num = 0;
			while ((b = in.read()) != -1) {
				System.out.print((char) b);
				num++;
			}
			
			System.out.println();
			System.out.println("����ȡ�� " + num + " ���ֽ�");
		} catch (IOException e1) {
			System.out.println("�ļ���ȡ����");
			System.exit(-1);
		}finally{
			try {
				if(in!=null){
					in.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}