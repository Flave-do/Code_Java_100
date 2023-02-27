package com.briup.ch09;

public class ThreadExtends {
	public static void main(String[] args) {
		MyThread t1=new MyThread("briup1");
		MyThread t2=new MyThread("briup2");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}		
	}
}
class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(getName()+" : "+i);
		}
	}
	
}