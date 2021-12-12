package functionalPrograms;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double x=sc.nextDouble(),y=sc.nextDouble();
		double distance = Math.sqrt(x*x+y*y);
		System.out.println("the eular distace form origin to (x,y) is : "+distance);

	}
	}
