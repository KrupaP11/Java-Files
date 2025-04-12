/**************************************************************************

 * @By: Krupa Pothiwala
 
 * @Lab: 22

 * @CSE 1001 Fund Software, Spring 2024

 * @Date: 04/09/2024

 * @Description: This program will compare two arrays and output the "and" and "or" parts of both arrays.

 * **************************************************************************/
 import java.util.Scanner;
 import java.util.Random;

 
 public class AndOr {
    public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Enter n: ");
        int n = kb.nextInt();
		
		System.out.print("Enter m: ");
		int m = kb.nextInt();
		
		int[][] Array1 = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				Array1[i][j] = rand.nextInt(2);
			}
		}
		
		int[][] Array2 = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				Array2[i][j] = rand.nextInt(2);
			}
		}
		
		System.out.println();
		System.out.println("First 2D Array: ");
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < m; j++) {
				System.out.print(Array1[i][j]);
			}
		}
		
		System.out.println();
		System.out.println("\nSecond 2D Array: ");
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < m; j++) {
				System.out.print(Array2[i][j]);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("\"And\" of the Arrays: ");
		
		int[][] Array3 = new int[n][m];
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < m; j++) {
				Array3[i][j] = Array1[i][j] & Array2[i][j];
				System.out.print(Array3[i][j]);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("\"Or\" of the Arrays: ");
		
		int[][] Array4 = new int[n][m];
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < m; j++) {
				Array4[i][j] = Array1[i][j] | Array2[i][j];
				System.out.print(Array4[i][j]);
			}
		}		
	}
 }