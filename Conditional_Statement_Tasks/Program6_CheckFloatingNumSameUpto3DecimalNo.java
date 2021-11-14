import java.util.Scanner;

public class Program6_CheckFloatingNumSameUpto3DecimalNo {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter decimal number1");
        double num1 = ip.nextDouble();
        System.out.println("Enter decimal number2");
        double num2 = ip.nextDouble();

        int n1 = (int) (num1* 1000);
        int n2 = (int) (num2 * 1000);
        if (n1 == n2){
            System.out.println("numbers are same");
        }
        else {
            System.out.println("numbers are different");
        }
    }
}
