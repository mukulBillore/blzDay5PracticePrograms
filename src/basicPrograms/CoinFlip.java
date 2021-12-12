package basicPrograms;

public class CoinFlip {
	public static void code(int noOfTimeFlip) {
		int flips=noOfTimeFlip;
		int tossResult = (int)( (Math.random() * 10) % 2);
		int head =0,tail=0;
		while (flips!= 0) {
			flips--;
			if (tossResult == 0) {// its a head
				head++;
			} else {// its a tail
				tail++;
			}
		}
		int tailPercent=(tail*100)/noOfTimeFlip;
		int headPercent=100-tailPercent;
		System.out.print("the tail percent is "+tailPercent+" and the head percent is "+headPercent);
	}

	public static void main(String[] args) {
		CoinFlip.code(12);

	}

}
