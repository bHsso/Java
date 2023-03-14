package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
																// 메서드 정의할 때 exception 핸들링 하는 것이 아니라, 메서드를 호출하는 쪽에서 exception 핸들링.
	public Class loadClass(String fileName , String className ) throws ClassNotFoundException, FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c ;
	}
	
	// 단, main함수에서 throw로 exception 미룰 경우 -> VM 으로 미루므로 비정상 종료될 수 있음.
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
			
		} catch (ClassNotFoundException | FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
			
		// 무슨 exception 인지는 모르게스나 혹시 모르니 default Exception(최상위 exception) 처리 (가장 마지막에 처리 모든 exception이 포함되므로)
		} catch( Exception e) { //Exception default 처리 
			System.out.println(e);
		}
		
		System.out.println("end");
	}
}
