import java.util.Scanner;

public class Program15_nTermsOfOddNos {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter no of terms of odd numbers:");
        int terms = ip.nextInt();
        int sum =0;
        for (int i = 1; i <= (terms*2) ; i+=2) {
            System.out.println(i);
            sum +=i;
        }
        System.out.println("Sum of numbers: "+sum);
    }
}
