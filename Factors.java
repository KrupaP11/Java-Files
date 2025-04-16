/**************************************************************************

 * @By: Krupa Pothiwala

 * @Lab: 15

 * @CSE 1001 Fund Software, Spring 2024

 * @Date: 03/05/2024

 * @Description: prompt user for an integer and display the factors of the integer.
 ****************************************************************************/
 import java.util.Scanner;
 
 public class Factors {
	 public static void main (String[] args) {
		 Scanner kb = new Scanner(System.in);
		 
		 System.out.print("Enter an Integer: ");
		 int n = kb.nextInt();
		 
		 if (n > 0) {
			 System.out.println("Factors of " +n + " are: ");
			 
			 for (int i = 1; i <= n; i++) {
				 if (n % i == 0) {
				 System.out.println(i);}
			 }
		 }
	 }
 }