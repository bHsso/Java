package ch02;

public class EqualsTest {
	public static void main(String[] args) {
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1 ;
		/*
		 * System.out.println(std1 == std2); //false
		 * System.out.println(std1.equals(std2) ); //false
		 */	
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i = 100;
		System.out.println(i.hashCode());
		
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		std1.setStudentName("Kim");
//		Student copyStudent =(Student) std1.clone(); // throws CloneNotSupported
//		System.out.println(copyStudent);
	}
	
}