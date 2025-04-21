/**************************************************************************

 * @By: Krupa Pothiwala

 * @Lab: 10

 * @CSE 1001 Fund Software, Spring 2024

 * @Date: 02/15/2024

 * @Description: Speeding and tickets. If her speed is 60 or less then no ticket. 
				If between 61 and 80 then $100. If 81 or more then $200.
				If its her birthday then speed cna be 5 miles/hr higher before the fine is determined.
				 
 * **************************************************************************/
 import java.util.Scanner;
  
  public class Kim {
	  public static void main(String[] args) {
		  int x, y;
		  Scanner kb = new Scanner(System.in);
		  
		  System.out.print("Please enter the speed: ");
		  x = kb.nextInt();
		  
		  System.out.print("Please indicate whether its your birthday. (0 = no and 1 = yes): ");
		  y = kb.nextInt();
		  
		  if (y == 0){
			  if (x <= 60) {
				  System.out.println("No ticket");
			  }
				else if ((x >= 61) && (x <= 80)) {
					System.out.println("$100");
				}
					 else {System.out.println("$200");}
		  }
		  else if (x <= 65) {
			  System.out.println("No ticket");
		  }
		  else if ((x >= 66) || (x <= 85)) {
				System.out.println("$100");
		  }
		  else {System.out.println("$200");}
	  }
  }
