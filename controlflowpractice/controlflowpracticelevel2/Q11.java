package controlflowpracticelevel2;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 0 && i < 100) {
            for (int j = 100; j >= 1; j--) {
                if (j % i == 0) System.out.println(j);
            }
        } else {
            System.out.println("Not valid");
        }
    }
}
