import java.util.Scanner;
import java.util.HashSet;
public class ZeroSumSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0,arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        HashSet<Integer> s=new HashSet<>();
        boolean found=false;
        for(int x:arr){
            sum+=x;
            if(sum==0||s.contains(sum)){
                found=true;
                break;
            }
            s.add(sum);
        }
        System.out.println(found?"Yes":"No");
        sc.close();
    }
}
