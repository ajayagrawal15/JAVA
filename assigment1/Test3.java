import java.util.Scanner;

class test4 {
	public static void  main( String args[]){
		Scanner a = new Scanner(System.in);
		float b, c;
		System.out.println("enter two number");
		b = a.nextFloat();
		c = a.nextFloat();
		System.out.print(" sum=" + (b+c) + "\n difference=" + (b-c) + "\n product=" + (b*c) + "\n quotient=" + (b/c) );
    }
}	