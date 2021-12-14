package jUnitTestingPrograms;

import java.util.Scanner;

public class StopWatchSimulation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("press any number key  and enter the start watch ");
		int a = sc.nextInt();
		long start = System. currentTimeMillis(); 
		System.out.println("press any key and enter to stop the watch ");
		int b = sc.nextInt();
		System.out.println("The elapsed time is : "+start);
	}

}
