package ch08;

public class ArrayIndexException {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		//try~catch 사용하지 않을 경우, JVM으로 err 넘어감 _ err이후 코드 수행 못함.
		// exception 핸들링 할 경우, 오류는 있으나 비정상 종료는 되지 않음. 
		try {
			for( int i =0 ; i<=5 ;i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println( e.getMessage() );
			System.out.println(e.toString());
		}
		System.out.println("here!!!");
		
		
	
		
	}
}
