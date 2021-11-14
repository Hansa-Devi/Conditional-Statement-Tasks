import java.util.Scanner;

public class Program2_QuadraticEqu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of a");
        double a = in.nextDouble();
        System.out.println("Enter value of b");
        double b = in.nextDouble();
        System.out.println("Enter value of c");
        double c = in.nextDouble();

        double d =( b * b) - (4 * a * c);
        double root1 =0;
        double root2 =0;

        if (d == 0.0){
            System.out.println("Roots are Equal...");
            root1 = -b / (2 * a);
            root2 = -b / (2 * a);
        }
        if (d < 0.0){
            System.out.println("Roots are Imaginary...");
        }
        if (d > 0.0){
            System.out.println("Roots are unequal...");

            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
        }
        System.out.println("Roots of Quadratic Equation are: ");
        System.out.println("Roots 1 : "+root1);
        System.out.println("Roots 2 : "+root2);

    }
}
