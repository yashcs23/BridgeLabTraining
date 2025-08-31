package methodpracticelevel3;

import java.util.Scanner;


class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = sc.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = sc.nextDouble();
        sc.close();

        System.out.println("Are points collinear using slope formula? " + isCollinearBySlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Are points collinear using area of triangle formula? " + isCollinearByArea(x1, y1, x2, y2, x3, y3));
    }

    public static boolean isCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slope1 = (y2 - y1) / (x2 - x1);
        double slope2 = (y3 - y2) / (x3 - x2);
        double slope3 = (y3 - y1) / (x3 - x1);
        return slope1 == slope2 && slope2 == slope3;
    }

    public static boolean isCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}
