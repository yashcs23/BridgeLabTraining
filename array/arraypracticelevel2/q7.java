package arraypracticelevel2;

import java.util.Scanner;


class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double p[][] = new double[n][3];
        String st[] = new String[n];
        for (int i = 0; i < n; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            if (w <= 0 || h <= 0) { i--; continue; }
            p[i][0] = w; p[i][1] = h;
            p[i][2] = w / (h * h);
            if (p[i][2] < 18.5) st[i] = "Underweight";
            else if (p[i][2] < 25) st[i] = "Normal";
            else if (p[i][2] < 30) st[i] = "Overweight";
            else st[i] = "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("H:" + p[i][1] + " W:" + p[i][0] + " BMI:" + p[i][2] + " Status:" + st[i]);
        }
    }
}
