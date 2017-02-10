import java.util.Scanner;
class Test10 {
	public static void main(String args[]) {
		float c, f = 0;
		Scanner a = new Scanner(System.in);
		System.out.println("enter temperature in centigrade");
		c = a.nextFloat();
		f=(c * 9f / 5) + 32;
		System.out.println("temperature in fahernheit : " + f);
	}
}