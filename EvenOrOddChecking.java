import java.util.Scanner;
class EvenOrOddChecking{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(num%2==0){
			System.out.print(num+" is an even number");
		}else{
			System.out.print(num+" is an odd number");
		}
	}
}