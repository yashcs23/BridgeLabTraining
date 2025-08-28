package arraypracticelevel1;

import java.util.Scanner;


class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b[] = new int[4];
        for (int i = 6; i <= 9; i++) {
            b[i - 6] = a * i;
        }
        for (int i = 6; i <= 9; i++) {
            System.out.println(a + " * " + i + " = " + b[i - 6]);
        }
    }
}
