package ch04;

import java.lang.reflect.Constructor;

public class StringTestf {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String") ;
		
		Constructor[] cons = c.getConstructors() ;
		for(Constructor co : cons) {
			System.out.println(co);
		}
	}
}
