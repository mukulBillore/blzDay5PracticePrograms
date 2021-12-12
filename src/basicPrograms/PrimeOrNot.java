package basicPrograms;

public class PrimeOrNot {
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
		// TODO Auto-generated method stub
		System.out.println(PrimeOrNot.code(2));

	}

}
