import java.util.Scanner;
class NumberCheck{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		if(num<0){
			System.out.print(num+" is a negative number.");
		}else if(num>0){
			System.out.print(num+" is a positive number.");
		}else{
			System.out.print(num+" is a zero.");
		}
	}
}