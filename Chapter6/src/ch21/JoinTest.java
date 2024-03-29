package ch21;

public class JoinTest extends Thread{

	int start ;
	int end ;
	int total ; //instance 변수 : 기본값  0으로 세팅됨
	
	public JoinTest(int start , int end ) {
		this.start = start ;
		this.end = end ;
	}
	
	public void run() {
		 int i;
		 for(i = start ; i<= end ; i++) {
			 total += i;
		 }
	}
	
	public static void main(String[] args) {
		
		//System.out.println( Thread.currentThread() + "start" );
		
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start(); //thread1
		jt2.start(); //thread2
		
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println( Thread.currentThread() + "start" );
		int lastTotal = jt1.total + jt2.total ;//mainThread
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);

		System.out.println("lastTotal = " + lastTotal );

		//System.out.println( Thread.currentThread() + "end" );
	}
}
