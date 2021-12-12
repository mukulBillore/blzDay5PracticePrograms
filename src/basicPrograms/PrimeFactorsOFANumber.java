package basicPrograms;

public class PrimeFactorsOFANumber {
	public static void code(int numberToFactor) {
		int temp=numberToFactor;
		for(int i=2;i<numberToFactor;i++) {
			boolean primeOrNot=PrimeOrNot.code(i);
			
			if(primeOrNot==true&&temp!=0) {
				
				while(temp%i==0) {
					temp=temp/i;
					System.out.print(i+" , ");
				}
				}
		}
	}
	public static void main(String[] args) {
		PrimeFactorsOFANumber.code(30);

	}

}
