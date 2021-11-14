import java.util.Scanner;

public class Program27_CheckPositiveNegativeZero {
    public static void main(String[] args) {
            Scanner ip = new Scanner(System.in);
            System.out.println("Enter Number:");
            int num = ip.nextInt();

            if (num > 0)
                System.out.println(num+" Number is positive");
            else if (num < 0)
                System.out.println(num+" Number is negative");
            else
                System.out.println("It's Zero");
    }
}
