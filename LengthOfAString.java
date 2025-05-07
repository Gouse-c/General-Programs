import java.util.Scanner;
class LengthOfAString{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the string -> ");
		String str=sc.nextLine();
		String str2="";
		int len=str.compareTo(str2);
		System.out.println("\nLength Of -> "+str+" is : "+len);
	}
}