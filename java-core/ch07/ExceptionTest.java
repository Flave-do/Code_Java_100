package com.briup.ch07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
	public static int div(int a,int b) throws Exception{
		if(b==0){
			throw new Exception("除数为0！");
		}
		return a/b;
	}
	public void test() throws Exception{
		throw new Exception("asdas");
	}
	public void tt() throws Exception{
		test();
	}
	public void xx() throws Exception{
			tt();
	}
	public static void main(String[] args){
		//运行时的 
		try{
			System.out.println(div(5,3));
			System.out.println(div(5,1));
			Class.forName("java.util.ArrayListasd");
			//new ArithmeticException("/ by zero");
			FileInputStream fis=new FileInputStream("src/test.properties");
		}catch(ClassNotFoundException e){
			
		}catch(FileNotFoundException e){
			
		}catch(Exception e){
			
		}
			System.out.println("asd");
	}
}
