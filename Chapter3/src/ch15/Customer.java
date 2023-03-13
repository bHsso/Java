package ch15;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void order() { // 재정의함. ( 사용하고싶은 인스턴스를 선택 가능)
		System.out.println("customer order");
	}

	public void hello() {
		System.out.println(" hello ");
	}
}
