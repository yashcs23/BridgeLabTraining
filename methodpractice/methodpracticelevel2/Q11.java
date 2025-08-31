package methodpracticelevel2;

import java.util.Scanner;

class Q11 {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b*b - 4*a*c;
        if (delta < 0) return new double[]{};
        else if (delta == 0) return new double[]{-b/(2*a)};
        else return new double[]{(-b+Math.sqrt(delta))/(2*a), (-b-Math.sqrt(delta))/(2*a)};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double[] roots = findRoots(a,b,c);
        if (roots.length == 0) System.out.println("No real roots");
        else for (double r : roots) System.out.println("Root: " + r);
    }
}
