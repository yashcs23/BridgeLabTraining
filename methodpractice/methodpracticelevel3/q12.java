package methodpracticelevel3;

import java.util.Scanner;


class q12 {
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
        sc.close();

        double distance = findEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        if (lineEquation != null) {
            double m = lineEquation[0];
            double b = lineEquation[1];
            System.out.println("Equation of the line: y = " + m + "x + " + b);
        } else {
            System.out.println("Cannot find line equation (vertical line)");
        }
    }

    public static double findEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            return null;
        }
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
}
