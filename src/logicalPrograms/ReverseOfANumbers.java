package logicalPrograms;

import java.util.Scanner;

public class ReverseOfANumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number you want to reverse ");
		int num = sc.nextInt();
		int temp=num,reverse=0;
		while(temp!=0) {
			int rem=temp%10;
			int div=temp/10;
			   temp=temp/10;
			reverse=reverse*10+rem;
		}
		System.out.println("the reversal of the number is :"+reverse);
	}

}
