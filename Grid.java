/**************************************************************************

 * @By: Krupa Pothiwala
 
 * @Lab: 22

 * @CSE 1001 Fund Software, Spring 2024

 * @Date: 04/09/2024

 * @Description: Change the program to show n rows and n columns.

 * **************************************************************************/
 import java.util.Scanner;
 
 public class Grid {
    public static void main(String[] args) {
        // Two dimensional array:
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter n: ");
		
        int n = kb.nextInt();
		
		char[][] myArray = new char[n][n];
		
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = '*';
            }
        }

        for (int i = 0; i < n; i++) {
			System.out.println(myArray[i]);
		}
		// Add your for loop here:
    }
}
