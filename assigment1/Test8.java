import java.util.Scanner;
class Test8 {
	public static void main(String args[]) {
		float p, r, t, amount = 0, temp = 0;
		Scanner a = new Scanner(System.in);
		System.out.println("enter principle rate and time ");
		p = a.nextFloat();
		r = a.nextFloat();
		t = a.nextFloat();
		System.out.println("simple interset :" + ((p * r * t) / 100));
		temp = 1 + r / 100;
		amount = p * (float)Math.pow(temp, t);
		System.out.println("compond interest : " + (amount - p));
		
	}
}