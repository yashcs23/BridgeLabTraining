package controlflowpracticelevel1;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 0) {
            int sum1 = i * (i + 1) / 2;
            int sum2 = 0, j = 1;
            while (j <= i) {
                sum2 += j;
                j++;
            }
            System.out.println("Formula sum: " + sum1);
            System.out.println("While loop sum: " + sum2);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
