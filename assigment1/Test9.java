import java.util.Scanner;
class Test9 {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
	    String name, add;
	    long phone;
	    System.out.println("enter your name,address & phone number");
	    name = a.nextLine();
	    add = a.nextLine();
	    phone = a.nextLong();
	    System.out.println("name : " + name + "\naddress : " + add + "\nphone number : " + phone);
	}
}