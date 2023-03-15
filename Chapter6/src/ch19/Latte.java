package ch19;

public class Latte extends Decorator{

	// default 생성자가 없을 경우 매개변수가 있는 생성자가 명시적으로 super 호출해야 함.
	public Latte(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Milk ");
	}

}
