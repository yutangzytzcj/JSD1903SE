package thread;

public class ThreadTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Thread t1=new Thread1();  
   Thread2  t2=new Thread2(); 
    t1.start();
      t2.run();
	}

}

class Thread1 extends Thread{    //  ¼Ì³ÐThread ¸ÄÐ´run ·½·¨£»
	public   void run() {
		for(int i=0;i<100;i++) {
			System.out.print(i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Thread2 implements Runnable{
	public void run() {
		sleep(1000);
		System.out.println("GO");
	}

	private void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
}