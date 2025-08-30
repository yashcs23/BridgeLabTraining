package stringpracticelevel3;

import java.util.Scanner;

class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean isLeap = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        if (isLeap) {
            daysInMonth[2] = 29;
        }
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        
        System.out.println("\n\t" + monthNames[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < d0; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= daysInMonth[month]; i++) {
            System.out.printf("%3d ", i);
            if (((i + d0) % 7 == 0) || i == daysInMonth[month]) {
                System.out.println();
            }
        }
    }
}
