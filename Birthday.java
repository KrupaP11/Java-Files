/**************************************************************************

 * @By: Krupa Pothiwala

 * @Lab: 11

 * @CSE 1001 Fund Software, Spring 2024

 * @Date: 02/20/2024

 * @Description: Lets the user enter a birth month and tells the user if it was Micky Mouse's birthday as well.
 * **************************************************************************/
 
 public class Birthday {
	 public static void main(String[] args) {
		 String month = args[0];
		 int day = Integer.parseInt(args[1]);
		 int year = Integer.parseInt(args[2]);
		 
		 if (month.equals("November")) {
			 System.out.println("November is the month Micky Mouse was born!");
		 }
		 else { System.out.println(month + " is not the month Micky Mouse was born.");}
		 
		 if (day == 18) {
			 System.out.println("18 is the day Micky Mouse was born!");
		 }
		 else { System.out.println(day + " is not the day Micky Mouse was born.");}
		 
		 if (year == 1928) {
			 System.out.println("1928 is the year Micky Mouse was born!");
		 }
		 else { System.out.println(year + " is not the year Micky Mouse was born.");}
	 }
 }