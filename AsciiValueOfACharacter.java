import java.util.Scanner;
class AsciiValueOfACharacter{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the character : ");
		char ch=sc.next().charAt(0);
		System.out.println("\nAscii Value Of -> "+ch+" is : "+(int)ch);
	}
}