import java.util.Scanner;
class FrequencyOfXInArray{
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
		System.out.print("\nEnter 'X' -> ");
		int x=sc.nextInt();
		boolean found=false;
		for(int i=0;i<a.length;++i){
			if(x==a[i]){
				System.out.println("\n"+x+" -> Found At "+i+" : index.");
				found=true;
			}
		}
		if(!found){
			System.out.println("\n"+x+" -> Not Found In Array..!");
			return;
		}
	}
}