import java.util.Scanner;
class OutOfLimitException extends Exception
{
	public OutOfLimitException(String msg)
	{
		super(msg);
	}
}
class TableCheck
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter the table number : ");
			int t=sc.nextInt();
			System.out.println("Enter the start point : ");
			int a=sc.nextInt();
			System.out.println("Enter the end point : ");
			int n=sc.nextInt();
			System.out.println("\nThe Table are : ");
			try
			{
			if(t>=2 && t<=20)
			{
				for(int i=a;i<=n;i++)
				{
					System.out.println(t +" x "+ i +" = "+ t*i );
				}
			}
			else
			{
				throw new OutOfLimitException("You have entered a wrong number..");
			}
			}
			catch(OutOfLimitException oe)
			{
				System.out.println(oe.getMessage());
			}
	}
}