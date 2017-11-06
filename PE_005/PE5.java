/**	Author: John Taylor
*	Title of Assignment: PE5
*	Purpose: 
*	Due Date: 11/18/15
*/

import java.util.Scanner;

public class PE5
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);
	boolean isDivisible= true;
	int check=0;
    
    System.out.println(" ");
    System.out.print("num: ");
    long num = kboard.nextInt();

    for (long count1=1; count1<=390700800; count1++)
    {
    	for(long count2=num; count2>num/2; count2--){
			if(count1%count2==0){
				check++;
			}
		}
		if(check==(int)(num-(num/2))){
			System.out.println(count1);
			break;
		}
		else{
			check=0;
		}
	}
  }
}