package controlflowpracticelevel1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 0) {
            int sum = i * (i + 1) / 2;
            System.out.println("The sum of " + i + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + i + " is not a natural number");
        }
    }
}
