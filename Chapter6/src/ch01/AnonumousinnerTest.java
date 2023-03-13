package ch01;

class Outer2{
	
	int outNum = 100 ;
	static int sNum = 200;
			
	// Runnable 타입 반환
	Runnable getRunnable(/*final*/ int i ) {//class => thread화 할때 필요한 run메서드를 구현할 때 사용하는 interface
		/* final */ int num = 10;
		
//		class MyRunnable implements Runnable {  // : 클래스 이름 정의 후 return  
		/*** 익병내부 클래스 : Anonymous inner Class ***/
			// 다른 클래스에서 사용하지 않는 클래스의 경우 클래스 이름지정 없이 구현한 객체 정의 후 바로 return. 
			//RunnableInterface를 구현한 객체 정의후 바로 return. 
		return new Runnable() { 
			int localNum = 1000;
			
			@Override
			public void run() {
			/*
			 * 메서드 호출이 끝나면 param / localInnerVar 값이 stack메모리에서 없어지고 상수화됨!
			 * => 때문에 값 변경* 불가 ( 값 가져올 수는 있음 )
			 * i = 50 ; 
			 * num = 20 ;
			 */
				System.out.println("i: "+ i);
				System.out.println("num: "+ num);
				System.out.println("localNum: "+ localNum);
				
				System.out.println("outNum: "+ outNum + " (outterClass instance Var)");
				System.out.println("Outter.sNum: "+ Outer2.sNum + " (outterClass static Var)");
			}
		};
		/*** end Anonymous inner Class***/
		
//		return new MyRunnable();
	}
//	Runnable runnable = getRunnable(outNum); // ??????
	Runnable runnable = new Runnable() { //익명내부클래스 : 이름이 없는 클래스 
		@Override
		public void run() { // runnable 변수를 이용해 run()호출 가능.
			System.out.println("Runnalble class ");
		}
	};
}


public class AnonumousinnerTest {
	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run();
		
		out.runnable.run();
	}

}
