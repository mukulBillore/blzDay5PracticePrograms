package functionalPrograms;
import java.util.Scanner;
public class WindChill {
	private double v;
	private double t;
	public double getV() {
		return v;
	}
	public void setV(double v) {
		this.v = v;
	}
	public double getT() {
		return t;
	}
	public void setT(double t) {
		this.t = t;
	}
	//code
	public double code(double t,double v ) {
		double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
		return w;
	}
	public static void main(int args) {
		WindChill wind1=new WindChill();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temprature and the speed");
		wind1.setT(sc.nextDouble());					
		wind1.setV(sc.nextDouble());
		System.out.print("the wind chill i.e effective tempratue  is "+wind1.code(wind1.getT(),wind1.getV()));
	}  
		
}
