package ch16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamREaderTest {
	
	public static void main(String[] args) {
		// 기반스트림이 닫히면 보조스트림도 닫힘 => 신경 쓸 것 없음
//		try( FileInputStream fis = new FileInputStream("reader.txt") ) { // 한글 깨짐
		try( InputStreamReader isr = new InputStreamReader( new FileInputStream("reader.txt") ) ) { // 보조스트림으로 감싸주면 한글 깨지지 않음
			int i;
			
			while( (i = isr.read()) != -1 ){
				System.out.println( (char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
