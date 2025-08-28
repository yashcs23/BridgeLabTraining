package arraypracticelevel1;

import java.util.Scanner;


class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a[] = new double[11];
        double s = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
            s += a[i];
        }
        double m = s / 11.0;
        System.out.println("Mean height = " + m);
    }
}
