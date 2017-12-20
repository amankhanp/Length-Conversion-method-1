package etoday;
import java.util.Scanner;
public class MeterToKilometer implements LengthConversionInterface{
	/*
	 * While implementing an interface first we need to check package,
	 * whether it is in same package or not.
	 */
	public void conversion() { //method from interface class
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value in meter : ");
		float meters = input.nextFloat();
		float kilometers = meters / 1000;
		System.out.println("meters : " +meters + " = Kilometers : " + kilometers);
	}
}