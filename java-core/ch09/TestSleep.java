package prepare.thread;

import java.util.Date;


public class TestSleep {
	public static void main(String[] args) {
		SleepThread s=new SleepThread();
		s.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.interrupt();
	}
}
class SleepThread extends Thread{
	public void run(){
		while(true){
			System.out.println("当前时间为:"+new Date().toLocaleString());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}
		}
	}
}