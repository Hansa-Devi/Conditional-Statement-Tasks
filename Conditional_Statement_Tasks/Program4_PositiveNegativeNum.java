import java.util.Scanner;

public class Program4_PositiveNegativeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        double num1 = in.nextDouble();

        if (num1 > 0){
            if (num1 < 1){
                System.out.println("Positive small number");
            }
            else if (num1 > 1000000){
                System.out.println("Positive Larger Number");
            }
            else {
                System.out.println("Positive Number");
            }
        }

        if (num1 < 0){
            if (Math.abs(num1) < 1){
                System.out.println("Negative small Number");
            }
            else if (Math.abs(num1) > 1000000){
                System.out.println("Negative large Number");
            }
            else {
                System.out.println("Negative Number");
            }
        }


    }
}
