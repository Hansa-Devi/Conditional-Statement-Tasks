import java.util.Scanner;

public class Program29_CountNoOfDigits {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter number:");
        long num1 = ip.nextLong();
        long num = num1;
        int count =0;

        if (num >= 10000000000L)
        {
            System.out.println("Number is greater or equals 10,000,000,000!");
        }
        else {

        while (num > 0) {
            num = num / 10;
            count++;
        }
            System.out.println(num1+ " No of Digits: "+count);
        }
    }
}
