import java.util.Scanner;

public class Program5_WeekDay {
    public static void weekDay(int num) {
        String dayOfWeek = "";
        switch (num) {
            case 1 : dayOfWeek = "Monday";break;
            case 2 : dayOfWeek = "Tuesday";break;
            case 3 : dayOfWeek = "Wednesday";break;
            case 4 : dayOfWeek = "Thursday";break;
            case 5 : dayOfWeek = "Friday";break;
            case 6 : dayOfWeek = "Saturday";break;
            case 7 : dayOfWeek = "Sunday";break;
            default: dayOfWeek = "Invalid day";
        }
        System.out.println(dayOfWeek);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int day = input.nextInt();
        weekDay(day);

    }
}
