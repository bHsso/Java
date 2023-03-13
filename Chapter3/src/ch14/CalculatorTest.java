package ch14;

public class CalculatorTest {

	public static void main(String[] args) {
		
		/*
		 * int num1 = 10 ; int num2 = 2 ;
		 * 
		 * CompleteCalc calc = new CompleteCalc() ; System.out.println(calc.add(num1 ,
		 * num2)); System.out.println(calc.substract(num1 , num2));
		 * System.out.println(calc.times(num1 , num2));
		 * System.out.println(calc.divide(num1 , num2));
		 * 
		 * calc.description();
		 */
		
		int[] arr = { 1, 2,3,4,5};
		System.out.println( Calc.total(arr) );//정적메서드=> 인터페이스명으로 호출 (인스턴스 생성과 연관없음)
		CompleteCalc calc  = new CompleteCalc() ;
		calc.description();
	}
}
