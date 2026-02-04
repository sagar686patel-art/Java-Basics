import java.util.*;

public class Celcius_to_fahrenheit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter temperature(celcius):");
		double temp = in.nextDouble();
		double fah=(1.8*temp)+32;
		System.out.println("Temperature in Farhaneit: "+fah);
	}
}