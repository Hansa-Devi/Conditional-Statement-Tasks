import java.util.Scanner;

public class Program17_PatternRepeatNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no: ");
        int no = input.nextInt();
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
