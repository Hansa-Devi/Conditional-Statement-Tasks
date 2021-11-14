import java.util.Scanner;

public class Program13_CubeOfNumber {
    public static void main(String[] args) {

        Scanner ip =new Scanner(System.in);
        System.out.println("Enter no of terms:");
        int term = ip.nextInt();
        int i;

        for (i = 1; i <=term ; i++) {
            System.out.println("Cuber of "+i+" is "+ Math.pow(i,3));
        }

    }
}
