package ch09_abstractClass;

public abstract class Computer { // 추상클래스 : 상속을 위한 클래스 

	public abstract void display(); // 하위 클래스에 책임 위임
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("turn On");
	}
	public void turnOff() {
		System.out.println("turn Off ");
	}
}
