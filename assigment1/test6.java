import java.util.Scanner;
class Test6 {
	public static void main(String args[]) {
		float w, h;
	    Scanner a = new Scanner(System.in);
	    System.out.println("enter width and height of rectangle");
	    w = a.nextFloat();
	    h = a.nextFloat();
	    System.out.println("area:" + (w * h));
	    System.out.println("perimeter:" + (2 * (w + h)));
	}
}