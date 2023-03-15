package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("output3.txt");
		try( fos ){ // 현재 프로젝트 하위에 생성됨
			byte[] bs = new byte[26];
			
			byte data = 65;
			for(int i =0 ; i< bs.length; i++) {
				bs[i]= data++;
			}
			// 2(bs의 offset )부터 10개만 쓰겟다
			fos.write(bs , 2 , 10); //CDEFGHIJKL
		}catch( IOException e) { // writeException 포함 
			System.out.println(e.getMessage());
		}
		System.out.println("end");
	}
}
