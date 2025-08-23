package controlflowpracticelevel1;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i >= 0) {
            int fact = 1;
            int j = 1;
            while (j <= i) {
                fact *= j;
                j++;
            }
            System.out.println("Factorial is " + fact);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
