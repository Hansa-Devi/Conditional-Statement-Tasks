import javax.xml.bind.Element;
import java.util.Scanner;

public class Program1_CheckPosNeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int no = input.nextInt();
        if (no > 0){
            System.out.println("Positive Number");
        }
        else {
            System.out.println("Negative Number");
        }
    }
}
