package controlflowpracticelevel1;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 0) {
            int sum1 = i * (i + 1) / 2;
            int sum2 = 0;
            for (int j = 1; j <= i; j++) {
                sum2 += j;
            }
            System.out.println("Formula sum: " + sum1);
            System.out.println("For loop sum: " + sum2);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
