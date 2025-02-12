import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int squ = num*num;
        int sum = 0;
        while (squ != 0) {
            sum=sum +squ%10;
            squ =squ/10;
        }
        if (sum == num) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not Neon Number");
        }
    }
}