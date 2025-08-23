package controlflowpracticelevel3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n, s = 0;
        while (t != 0) {
            int d = t % 10;
            s += d * d * d;
            t /= 10;
        }
        if (s == n) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}
