import java.util.Scanner;

public class Program11_nTermsOfNaturalNoAndSum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter n term");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum of first "+n+" natural no:s is: "+sum);
    }
}
