package ch09_abstractClass;

public class ComputerTest {
	public static void main(String[] args) {
		
		Computer desktop = new Desktop() ; // == 상속
		//Computer computer = new Computer(); // 추상클래스(:상속을 하기 위해 만드는 클래스)의 경우( 모두 정의된 추상클래스 포함) new 연산사 사용 불가
		
	}
}
