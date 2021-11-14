import java.util.Scanner;

public class Program31_Check3NoIncDesOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = input.nextInt();
        System.out.println("Enter 3rd number");
        int num3 = input.nextInt();

        if (num1<num2 && num2<num3)
            System.out.println("Increasing");
        else if (num1>num2 && num2>num3)
            System.out.println("Decreasing");
        else
            System.out.println("Neither increasing or decreasing order");

    }
}
