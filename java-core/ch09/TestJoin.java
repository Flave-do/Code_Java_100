package prepare.thread;

public class TestJoin {
	public static void main(String[] args) {
		JoinThread j=new JoinThread();
		j.start();
		try {
			j.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("zhuxiancheng:"+i);
		}
	}
}
class JoinThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("subThread:"+i);
		}
	}
}