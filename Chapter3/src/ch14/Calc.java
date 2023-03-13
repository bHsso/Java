package ch14;

public interface Calc {

	double PI = 2.14 ;
	int ERROR = -999999999;
	
	int add(int num1 , int num2 );
	int substract(int num1 , int num2 ); 
	int times(int num1 , int num2) ;
	int divide(int num1 , int num2 ) ;
	
	default void description() {
		System.out.println("description_defaultMethod");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0 ;
		
		for(int num : arr ) {
			total += num ;
		}
		myStaticMethod();
		return total ;
	}
	
	// private 메서드 : interface 내에서만 사용하기 위해 사용
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
}
