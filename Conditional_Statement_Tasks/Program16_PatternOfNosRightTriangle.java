import java.util.Scanner;

public class Program16_PatternOfNosRightTriangle {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int no = ip.nextInt();
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
