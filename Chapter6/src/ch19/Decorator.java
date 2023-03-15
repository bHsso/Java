package ch19;

// 구현을 다 했어도 혼자서 사용하지 않을 클래스는 상속클래스로 지정
public abstract class Decorator extends Coffee {

	Coffee coffee ;
	public Decorator(Coffee coffee) { // 컨스트럭트에 항상 뭘 추가하게끔 해야 함 . 혼자 돌아가면 안되므로
		this.coffee = coffee ;
	}
	@Override
	public void brewing() {
		coffee.brewing();
	}

}
