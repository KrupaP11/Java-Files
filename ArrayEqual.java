/**************************************************************************

 * @By: Krupa Pothiwala

 * @Lab: 17

 * @CSE 1001 Fund Software, Spring 2024

 * @Date: 03/12/2024

 * @Description: pormpt the user to enter two list of array and then determine whether they are identical or not.
 ****************************************************************************/
 import java.util.Scanner;
 
 public class ArrayEqual {
	 public static void main(String[] args) {
		 Scanner kb = new Scanner(System.in);
		 
		 System.out.print("Enter list length: ");
		 int n = kb.nextInt();
		 
		 System.out.print("Enter first list: ");
		 int[] List1 = new int[n];
		 
		 for (int i=0; i<n; i++) {
			List1[i] = kb.nextInt(); 
		}
		
		System.out.print("Enter second list: ");
		int[] List2 = new int[n];
		 
		for (int i=0; i<n; i++) {
			List2[i] = kb.nextInt(); 
		}
		
		boolean flag = true;
		for (int i = 0; i<n; i++) {
			if (List1[i] != List2[i]) {
				flag = false;
				break;
			}
		} 
			
			if (flag == true) {
			System.out.println("the lists are equal"); }
			else {
			System.out.println("The lists are not equal"); }
	 }
 }