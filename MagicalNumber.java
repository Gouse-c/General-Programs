import java.util.Scanner;
import java.util.Arrays;
class MagicalNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");
		int size=sc.nextInt();
		if(size<0){
			System.out.println("\nInvalid Size..!");
			return;
		}
		int a[]=new int[size];
		System.out.println("\nEnter the elements : ");
		for(int i=0;i<a.length;++i){
			a[i]=sc.nextInt();
		}
		System.out.print("\nResulted Array -> ");
		for(int item:a){
			System.out.print(item+" ");
		}
		int res[]=a.clone();
		Arrays.sort(res);
		int goodNumber=0,badNumber=0;
		for(int i=0;i<a.length;++i){
			if(a[i]==res[i]){
				goodNumber+=a[i];
			}else{
				badNumber+=a[i];
			}
		}
		System.out.println("\nMagical Number -> "+(Math.abs(goodNumber-badNumber)));
	}
}