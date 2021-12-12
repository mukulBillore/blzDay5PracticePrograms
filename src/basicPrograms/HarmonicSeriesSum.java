package basicPrograms;

public class HarmonicSeriesSum {
	public static double code(int n) {
		double harmonicSum=0;
		for(int i=1;i<=n;i++) {
			harmonicSum=harmonicSum+(1d/n);
		}
		return harmonicSum;
	}
	public static void main(String[] args) {
		System.out.println("The sum of harmonic series till 10 is : "+HarmonicSeriesSum.code(10));
	}

}
