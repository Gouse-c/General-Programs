import java.util.Scanner;
class ReverseArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter the size of array..");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array Elements..");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in the array was: ");
		for(int i=n-1;i>=0;--i)
		{
			System.out.println(a[i]);
		}
	}
}
		