package controlflowpracticelevel2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int g = 1;
        for (int j = i - 1; j >= 1; j--) {
            if (i % j == 0) {
                g = j;
                break;
            }
        }
        System.out.println(g);
    }
}
