package arraypracticelevel1;

import java.util.Scanner;


class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b[] = new int[10];
        for (int i = 1; i <= 10; i++) {
            b[i - 1] = a * i;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + b[i - 1]);
        }
    }
}
