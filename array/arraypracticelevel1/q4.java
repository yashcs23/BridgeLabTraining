package arraypracticelevel1;

import java.util.Scanner;


class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a[] = new double[10];
        double s = 0.0;
        int i = 0;
        while (true) {
            double b = sc.nextDouble();
            if (b <= 0 || i == 10) break;
            a[i] = b;
            i++;
        }
        for (int j = 0; j < i; j++) {
            s += a[j];
            System.out.println("Value: " + a[j]);
        }
        System.out.println("Sum = " + s);
    }
}
