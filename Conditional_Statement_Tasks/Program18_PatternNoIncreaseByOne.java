import java.util.Scanner;

public class Program18_PatternNoIncreaseByOne {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        System.out.println("Enter no of rows");
        int num = ip.nextInt();
        int k =1;
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(k++ +" ");
            }
            System.out.println("");
        }
    }
}
