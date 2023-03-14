package ch08;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseable obj = new AutoCloseableObj();
		
		try( obj ){ // AutoClosable 사용한 obj를 try문에 넣어 사용할 경우 finally에서 close처리하지 않아도 자동close 처리됨.
			//
			throw new Exception(); // exception 강제 생성=> catch문에서 처리
		}catch(Exception e) {
			System.out.println("exception");
		}
		System.out.println("end");
	}
}
