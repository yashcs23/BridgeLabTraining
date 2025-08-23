package controlflowpracticelevel1;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble(); // salary
        int j = sc.nextInt(); // years
        if (j > 5) {
            double bonus = i * 0.05;
            System.out.println("Bonus is " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}
