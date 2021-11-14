import java.util.Scanner;

public class Program19_PatternPyramid {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = ip.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println("");

        }
    }
}
