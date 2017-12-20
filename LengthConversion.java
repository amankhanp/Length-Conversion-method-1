package etoday;
interface LengthConversionInterface {
	void conversion();
}
public class LengthConversion{
	
	public static void main(String[] args){
		// creating an object to InchToMeter.Java Class
		InchToMeters imobject = new InchToMeters();
		imobject.conversion();
		// creating an object to MeterToCentimeter.Java Class
		MeterToCentimeter mcobject = new MeterToCentimeter();
		mcobject.conversion();
		// creating an object to MeterToKilometer.Java Class
		MeterToKilometer mkobject = new MeterToKilometer();
		mkobject.conversion();
	}
}
