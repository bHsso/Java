package ch02;

public class AddTest {

	public static void main(String[] args) {
		// interface 정의 후 바로 구현만 하면 끝!
		Add addL = ( x , y )->x + y ; // Lambda expression 구현 완료.
		Add addL2 = (x , y )->{return x * y;};
		System.out.println( addL.add(2,3) );
		System.out.println( addL2.add(2,3) );
	}
}
