package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args)  { //throws FileNotFoundException____ main 함수에서 exception 처리하면 VM으로 넘김 -> 비정상 종료
		
		//FileInputStream fis = null ;
		
//		try {
//			fis = new FileInputStream("a.txt"); //  path:  Chapter6/a.txt 
//			System.out.println("read");
//
//		} catch (FileNotFoundException e) {
//			System.out.println(e);
//			return;
//			
//		} finally {
//			if(fis != null) {
//				try {
//					fis.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			System.out.println("finally");
//		}
//		System.out.println("end");
		
		/** java7 **/
		try( FileInputStream fis = new FileInputStream("a.txt") ){ // fis 자동 close()처리 가능한 코드 _ AutoCloseable(interface)한 obj
			System.out.println("read");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
