package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {
	
	public static void main(String[] args) {
		FileInputStream fis = null ;
		try {
			// 경로 지정 안 되있으면 프로젝트 하위에서 find 
			fis = new FileInputStream("input.txt");
			System.out.println( (char)fis.read() ); 
			System.out.println( (char)fis.read() ); 
			System.out.println( (char)fis.read() ); 
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch ( Exception e2) {
				System.out.println(e2);
			}
		}
		
		System.out.println("end");
	}

}
