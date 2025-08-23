package controlflowpracticelevel2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        int j = sc.nextInt();
        if (j > 5) {
            double n = i * 0.05;
            System.out.println("Bonus is " + n);
        } else {
            System.out.println("No bonus");
        }
    }
}
