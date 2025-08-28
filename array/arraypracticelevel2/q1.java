package arraypracticelevel2;

import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s[] = new double[10];
        double y[] = new double[10];
        double b[] = new double[10];
        double ns[] = new double[10];
        double tb = 0, to = 0, tn = 0;
        for (int i = 0; i < 10; i++) {
            double sa = sc.nextDouble();
            double yr = sc.nextDouble();
            if (sa <= 0 || yr < 0) { i--; continue; }
            s[i] = sa;
            y[i] = yr;
        }
        for (int i = 0; i < 10; i++) {
            if (y[i] > 5) b[i] = s[i] * 0.05;
            else b[i] = s[i] * 0.02;
            ns[i] = s[i] + b[i];
            tb += b[i]; to += s[i]; tn += ns[i];
        }
        System.out.println("Total Bonus: " + tb);
        System.out.println("Total Old Salary: " + to);
        System.out.println("Total New Salary: " + tn);
    }
}
