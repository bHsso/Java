package ch17;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

//Externanlizable : 직접 읽고 쓰는 구조 
class Person1 implements Externalizable{
	String name ;
	// transient : 직렬화 하지 않으려는 멤버변수에 사용
	String job ; 
	
	public Person1() {}
	
	public Person1( String name , String job ) {
		this.name = name ;
		this.job = job ;
	}
	
	public String toString() {
		return name + "," + job ;
	}

	
	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
		name = obj.readUTF();
		job = obj.readUTF();
	}
	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {
		obj.writeUTF(name);
		obj.writeUTF(job);
	}

	
}

public class ExternalizableTest {

	public static void main(String[] args) {
		
		Person1 personLee = new Person1("Lee" , "PM");
		Person1 personKim = new Person1("Kim" , "Dev");
		
		try ( FileOutputStream fos = new FileOutputStream("external.txt") ) {
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// Serialization ******************************
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		} catch (IOException e) {
			System.out.println( e );
		}
		
		
		try ( FileInputStream fis = new FileInputStream("external.txt") ) {
			//파일에 보관
			// DeSerialization ******************************
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person1 pLee = (Person1)ois.readObject(); // return값이 cls일 수 있는데 readObject하려는 cls가 없는 경우가 있음. => exception핸들링.
			Person1 pKim = (Person1)ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pKim);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println( e );
		}
		
		
		
		
	}
}
