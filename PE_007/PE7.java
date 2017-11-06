/** Author: John Taylor
*   Title: PE7
*   Purpose: Finds the largest prime factor of any given whole number
*   Date: 12/2/15
*/
 
import java.util.Scanner;

public class PE7
{
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int answer= 0;
		
		System.out.println("This program will find the nth prime");
		System.out.print("Enter n: ");
		int n= kboard.nextInt();
		while(n!=0){
			for (int count1=(2*n)-1; count1>0; count1++){
				search:
				while(1==1){
					if((count1%2)==0 && count1!=2){ //Even number but not 2
						n-=1;
						break;
					}
					if (count1==2){ //Is 2
						break;
					}
					else{ //Checks primality for odds
						for (int count2=3; (count2*count2)<=count1; count2+=2){
							if((count1%count2)==0){
								break search;
							}
						}
						n-=1;
					}
					break;
				}
			}
		}
		System.out.println("The number is: "+ count1);
	}
}