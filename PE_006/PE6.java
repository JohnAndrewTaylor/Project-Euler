/**	Author: John Taylor
*	Title of Assignment: PE6
*	Purpose: Finds the difference between the sum of the squares of the a given set of natural numbers and the square of the sum
*	Date: 12/2/15
*/

import java.util.Scanner;

public class PE6
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);
    int squaredsum= 0;
    int sumsquares= 0;
    
    System.out.println("This program finds the difference between the sum of the squares of the a given set of natural numbers (1 to A) and the square of the sum");
    System.out.print("Up to which natural number (A) do you want me to calculate? ");
    int a = kboard.nextInt();

    for (int count1=1; count1<=a; count1++)
    {
    	sumsquares+= count1*count1;
    	squaredsum+= count1;
    }
    System.out.println("The difference is: "+((squaredsum*squaredsum)-sumsquares));
  }
}