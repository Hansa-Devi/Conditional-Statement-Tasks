import java.util.Scanner;

public class Program7_NoOfDaysInMonth {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter Year:");
        int year = ip.nextInt();
        System.out.println("Enter Month No:");
        int month = ip.nextInt();

        int noOfDays =0;
        String monthName = "Unknown";

        switch (month){
            case 1:
                noOfDays=31;
                monthName="January";
                break;

            case 2:
                monthName ="February";
                if ((year % 4 == 0)) {
                    noOfDays = 29;
                } else {
                    noOfDays = 28;
                }
                break;

            case 3:
                monthName = "March";
                noOfDays = 31;
                break;

            case 4:
                monthName = "April";
                noOfDays = 30;
                break;

            case 5:
                monthName = "May";
                noOfDays = 31;
                break;

            case 6:
                monthName = "June";
                noOfDays = 30;
                break;

            case 7:
                monthName = "July";
                noOfDays = 31;
                break;

            case 8:
                monthName = "August";
                noOfDays = 31;
                break;

            case 9:
                monthName = "September";
                noOfDays = 30;
                break;

            case 10:
                monthName = "October";
                noOfDays = 31;
                break;

            case 11:
                monthName = "November";
                noOfDays = 30;
                break;

            case 12:
                monthName = "December";
                noOfDays = 31;
                break;

            default:
                System.out.println("Invalid year or month");
                break;

        }
        System.out.println(monthName +" "+year+" has "+noOfDays+" days. " );

        }

    }

