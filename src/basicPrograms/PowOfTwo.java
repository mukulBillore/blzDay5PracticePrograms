package basicPrograms;

public class PowOfTwo {
public static void code(int powTill) {
	
	for(int i =0;i<=powTill;i++) {
	    int result=(int)Math.pow(2,i);
		System.out.println("2^"+i+" = "+result);
		LeapYearOrNot.code(result);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
	}
}
	public static void main(String[] args) {
		PowOfTwo.code(12);
	}

}
