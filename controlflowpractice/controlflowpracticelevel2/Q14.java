package controlflowpracticelevel2;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int p = sc.nextInt();
        int r = 1;
        int c = 0;
        while (c < p) {
            r *= i;
            c++;
        }
        System.out.println(r);
    }
}
