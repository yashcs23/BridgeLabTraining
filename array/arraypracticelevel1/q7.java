package arraypracticelevel1;

import java.util.Scanner;


class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int e[] = new int[a / 2 + 1];
        int o[] = new int[a / 2 + 1];
        int ei = 0, oi = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) e[ei++] = i;
            else o[oi++] = i;
        }
        System.out.print("Even: ");
        for (int i = 0; i < ei; i++) System.out.print(e[i] + " ");
        System.out.println();
        System.out.print("Odd: ");
        for (int i = 0; i < oi; i++) System.out.print(o[i] + " ");
    }
}
