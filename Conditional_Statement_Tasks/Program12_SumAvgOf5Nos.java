import java.util.Scanner;

public class Program12_SumAvgOf5Nos {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int no1 = ip.nextInt();
        System.out.println("Enter 2nd number:");
        int no2 = ip.nextInt();
        System.out.println("Enter 3rd number:");
        int no3 = ip.nextInt();
        System.out.println("Enter 4th number:");
        int no4 = ip.nextInt();
        System.out.println("Enter 5th number:");
        int no5 = ip.nextInt();

        int sum = no1+no2+no3+no4+no5;
        int avg = sum/5;

        System.out.println("Numbers: "+no1+" "+no2+" "+no3+" "+no4+" "+no5);
        System.out.println("Sum is : "+sum);
        System.out.println("Avg is : "+avg);

    }
}
