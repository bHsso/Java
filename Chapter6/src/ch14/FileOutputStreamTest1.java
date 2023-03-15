package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		
		try( FileOutputStream fos = new FileOutputStream("output.txt") ){ // 현재 프로젝트 하위에 생성됨
			fos.write(65); //A
			fos.write(66); //B
			fos.write(67); //C
			
		}catch( IOException e) { // writeException 포함 
			System.out.println(e.getMessage());
		}
		System.out.println("end");
	}
}
