import java.util.Scanner;

public class Program22_PascalTriangle {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = ip.nextInt();
        int space = row;
        int number =1;

        for (int i = 0; i <row; i++) {
            for (int j = 1; j <row-i ; j++) {
                System.out.print(" ");
            }
            number=1;
            for (int j =0 ; j <=i; j++) {
                System.out.print(number+" ");
                number = number * (i-j)/(j+1);
            }
//            space--;
            System.out.println();
        }

    }
}
