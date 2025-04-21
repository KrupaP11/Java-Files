/**************************************************************************

 * @By: Krupa Pothiwala

 * @Lab: 7

 * @CSE 1001 Fund Software, Spring 2024

 * @Date: 02/06/2024

 * @Description: Writing a program that will output the length of the name and the first letter of first name and last letter of last name of the name.

 * **************************************************************************/
 
 public class Hello 
 {
	 public static void main(String[] args)
	 {
		 String fname = args[0];
		 String lname = args[1];
		 String name = fname + lname;
		 System.out.println("Hello " +fname +" " +lname +"!");
		 System.out.println("Your full name is " +name.length() +" letters long");
		 System.out.println("The first letter in your first name is: " +name.charAt(0));
		 System.out.println("The last letter in your last name is: " +name.charAt(name.length()-1));
	 }
 }