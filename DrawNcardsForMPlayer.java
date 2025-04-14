/**************************************************************************

 * @By: First and Last name

 * @Lab: 19

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 03/19/2024

 * @Description: prompt the user for two integer and generate n random cards for each player.

 * **************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class DrawNcardsForMPlayer {
	public static void main(String[] args) {
		
		String[] deck = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] card =  {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Number of Players: ");
		int m = keyboard.nextInt();
		
		System.out.print("Number of Cards for Each Player: ");
		int n = keyboard.nextInt();
		
		for (int j = 1; j<=m; j++){
		System.out.println("Player #" +j +":");
		
			for (int i = 0; i<n; i++) {
				int num1 = rand.nextInt(4);
				int num2 = rand.nextInt(13);
			
				System.out.println("\t" + card[num2]+ " of " + deck[num1]);
			}
		}
	}
}