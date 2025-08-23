package controlflowpracticelevel1;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i >= 0) {
            int fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            System.out.println("Factorial is " + fact);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
