package com.briup.ch09;

public class DeadLockThread implements Runnable{
	public boolean flag;
	static Object o1=new Object();
	static Object o2=new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("flag="+flag);
		if(flag==true){
			synchronized (o1) {
				System.out.println("o1被锁定，等待锁定o2");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("o2已被锁定");
				}
			}
			
		}
		if(flag==false){
			synchronized (o2) {
				System.out.println("o2被锁定，等待锁定o1");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (o1) {
					System.out.println("o1已被锁定");
				}
			}
		
		}
	}
	public static void main(String[] args) {
		DeadLockThread d1=new DeadLockThread();
		DeadLockThread d2=new DeadLockThread();
		d1.flag=true;
		d2.flag=false;
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		t1.start();
		t2.start();
	}	
}
