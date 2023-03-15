package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SysteminTest1 {

	public static void main(String[] args) {
		System.out.println("write: ");
		
		int i ;
		
		try {
			//바이트단위로 읽는 스트림
			InputStreamReader irs = new InputStreamReader(System.in); // 보조스트림 : 키보드 뿐만 아니라, 바이트 단위 스트림을 감쌀 수 있음 . 
			while( (i = irs.read()) != '\n') {
				//System.out.println(i);
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
