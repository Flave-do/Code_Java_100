package com.briup.ch09;

public class TestSync implements Runnable{
	Timer timer=new Timer();
	public static void main(String[] args) {
		System.out.println("main method!");
		TestSync t=new TestSync();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
		Thread t5=new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();//
		t5.start();
	}
	public synchronized void run() {
		// TODO Auto-generated method stub
		//共享资源t
//		synchronized (this) {
			System.out.println(Thread.currentThread().getName());
			timer.add(Thread.currentThread().getName());
//		}
	}
	
}
class Timer{
	private static int num;
	public void add(String name){
		num++;//t2.start() num=1 num++ num=2
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+", 你是第"+num+"个线程");
	}
}