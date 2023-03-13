package ch10_templateMethodPattern;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println(" ManualCar drive");
	}

	@Override
	public void stop() {
		System.out.println(" ManualCar stop()");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void washCar() {	// 훅 메서드 
		System.out.println("washCar 재정의");
	}
	
	

}
