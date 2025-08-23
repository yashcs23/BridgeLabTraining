package controlflowpracticelevel2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 0) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) System.out.println(j);
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}
