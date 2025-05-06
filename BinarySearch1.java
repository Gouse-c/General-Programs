import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size of array > ");
		int size=sc.nextInt();
		if(size<0){
			System.out.println("\nArray Size Can't Be Negative..!");
			return;
		}
		int a[]=new int[size];
		System.out.println("\nEnter  the array elements > ");
		for(int i=0;i<a.length;++i){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.print("\nResulted Array After Sorting >> ");
		printArray(a);
		System.out.print("\nEnter the element need to be searched > ");
		int element=sc.nextInt();
		int index=binarySearch(a,element);
		if(index!=-1){
			System.out.println("\n"+element+" -> Present At "+index+" Index :)");
		}else{
			System.out.println("\n"+element+" -> Element Not Found In Array..!");
		}
	}
	public static void printArray(int a[]){
		for(int item:a){
			System.out.print(item+" ");
		}
	}
	public static int binarySearch(int a[],int element){
		int start=0,end=a.length-1,mid=-1;
		int index=-1;
		while(start<=end){
			mid=(start+end)/2;
			if(a[mid]==element){
				index=mid;
				return mid;
			}else if(a[mid]<element){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}
		return index;
	}
}