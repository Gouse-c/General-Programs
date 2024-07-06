package normalprograms;

import java.util.Scanner;

public class PalindromeNumberblwStartAndEndPoints {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start Point :");
		int start=sc.nextInt();
		System.out.println("Enter the End Point :");
		int end=sc.nextInt();
		if(start>end) {
			System.out.println("Start must be Less Than End Point");
			return;
		}
		for(int i=start;i<=end;i++)
		{
			if(isPalindrome(i))
			{
				System.out.println(i+" ");
			}
		}
	}
	public static boolean isPalindrome(int num) {
		int orgNum=num;
		int revNum=0;
		while(num!=0)
		{
			int digit=num%10;
			revNum=(revNum*10)+digit;
			num=num/10;
		}
		return orgNum==revNum;
	}
}
