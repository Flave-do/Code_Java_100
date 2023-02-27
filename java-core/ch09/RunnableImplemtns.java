package com.briup.ch09;

public class RunnableImplemtns {
	public static void main(String[] args) {
//		new MyThread1().run();
		//Thread-0 Thread-1 Thread-2
		MyThread1 m1=new MyThread1("myThread1");
		Thread t=new Thread(m1);
		t.start();//t.run() m1.run()
		for (int i = 0; i < 100; i++) {
			System.out.println("main method:"+i);
		}	
	}
}
class MyThread1 implements Runnable{
	private String name;
	public MyThread1(String name){
		this.name=name;
	}
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(name+" : "+i);
		}
	}
	
}