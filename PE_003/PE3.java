/** Author: John Taylor
*   Title: PE3
*   Purpose: Finds the largest prime factor of any given whole number
*   Date: 11/15/15
*/
 
import java.util.Scanner;

public class PE3
{
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		long factor=0;
		
		System.out.println("This program will give you the largest prime factor of any given whole number.");
		System.out.print("Enter the number (whole): ");
		long num= kboard.nextLong();
		
		for (long count1=1; count1<=(num/2); count1++){
			if((num%count1 )==0){
				factor= num/count1;
				search:
				while(1==1){
					if((factor%2)==0 && factor!=2){ //Even number but not 2
						break;
					}
					if (factor==2){ //Is 2
						count1+=num;
						break;
					}
					else{ //Checks primality for odds
						for (long count2=3; (count2*count2)<=factor; count2+=2){
							if((factor%count2)==0){
								break search;
							}
						}
						count1+=num;
					}
					break;
				}
			}
		}
		System.out.println("The factor is: "+factor);
	}
}