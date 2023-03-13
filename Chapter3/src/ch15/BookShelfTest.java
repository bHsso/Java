package ch15;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		int i = 0;
		bookQueue.enQueue("토지"+ ++i);
		bookQueue.enQueue("토지"+ ++i);
		bookQueue.enQueue("토지"+ ++i);
		bookQueue.enQueue("토지"+ ++i);
		bookQueue.enQueue("토지"+ ++i);
		
		System.out.println( bookQueue.getSize() );
		System.out.println( bookQueue.deQueue() );
		System.out.println( bookQueue.deQueue() );
		System.out.println( bookQueue.deQueue() );
		System.out.println( bookQueue.getSize() );
	}
}
