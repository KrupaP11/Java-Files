/**************************************************************************

 * @By: Krupa Pothiwala

 * @Lab: 14

 * @CSE 1001 Fund Software, Spring 2024

 * @Date: 02/29/2024

 * @Description: Prompt the user for an integer and then display their factorials.
 ****************************************************************************/
import java.util.Scanner;
 
 public class Factorials {
	 public static void main (String[] args) {
		 Scanner kb = new Scanner(System.in);

		 System.out.print("Enter n: ");
		 int n = kb.nextInt();
		 
		 for (int i = n; i>=1; i--) {
			 int f = 1;
			 for (int j = 1; j<=i; j++) {
			 f = f * j;
			 }
			 System.out.println(i +"! is " +f );
		 }
	 }
 }
			 
