package controlflowpracticelevel3;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0, t = n;
        while (t != 0) {
            s += t % 10;
            t /= 10;
        }
        if (n % s == 0) System.out.println("Harshad");
        else System.out.println("Not Harshad");
    }
}
