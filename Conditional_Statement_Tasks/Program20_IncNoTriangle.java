import java.util.Scanner;

public class Program20_IncNoTriangle {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = ip.nextInt();
        int count =1;
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
