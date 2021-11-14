import java.util.Scanner;

public class Program3_GreatestNoFrom3No {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = in.nextInt();
        System.out.println("Enter second number:");
        int num2 = in.nextInt();
        System.out.println("Enter third number:");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("Greatest Number is : "+num1);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println("Greatest Number is : "+num2);
        }
        else {
            System.out.println( "Greatest Number is : "+num3);
        }
    }
}
