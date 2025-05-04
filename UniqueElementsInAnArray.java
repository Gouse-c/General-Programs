import java.util.Scanner;
public class UniqueElementsInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println("Unique elements:");
        for(int i=0;i<n;i++) {
            boolean unique=true;
            for(int j=0;j<n;j++) {
                if(i!=j && arr[i]==arr[j]) {
                    unique=false;
                    break;
                }
            }
            if(unique) System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
