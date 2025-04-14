/**************************************************************************

 * @By: First and Last name

 * @Lab: 19

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 03/19/2024

 * @Description: Change the if-statment from previous program into arrary to store string values.

 * **************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class DrawNCards1 {
	public static void main(String[] args) {
		
		String[] deck = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] card =  {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Number of Cards: ");
		int n = keyboard.nextInt();
		
		for (int i = 0; i<n; i++) {
			int num1 = rand.nextInt(4);
			int num2 = rand.nextInt(13);
			
			System.out.println(card[num2]+ " of " + deck[num1]);
		}
	}
}