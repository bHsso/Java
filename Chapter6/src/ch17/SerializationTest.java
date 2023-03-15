package ch17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	String name ;
	// transient : 직렬화 하지 않으려는 멤버변수에 사용
	transient String job ; 
	
	public Person() {}
	
	public Person( String name , String job ) {
		this.name = name ;
		this.job = job ;
	}
	
	public String toString() {
		return name + "," + job ;
	}
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("Lee" , "PM");
		Person personKim = new Person("Kim" , "Dev");
		
		try ( FileOutputStream fos = new FileOutputStream("serial.txt") ) {
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// Serialization ******************************
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		} catch (IOException e) {
			System.out.println( e );
		}
		
		
		try ( FileInputStream fis = new FileInputStream("serial.txt") ) {
			//파일에 보관
			// DeSerialization ******************************
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person pLee = (Person)ois.readObject(); // return값이 cls일 수 있는데 readObject하려는 cls가 없는 경우가 있음. => exception핸들링.
			Person pKim = (Person)ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pKim);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println( e );
		}
		
		
		
		
	}
}
