package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {
	public static void main(String[] args) {
		
		int i ;
		try (FileInputStream fis = new FileInputStream("input2.txt") ){
			byte[] bs = new byte[10];
			// 읽은 배열 출력 
									// 1(offset)부터 9개 읽어라!
			while( (i = fis.read(bs , 1 , 9)) != -1) { // byte수 : 읽은 자료 수 
				//for( int ch : bs) {
				for(int j =0  ; j < i ; j++) {
					System.out.print( (char)bs[j] );
				}
				System.out.println(" : "+ i); // 읽은 byte 개수
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
