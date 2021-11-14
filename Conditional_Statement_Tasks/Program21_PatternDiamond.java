import java.util.Scanner;

public class Program21_PatternDiamond {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = ip.nextInt();
        row*=2;
        for (int i = 1; i <= (row) ; i+=2) {
            for (int j = row; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i  ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }


        for (int i = 2; i <= (row) ; i+=2) {
        System.out.print("  ");

            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = row-2; j >=i ; j--) {
                System.out.print("*"+" ");
            }

            System.out.println("");
        }


    }
}
