package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FilecopyTest {

	public static void main(String[] args) {
		
		long millisecond = 0;
		/* FileInputStream */
//		try( FileInputStream fis = new FileInputStream("a.zip");
//				FileOutputStream fos = new FileOutputStream("copy.zip") ) {
//			
//			millisecond = System.currentTimeMillis(); // 
//			
//			int i ;
//			while( (i = fis.read()) != -1 ) {
//				fos.write(i);
//			}
//			
//			millisecond = System.currentTimeMillis() - millisecond ; // 소요시간
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		/* BufferedInputStream */
		try( BufferedInputStream bis = new BufferedInputStream( new FileInputStream("a.zip"));
				BufferedOutputStream bos = new BufferedOutputStream( new FileOutputStream("copy.zip"))) {
			
			millisecond = System.currentTimeMillis() ;
			
			int i ;
			while( (i = bis.read() ) != -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond ;
			
			
			/****************/
			Socket socket = new Socket();
		
	//		BufferedReader br = socket.getInputStream(); // byte단위 핸들링 -> 영어만 사용 가능.
	//		BufferedReader br = new InputStreamReader( socket.getInputStream() );// 문자단위 핸들링 => 한글 사용 가능
			BufferedReader br = new BufferedReader( new InputStreamReader( socket.getInputStream() ) ); // 수행시간 현저히 빨라짐.
		
		br.readLine();// 한 줄씩 읽기 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end_ millisecond : "+ millisecond );
		
	}
}
