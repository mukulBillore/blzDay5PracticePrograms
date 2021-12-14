package logicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// 28=(1+2+4+7+14)
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number you want to check ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.println("the number you entered is perfect number");

		} else
			System.out.println("The number you entered is not perfect number ");

	}

}
