/**************************************************************************

 * @By: Krupa Pothiwala
 
 * @Lab: 26

 * @CSE 1001 Fund Software, Spring 2024

 * @Date: 04/16/2024

 * @Description: Prompt user for positive integer and use recursion to count down from n to 1.

 * **************************************************************************/
 import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int count = in.nextInt();
		
		System.out.println("Start recursiveCountdown");
        recursiveCountdown(count);
		System.out.println("End recursiveCountdown");
    }

    public static void recursiveCountdown(int count) {
		
        if (count >= 0) {
           System.out.println(count);
           recursiveCountdown(count-1);
        }
        
    }
}
