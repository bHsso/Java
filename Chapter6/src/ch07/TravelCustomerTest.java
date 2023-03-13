package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {
	
	public static void main(String[] args) {
		
		TrevelCustomer customerLee = new TrevelCustomer("Lee", 40, 100);
		TrevelCustomer customerKim = new TrevelCustomer("Kim", 30, 100);
		TrevelCustomer customerHong = new TrevelCustomer("Hong", 10, 50);
		
		List<TrevelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println( "고객명단: " );
		customerList.stream().map(c -> c.getName()).forEach( s->System.out.println(s) );
		
		System.out.println("여행비용: ");
		System.out.println( customerList.stream().mapToInt(c -> c.getPrice() ).sum() );
		
		System.out.println("20세 이상 고객명 오름차순 정렬: ");
		//최종연산은 단 한번만 수행 (중간연산은 여러번 사용 가능)
		customerList.stream().filter(c->c.getAge() >=20 ).map(c-> c.getName() ).sorted().forEach( s -> System.out.println(s) );
	}
}
