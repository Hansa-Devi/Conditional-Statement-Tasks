import java.util.Locale;
import java.util.Scanner;

public class Program8_VowelConsonant {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        String c = ip.next().toLowerCase();

        boolean uppercase = c.charAt(0) >= 65 && c.charAt(0) <=90;
        boolean lowercase = c.charAt(0) >= 97 && c.charAt(0) <=122;
        boolean vowels = c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u");

        if (c.length() > 1){
            System.out.println("Error. Not a single character");
        }
        else if (!(uppercase || lowercase)) {
            System.out.println("Error. Not a letter.Enter any alphabet");
        }
        else if (vowels){
            System.out.println("Input letter is Vowel");
        }
        else {
            System.out.println("Input letter is Consonant");
        }


    }
}
