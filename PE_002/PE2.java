/** Author: John Taylor
*   Title: PE2
*   Purpose: Finds the sum of all even numbers of the Fibonacci Sequence up to a certain value
*   Date: 11/14/15
*/
 
import java.util.Scanner;

public class PE2
{
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int sum= 0;
		int add= 0;
		int k= 0;
		double phi= (1+Math.sqrt(5.0))/2.0;
		double phi2= (1-Math.sqrt(5.0))/2.0;
		
		System.out.println("This program will give you the sum of all even numbers of the Fibonacci Sequence up to a certain value.");
		System.out.print("Enter the whole number up to which you want to find the sum: ");
		int A= kboard.nextInt();
		
		while(add<=A)
		{
			add= (int)Math.round((Math.pow(phi,3*k)-Math.pow(phi2,3*k))/Math.sqrt(5.0));
			sum += add;
			k++;
		}
		
		sum -= add;
		
		System.out.println("The sum is: "+sum);
  }
}