/**************************************************************************

 * @By: Krupa Pothiwala

 * @Lab: 12

 * @CSE 1001 Fund Software, Spring 2024

 * @Date: 02/22/2024

 * @Description: Promps the user for a list of non-negative integers terminated by -1 and then outputs if each integer is even or odd.
				After loop ends porgram will output the how many odd or even integers were added.
 * **************************************************************************/
 import java.util.Scanner;
 
 public class EvenOddCounts {
	 public static void main(String[] args){
		 int x, count1=0, count2=0;
		 Scanner kb = new Scanner(System.in);
		 
		 System.out.print("Enter a non-negative integer: ");
		 x = kb.nextInt();
		 
		 while (x > -1) {
			 if (x%2 == 0) {
			 System.out.println("Number is even");
			 count1++;
		 }
		 
		 else {System.out.println("Number is odd"); 
		 count2++;}
		 System.out.print("Enter a number: ");
		 x = kb.nextInt();
		 }
		 System.out.println("Total number of even numbers: " +count1);
		 System.out.println("Total number of odd numbers: " +count2);

	 }
 }