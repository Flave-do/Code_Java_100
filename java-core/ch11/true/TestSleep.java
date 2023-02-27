package prepare.thread;

import java.util.Date;


public class TestSleep {
	public static void main(String[] args) {
		SleepThread s=new SleepThread();
		s.start();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("准备打断子线程！");
		s.shutdown();
//		s.stop();
		System.out.println("打断成功~");
	}
}
class SleepThread extends Thread{
	private boolean flag=true;
	public void shutdown(){
		flag=false;
	}
	public void run(){
		while(flag){
			System.out.println("当前时间为:"+new Date().toLocaleString());
			try {
				sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("吵着我睡觉了");
				return;
			}
		}
	}
}


