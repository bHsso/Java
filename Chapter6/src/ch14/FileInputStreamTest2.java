package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		
		int i ;
		try (FileInputStream fis = new FileInputStream("input.txt") ){
			
			while( (i = fis.read() ) != -1 ) {
				System.out.println( (char)i );
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
