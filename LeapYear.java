/**************************************************************************

 * @By: Krupa Pothiwala

 * @Lab: 08

 * @CSE 1001 Fund Software, Spring 2024

 * @Date: 02/13/2024

 * @Description: check to see if porgram on slide 43 on FlowofControl works.

 * **************************************************************************/
 
public class LeapYear{
	public static void main (String[] args)
	{
		int year = Integer.parseInt(args[0]);
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				System.out.println("Leap year.");
				} 
				else {System.out.println("Not a leap year.");}
				} 
				else if (year % 4 == 0) {System.out.println("Leap Year.");} 
				else {System.out.println("Not a leap year.");}
					
				}
}
