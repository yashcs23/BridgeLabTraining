package controlflowpracticelevel1;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        System.out.println("Launch!");
    }
}
