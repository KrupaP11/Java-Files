/**************************************************************************

 * @By: Krupa Pothiwala
 
 * @Lab: 23a

 * @CSE 1001 Fund Software, Spring 2024

 * @Date: 04/11/2024

 * @Description: Create a program that will output the area of different geometric shapes using methods.

 * **************************************************************************/
 import java.util.Scanner;
 import java.lang.Math;
 
 public class Area {
	 static double circle(double radius) {
		 double cirArea = Math.pow(radius, 2) * Math.PI;
		 return cirArea;
	 }
	 
	 static double rectangle(double height, double width) {
		 double recArea = height * width;
		 return recArea;
	 }
	 
	 static double triangle(double base, double height) {
		 double triArea = (0.5)* base * height;
		 return triArea;
	 }
	 
	 public static void main(String[] args) {
		 Scanner kb = new Scanner(System.in);
		 
		 System.out.print("Enter type of figure (circle, triangle, rectangle): ");
		 String type = kb.next();
		 
		 switch (type) {
			 case "circle":
				System.out.print("Enter radius: ");
				double radius = kb.nextDouble();
				
				//circle(radius);
				System.out.println("Total area: " +circle(radius) +" sqaure inches");
				break;
			
			case "triangle":
				System.out.print("Enter base: ");
				double base = kb.nextDouble();
				
				System.out.print("Enter height: ");
				double height = kb.nextDouble();
				
				//triangle(base, height);
				System.out.println("Total area: " +triangle(base, height) +" sqaure inches");
				break;
			
			case "rectangle":
				System.out.print("Enter height: ");
				height = kb.nextDouble();
				
				System.out.print("Enter width: ");
				double width = kb.nextDouble();
				
				//rectangle(height, width);
				System.out.println("Total area: " +rectangle(height, width) +" sqaure inches");
				break;
				
			default:
				System.out.println("Sorry, input must be circle, triangle, rectangle");
		 }
		 
	 }
 }	 