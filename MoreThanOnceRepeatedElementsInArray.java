import java.util.Scanner;
public class MoreThanOnceRepeatedElementsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),arr[]=new int[n];
        boolean[] printed=new boolean[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        for(int i=0;i<n;i++) {
            if(printed[i]) continue;
            int count=1;
            for(int j=i+1;j<n;j++) {
                if(arr[i]==arr[j]) {
                    count++;
                    printed[j]=true;
                }
            }
            if(count>1) {
                System.out.print(arr[i]+" ");
                printed[i]=true;
            }
        }
        sc.close();
    }
}
