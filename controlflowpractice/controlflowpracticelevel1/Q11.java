package controlflowpracticelevel1;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        while (true) {
            double i = sc.nextDouble();
            if (i <= 0) break;
            sum += i;
        }
        System.out.println("Total sum is " + sum);
    }
}
