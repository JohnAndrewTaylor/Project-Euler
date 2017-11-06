/**	Author: John Taylor
*	Title of Assignment: PE4
*	Purpose: 
*	Due Date: 11/17/15
*/

import java.util.Scanner;

public class PE4
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);
    
    System.out.println("We will find the sum of all the multiples of 3 and 5 within a given range (a to b)!");
    System.out.print("Give me the first integer of the range (a): ");
    int a = kboard.nextInt();
    System.out.print("Give me the first integer of the range (b): ");
    int b = kboard.nextInt();
    search:
    for (int count1=(10*k)-1; count1>=1*k; count1--)
    {
    	for (int count2=(10*k)-1; count2>=1*k; count2--)
    	{
    		product= count1*count2;
    		double digits= (Math.log10(n)+1);
    		if (digits%2==0){
    			for (int dig1=digits; dig1>=(digits/2); dig1--){
    				if ((product/Math.pow(10,dig1-1))!=product/Math.pow(10,(digits+1-dig1)))
    			}
    		}
    	}
    }
  }
}