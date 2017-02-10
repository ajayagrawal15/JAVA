import java.util.Scanner;
class Test5 {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
	    float radius, area = 0, cir = 0;
	    System.out.println("enter radius of cirle");
	    radius = a.nextFloat();
	    cir = (float)(2 * Math.PI * radius);
	    System.out.println("circumfrence=" + cir);
	    area = (float)(Math.PI * Math.pow(radius, 2));
	    System.out.println("area=" + area);
	}
}