package ch10_templateMethodPattern;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println(" startCar() ");
	}
	
	public void turnOff() {
		System.out.println(" turnOff() ");
	}
	
	public void washCar() {} // 구현은 했으나 구현부가 없는 경우 , !! 추상 메서드 X !!
	
	final public void run() { // 시나리오 -> 고정필수 => final 선언
		startCar();
		drive();
		wiper(); // 추상메서드 => 하위에서 구현 필수
		stop();
		turnOff();
	}
	/**
	 */
}
