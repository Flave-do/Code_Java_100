package com.briup.ch09;

public class TestYield {
	public static void main(String[] args) {
		YieldThread y1=new YieldThread("y1");
		YieldThread y2=new YieldThread("y2");
		YieldThread y3=new YieldThread("y3");
		YieldThread y4=new YieldThread("y4");
		YieldThread y5=new YieldThread("y5");
//		y1.setPriority(Thread.MAX_PRIORITY);
//		y2.setPriority(Thread.MAX_PRIORITY);
		y1.start();
		y2.start();
		y3.start();
		y4.start();
		y5.start();
	}
}
class YieldThread extends Thread{
	public YieldThread(String name){
		super(name);
	}
	public void run(){
		for(int i=1;i<=100;i++){
			System.out.println(getName()+" : "+i);
//			try {
//				sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			if(i%10==0){
				yield();
			}
		}
	}
}