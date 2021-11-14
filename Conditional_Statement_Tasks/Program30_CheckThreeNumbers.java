import java.util.Scanner;

public class Program30_CheckThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = input.nextInt();
        System.out.println("Enter 3rd number");
        int num3 = input.nextInt();

        if (num1==num2 && num2==num3)
            System.out.println("All numbers are equal");
        else if (num1!=num2 && num2!=num3 && num3!=num1)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");

    }
}
