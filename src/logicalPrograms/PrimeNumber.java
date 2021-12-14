package logicalPrograms;

import java.util.Scanner;

import basicPrograms.PrimeOrNot;

public class PrimeNumber {
	public static boolean code(int num) {
		boolean b = true;
		int sqrt = (int) Math.sqrt(num);
		for (int i = 2; i < sqrt; i++) {
			if(num%i==0) {// prime
				b=false;
			}
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number you want to check ");
		int num = sc.nextInt();
		System.out.println(PrimeOrNot.code(num));

	}

}
