package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer() ;
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer ;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer ;
		seller.sell();
		seller.order(); // custoemr에서 재정의된 상태 
		
	}
}
