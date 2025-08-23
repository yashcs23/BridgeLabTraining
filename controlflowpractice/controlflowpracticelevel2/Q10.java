package controlflowpracticelevel2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int g = 1;
        int j = i - 1;
        while (j >= 1) {
            if (i % j == 0) {
                g = j;
                break;
            }
            j--;
        }
        System.out.println(g);
    }
}
