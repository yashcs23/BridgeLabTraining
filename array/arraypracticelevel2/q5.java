package arraypracticelevel2;

import java.util.Scanner;


class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0, t = n;
        while (t > 0) { t /= 10; c++; }
        int d[] = new int[c];
        for (int i = 0; i < c; i++) {
            d[i] = n % 10;
            n /= 10;
        }
        for (int i = 0; i < c; i++) System.out.print(d[i]);
    }
}
