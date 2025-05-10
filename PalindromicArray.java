import java.util.Scanner;
class PalindromicArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size of array > ");
		int size=sc.nextInt();
		if(size<0){
			System.out.println("\nInvalid Size..!");
			return;
		}
		int a[]=new int[size];
		System.out.println("\nEnter the elements >");
		for(int i=0;i<a.length;++i){
			a[i]=sc.nextInt();
		}
		System.out.print("\nResulted Array >> ");
		for(int item:a){
			System.out.print(item+" ");
		}
		boolean found=true;
		for(int i=0;i<a.length;++i){
			if(!isPalindromicNum(a[i])){
				found=false;
				break;
			}
		}
		if(!found){
			System.out.println("\nResulted Array Is Not Palindromic..!");
		}else{
			System.out.println("\nResulted Array Is Palindromic :)");
		}
	}
	public static boolean isPalindromicNum(int num){
		String temp=Integer.toString(num);
		temp=new StringBuffer(temp).reverse().toString();
		int reversed=Integer.parseInt(temp);
		if(num==reversed){
			return true;
		}
		return false;
	}
}