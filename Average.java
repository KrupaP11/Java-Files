import java.util.Scanner;

public class Average {
	
	public static void main(String args []) {
		
		Scanner in = new Scanner(System.in);
		
	System.out.print("Enter First Number: ");
	
	int x = in.nextInt();
	
	System.out.print("Enter Second Number: ");
	
	int y = in.nextInt();
	
	double avg = (x + y) / 2.0;
	
	System.out.println(avg);
	}
}