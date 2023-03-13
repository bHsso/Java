package ch01;

class OutClass{
	
	private int num = 10 ;
	private static int sNum = 20 ;
	private InClass inClass ;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int iNum = 100;
		
		static int sInNum = 500;
		
		void inTest() {
			System.out.println("OutClass num : " + num + "(out 클래스의 instance 변수");
			System.out.println("OutClass sNum : " + sNum + "(out 클래스의 static 변수");
			System.out.println("InClass inNum : " + iNum + "(in 클래스의 instance 변수");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass{ //정적 내부 클래스
		int iNum = 100;
		static int sInNum = 200 ;
		
		void inTest() {
			// 정적클래스 외부 클래스와 상관 없이 생성될 수 있기에 일반(정적) 메서드에 외부 클래스의 인스턴스 변수를 사용할 수 없음.
			// => 본인의 인스턴스 변수를 사용
			//System.out.println("OutClass num : " + num + "(out 클래스의 instance 변수");
			System.out.println("OutClass num : " + iNum + "(out 클래스의 instance 변수");
			System.out.println("OutClass sNum : " + sNum + "(out 클래스의 static 변수");
			System.out.println("InClass inNum : " + sInNum + "(in 클래스의 in 클래스의 static 변수");
		}
		
		static void sTest() { // static 클래스의 static 메서드는  클래스 생성과 무관하게 호출될 수 있으므로 정적내부클래스의 인스턴스 변수가 생성되지 않았을 수 있음.
			// 때문에 스태틱 클래스의 인스턴스 변수 사용할 수 없음 .
			// static클래스의 static메서드에서는 (외부/내부)static 변수만 호출 가능
			//System.out.println("OutClass num : " + num + "(out 클래스의 instance 변수");
			System.out.println("OutClass sNum : " + sNum + "(out 클래스의 static 변수");
			System.out.println("InClass inNum : " + sInNum + "(in 클래스의 static 변수");
		}
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		/*
		 * OutClass outClass = new OutClass(); outClass.usingClass();
		 * 
		 * OutClass.InClass inner = outClass.new InClass();
		 */
		
		/** 인스턴스 내부 클래스 : instance inner Class **/
		// 인스턴스 생성 후 인스턴스변수를 이용해야 메서드 호출 가능.
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();
		
		
		/** 정적내부클래스 : static inner Class **/
		//인스턴스 생성 없이 바로 호출해서 사용 가능 
		OutClass.InStaticClass.sTest();
	}
}

