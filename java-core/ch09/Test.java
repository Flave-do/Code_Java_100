package com.briup.ch09;

public class Test extends Thread{
	
	public void run(){
		m1();
	}
	public static void m1(){
		System.out.println("in m1,before m2 ");
		m2();
		System.out.println("in m1 after m2");
	}
	public static void m2(){
		System.out.println("in m2,before m3");
		m3();
		System.out.println("in m2,after m3");
	}
	public static void m3(){
		System.out.println("this is m3");
	}
	public static void main(String[] args) {
		//主线程 Thread.start();
		System.out.println("in main before m1");
//		m1();
		new Test().start();
//		m1(); 
		System.out.println("in main after m1");
	}
}
