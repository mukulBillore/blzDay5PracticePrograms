package basicPrograms;

import java.util.Scanner;

public class LeapYearOrNot {
	public static boolean code(int year) {
		boolean yesOrNOt = false;
		Scanner sc = new Scanner(System.in);
		if (String.valueOf(year).length() == 4) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						System.out.println("the year is century and a leap year");
						yesOrNOt = true;
					} else {
						System.out.println("the year is century but not the leap year");
					}
				}else {
					System.out.println("It is a leap year but not the centurian year");
					yesOrNOt=true;
				}
			}

		} else {
			System.out.println("you entered the wrong year and enter four digit year");
		}
		return yesOrNOt;
	}

	public static void main(String[] args) {
		boolean status = LeapYearOrNot.code(11000);

	}

}
