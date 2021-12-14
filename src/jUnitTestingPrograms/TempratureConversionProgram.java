package jUnitTestingPrograms;

import java.util.Scanner;

public class TempratureConversionProgram {
	public static float fahrenheitToCelsius(float inF) {
		float inC = (inF - 32) * (5 / 9);
		return inC;
	}

	public static float celsiusTOFahrenheit(float inC) {
		float inF = (inC * (9 / 5)) + 32;
		return inF;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b) {
			System.out.print("press 1 for celsius TO Fahrenheit and 2 for fahrenheit To Celsius conversion: ");
			int input = sc.nextInt();
			if (input == 1) {
				b = false;
				int inC=sc.nextInt();
				
				System.out.println("the conversion is : "+TempratureConversionProgram.celsiusTOFahrenheit(inC));
			} else if (input == 2) {
				b = false;
				int inF=sc.nextInt();
				
				System.out.println("the conversion is : "+TempratureConversionProgram.fahrenheitToCelsius(inF));
			} else {
				System.out.println("wrong input enter again.");
			}
		}

	}

}
