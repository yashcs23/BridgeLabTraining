package controlflowpracticelevel2;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int p = sc.nextInt();
        if (i > 0 && p >= 0) {
            int r = 1;
            for (int j = 1; j <= p; j++) {
                r *= i;
            }
            System.out.println(r);
        } else {
            System.out.println("Not valid");
        }
    }
}
