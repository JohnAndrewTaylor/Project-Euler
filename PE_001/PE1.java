/** Author: John Taylor
*   Title: PE1
*   Purpose: Finds the sum of all multiples of a number within a given range (non-negative)
*   Date: 11/13/15
*/
 
import java.util.Scanner;

public class PE1
{
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int sum= 0;
		
		System.out.println("This program will give you the sum of the multiples of any whole number within a given non-negative range (A to B).");
		System.out.print("Enter the number (integer): ");
		int num= kboard.nextInt();
		System.out.print("Enter the beginning integer of the range (A): ");
		int A= kboard.nextInt();
		System.out.print("Enter the last integer of the range (B): ");
		int B= kboard.nextInt();
		
		for (int count1=((A+num)/num); count1<((B/num)+1); count1++)
		{
			sum += count1*num;
		}
		
		System.out.println("The sum is: "+sum);
  }
}