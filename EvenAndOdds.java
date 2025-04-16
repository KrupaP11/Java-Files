/**************************************************************************

 * @By: Krupa Pothiwala

 * @Lab: 16

 * @CSE 1001 Fund Software, Spring 2024

 * @Date: 03/07/2024

 * @Description: Modify a program of already declared array and make it print out even and odd numbers separately.
 ****************************************************************************/
 
 public class EvenAndOdds {
    public static void main(String[] args) {
		int[] myArray = { 97, 9, 52, 56, 50, 57, 52, 83, 31, 11, 93, 63, 31, 72, 52, 86, 28, 97, 70, 29, 97, 100, 99,
                68, 77, 41, 29, 90, 85, 88, 62, 43, 19, 49, 29, 77, 89, 31, 51, 53, 2, 28, 26, 95, 77, 53, 37, 35, 12,
                95, 58, 48, 15, 47, 64, 2, 34, 28, 91, 48, 49, 52, 64, 50, 19, 96, 10, 3, 63, 24, 15, 69, 29, 34, 85,
                67, 48, 19, 74, 8, 93, 62, 15, 49, 36, 91, 81, 37, 17, 88, 27, 68, 63 };
		
		int n = myArray.length;
		int sumEven =0, sumOdd=0, countE = 0, countO = 0;
		double avgEven, avgOdd;
		
		System.out.println("Even values: ");
		for (int i =0; i<n; i++){
			if (myArray[i]%2 == 0) {
				System.out.println(myArray[i] + " is at position " + i);
				sumEven = sumEven + myArray[i];
				countE++;
			}
		}
		
		avgEven = (double)sumEven/countE;
		System.out.println("Average of even values is: " + avgEven);
		System.out.println();
		
		System.out.println("Odd values: ");
		for (int i =0; i<n; i++){
			if (myArray[i]%2 != 0){
				System.out.println(myArray[i] + " is at position " + i);
				sumOdd = sumOdd + myArray[i];
				countO++;
			}
		}	
		avgOdd = (double)sumOdd/countO;
		System.out.println("Average of odd values is: " + avgOdd);
	}
 }