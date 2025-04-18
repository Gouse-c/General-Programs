import java.util.Scanner;
import java.util.Arrays;
public class UniqueElementInArray{
	public static void main(String args[]){
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the size of array : ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("\nEnter the elements into array : ");
			takeInput(arr,sc);
			System.out.println("\nResulted Array : "+Arrays.toString(arr));
			int uniquElement = findUniqueElement(arr);
			System.out.println("\nUnique Element : "+uniquElement);
		}
	}
	public static void takeInput(int arr[],Scanner sc){
		for(int i=0;i<arr.length;++i){
			arr[i] = sc.nextInt();
		}
	}
	public static int findUniqueElement(int arr[]){
		int unique = 0;
		for(int item : arr){
			unique ^= item;
		}
		return unique;
	}
}