package ch09_abstractClass;

public abstract class NoteBook extends Computer{ // 상위 클래스에 존재한는 모든 추상메서드를 오버라이딩 하지 않으면 추상 클래스로 정의 

	@Override
	public void display() {
		System.out.println("NoteBook display");
	}

	
}
