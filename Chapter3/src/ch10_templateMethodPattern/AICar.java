package ch10_templateMethodPattern;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("AI drive()");
	}

	@Override
	public void stop() {
		System.out.println("AI stop()");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}

}
