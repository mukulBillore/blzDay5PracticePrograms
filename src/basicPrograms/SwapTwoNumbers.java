package basicPrograms;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
	int num1=10,num2=20;
	System.out.println("before swap num are : "+num1+","+num2);
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.println(" after swap num are : "+num1+","+num2);
	}

}
