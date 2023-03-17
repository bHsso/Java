package ch23;

import java.util.ArrayList;

class FastLibrary{ //sharedReasource : FastLibrary	
	public ArrayList<String> shelf = new ArrayList();
	
	/**
	 * 대여 가능한 도서 목록
	 */
	public FastLibrary(){
		shelf.add("태백산맥1");
		shelf.add("태백산맥2");
		shelf.add("태백산맥3");
//		shelf.add("태백산맥4");
//		shelf.add("태백산맥5");
//		shelf.add("태백산맥6");
	}
	/**
	 * 책 대여
	 * @return
	 * @throws InterruptedException 
	 */
	public synchronized String lendBook() throws InterruptedException{
		Thread t = Thread.currentThread(); // 
		while( shelf.size() == 0) {
			// InterruptedException _호출 영역에서 핸들링 => throws
			System.out.println( t.getName() +" waiting start ");
			wait(); // Object클래스 메서드 _ 모든 클래스에서 사용 가능 (클래스는 object 상속 받음)
			System.out.println( t.getName() +" waiting end ");
			/*
			 * wait() :
			 * 해당 메서드를 수행하고 있는 Thread를 nonRunnable 상태로 빠뜨림
			 */
		}
		
		if( shelf.size() > 0) {
			String book = shelf.remove(0); //맨 앞에 위치한 책 빌려감
			System.out.println( t.getName() +" : "+ book + " lend");
			return book ;
			
		}else return null ;
	}
	/**
	 * 책 반납
	 * @param book
	 */
	public synchronized void returnBook(String book) {
		Thread t = Thread.currentThread(); // 어떤 쓰레드가 반납을 했는지 정보 확인
		
		shelf.add(book);
		notifyAll();// Object메서드=> 어느 객체에서나 사용 가능.
		/**
		 * notify() :
		 * 유효한 자원이 생길때 notify 호출해서 wait하고 있는 Thread 중 무작위로 하나 Thread를 재시작 .
		 */
		System.out.println( t.getName() +" "+ book + " return");
	}
}


class Student extends Thread{
	public Student(String name ) {
		super(name); // super :Thread
	}
	
	public void run() {
		try {
			String title = LibraryMain.library.lendBook() ;
			if(title == null ) {
				System.out.println(getName() +" 대여 불가 ");
				return ;
			}
			sleep(5000);
			LibraryMain.library.returnBook(title);
			
		}catch(InterruptedException e) {
			System.out.println( e);
		}
	}
}



public class LibraryMain {
	public static FastLibrary library = new FastLibrary() ;

	public static void main(String[] args) {
		
		Student std1 = new Student("std1");
		Student std2 = new Student("std2");
		Student std3 = new Student("std3");
		Student std4 = new Student("std4");
		Student std5 = new Student("std5");
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
	}
}
