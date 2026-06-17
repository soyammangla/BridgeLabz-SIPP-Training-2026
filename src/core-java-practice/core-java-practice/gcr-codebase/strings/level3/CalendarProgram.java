import java.util.*;

public class CalendarProgram {

    static String[] months = {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
    };

    static int[] daysInMonth = {
            31,28,31,30,31,30,31,31,30,31,30,31
    };

    // Leap year check
    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Get first day of month using formula
    static int getFirstDay(int d, int m, int y) {

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int days = daysInMonth[month - 1];

        if (month == 2 && isLeapYear(year)) {
            days = 29;
        }

        System.out.println("\n     " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getFirstDay(1, month, year);

        // indentation
        for (int i = 0; i < startDay; i++) {
            System.out.printf("    ");
        }

        // print days
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);

            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
    }
}