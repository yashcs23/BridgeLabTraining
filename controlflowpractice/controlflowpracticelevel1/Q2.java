package controlflowpracticelevel1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int n = sc.nextInt();
        boolean res = (i < j && i < n);
        System.out.println("Is the first number the smallest? " + res);
    }
}
