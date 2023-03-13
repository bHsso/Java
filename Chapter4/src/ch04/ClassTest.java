package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class c1 = Class.forName("ch04.Person");
		
		Person person = (Person)c1.newInstance();
		
		person.setname("Lee");
		System.out.println(person.getname());
		
		Class c2 = person.getClass(); // instance가 있는 상태에서 getClass 사용 가능
		Person p = (Person)c2.newInstance();
		System.out.println(p.getname());
		
		Class[] parameterTypes = { String.class };
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = { "Kim" };
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
		
		Person kim2 = new Person("Kim");
		
	}
}
