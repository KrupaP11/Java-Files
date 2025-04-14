/**************************************************************************

 * @By: First and Last name

 * @Lab: 19

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 03/19/2024

 * @Description: Generate a random card from french-suited deck

 * **************************************************************************/

import java.util.Random;

public class DrawCard {
	public static void main(String[] args) {
		
		String deck, card="";
		Random rand = new Random();
		
		int num1 = rand.nextInt(4);
		int num2 = rand.nextInt(13);
		
		if (num1 == 0) {
			deck = "Club"; 
			switch (num2) {
				case 0: card = "Ace";
				break;
				case 1: card = "Two";
				break;
				case 2: card = "Three";
				break;
				case 3: card = "Four";
				break;
				case 4: card = "Five";
				break;
				case 5: card = "Six";
				break;
				case 6: card = "Seven";
				break;
				case 7: card = "Eight";
				break;
				case 8: card = "Nine";
				break;
				case 9: card = "Ten";
				break;
				case 10: card = "Jack";
				break;
				case 11: card = "Queen";
				break;
				case 12: card = "King";
				break;
			}
			System.out.println(card + " of " + deck);
		}
		else if (num1 == 1) {
			deck = "Diamonds";
			switch (num2) {
				case 0: card = "Ace";
				break;
				case 1: card = "Two";
				break;
				case 2: card = "Three";
				break;
				case 3: card = "Four";
				break;
				case 4: card = "Five";
				break;
				case 5: card = "Six";
				break;
				case 6: card = "Seven";
				break;
				case 7: card = "Eight";
				break;
				case 8: card = "Nine";
				break;
				case 9: card = "Ten";
				break;
				case 10: card = "Jack";
				break;
				case 11: card = "Queen";
				break;
				case 12: card = "King";
				break;
			}
			System.out.println(card + " of " + deck);
		}
		else if (num1 == 2) {
			deck = "Hearts";
			switch (num2) {
				case 0: card = "Ace";
				break;
				case 1: card = "Two";
				break;
				case 2: card = "Three";
				break;
				case 3: card = "Four";
				break;
				case 4: card = "Five";
				break;
				case 5: card = "Six";
				break;
				case 6: card = "Seven";
				break;
				case 7: card = "Eight";
				break;
				case 8: card = "Nine";
				break;
				case 9: card = "Ten";
				break;
				case 10: card = "Jack";
				break;
				case 11: card = "Queen";
				break;
				case 12: card = "King";
				break;
			}
			System.out.println(card + " of " + deck);
		}
		else {
			deck = "Spades";
			switch (num2) {
				case 0: card = "Ace";
				break;
				case 1: card = "Two";
				break;
				case 2: card = "Three";
				break;
				case 3: card = "Four";
				break;
				case 4: card = "Five";
				break;
				case 5: card = "Six";
				break;
				case 6: card = "Seven";
				break;
				case 7: card = "Eight";
				break;
				case 8: card = "Nine";
				break;
				case 9: card = "Ten";
				break;
				case 10: card = "Jack";
				break;
				case 11: card = "Queen";
				break;
				case 12: card = "King";
				break;
			}
			System.out.println(card + " of " + deck);
		}
	}
}