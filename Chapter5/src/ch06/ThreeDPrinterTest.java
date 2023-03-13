package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		ThreedPriniter3 printer = new ThreedPriniter3();
		
		printer.setMaterial(powder);
		
		Powder p = (Powder)printer.getMeterial();
	}
}
