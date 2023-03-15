package ch20;

/**
 * @author PSH
 * thread를 생성하기 위해 runnable한 객체를 생성해서 thread에 생성된  runnable객체 끼워넣어 주면 thread가 수행됨
 */
class MyThread implements Runnable{

	@Override
	public void run() {
		int i ;
		for(i = 0 ; i< 200 ; i++) {
			System.out.print(i + "\t");
		}
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println( Thread.currentThread() +" start");
		
		MyThread runnable = new MyThread();
		Thread th1 = new Thread(runnable); // runnable 기반으로 thread 돌아감
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println( Thread.currentThread() +" end");
		
		
		/** thread 간단하게 돌릴 거면 이런식으로 돌려도 오케이 **/
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("run");
			}
		};
		run.run();
	}
}
