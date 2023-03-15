package ch15;

import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// XxxReader || XxxWriter : 문자단위 핸들링 클래스
		try( FileWriter fw= new FileWriter("writer.txt") ) {
			fw.write('A');
			char buf[] = {'B','C','D','E'};
			
			fw.write(buf);//문자 배열 출력
			fw.write("String 출력");
			fw.write(buf , 1 ,2);
			fw.write("65");
			           	
		} catch (IOException e) {
			//System.out.println( e.getMessage() );
		}
		System.out.println("출력완료");
	}
}
