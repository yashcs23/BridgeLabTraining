package controlflowpracticelevel3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean p = true;
        if (n <= 1) p = false;
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    p = false;
                    break;
                }
            }
        }
        if (p) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
