import java.util.Scanner;

public class Program28_ReadFloatingNumCheckPosNeg {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter Number:");
        double num = ip.nextDouble();

        if (num > 0){
            if (num < 1)
                System.out.println(num+" Small Positive Number");
            else if (num > 1000000)
                System.out.println(num+" Large Positive Number");
            else
                System.out.println("Positive Number");
        }
        else if (num < 0){
            if (Math.abs(num) < 1)
                System.out.println(num+" Small Negative Number");
            else if (Math.abs(num) > 1000000)
                System.out.println(num+" Large Negative number");
            else
                System.out.println("Negative Number");
        }
        else {
            System.out.println(num+" Number is Zero");
        }
    }
}
