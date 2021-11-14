import java.util.Scanner;

public class Program14_TAbleOfNumber {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int tableOf = ip.nextInt();

        System.out.println("Table of "+tableOf+" upto "+tableOf);

        for (int i = 1; i <= tableOf; i++) {
            System.out.println(tableOf + " X "+i+" = "+ (i*tableOf));
        }
    }
}
